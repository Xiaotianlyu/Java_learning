package Communication;

/**
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产
 * 品，店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的
 * 产品，店员会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生
 * 产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通
 * 知消费者来取走产品。
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer producer1 = new Producer(clerk);
        Customer customer1 = new Customer(clerk);

        producer1.setName("生产者1");
        customer1.setName("消费者1");

        producer1.start();
        customer1.start();

    }
}

class Producer extends Thread {//生产者

    private Clerk clerk;

    public Producer(Clerk clerk) {//用生产者的构造器将产品数量传进去
        this.clerk = clerk;
    }

    @Override
    public void run() {

        while (true){
            System.out.println("生产者开始生产商品。。。");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.addProduct();
        }

    }
}

class Customer extends Thread {//消费者

    private Clerk clerk;

    public Customer(Clerk clerk) {//用消费者的构造器将产品数量传进去
        this.clerk = clerk;
    }

    @Override
    public void run() {

        while (true){
            System.out.println("消费者开始消费商品。。。");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            clerk.minusProduct();
        }

    }
}

class Clerk {//营业员（仓库）
    private int productAmount = 0;//产品的数量

    //属性都用方法来改  增加产品的方法
    public synchronized void addProduct() {//此时同步监视器：当前类本身***.class

        if (productAmount >= 20) {
            //等待
            try {
                wait(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        productAmount++;
        System.out.println(Thread.currentThread().getName() + "生产了第" + productAmount + "件产品");

        notify();
    }

    //属性都用方法来改  消耗产品的方法
    public synchronized void minusProduct() {//此时同步监视器：当前类本身***.class

        if (productAmount <= 0){

            try {
                wait(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println(Thread.currentThread().getName() + "消耗了第" + productAmount + "件产品");
        productAmount--;

        notify();
    }

}