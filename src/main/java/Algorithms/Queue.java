package Algorithms;

public class Queue {
     /*Классическая Queue - реализовать используя массив (Array)

   empty — проверка очереди на наличие в ней элементов,
   push — операция вставки нового элемента,
   pop — операция удаления нового элемента,
   size — операция получения количества элементов в очереди.

   arr;             // массив для хранения элементов queue
   head;         // head указывает на первый элемент в queue
   tail;            // tail часть указывает на последний элемент в queue
   capacity;   // максимальная емкость queue
   count;        // текущий размер queue*/

    private int[] arr;
    private int head;
    private int tail;
    private int capacity;
    private int count;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.head = capacity - 1;
        this.tail = capacity - 1;
        this.count = 0;
    }


    public void shift(){
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
    }


    public void growSize() {
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;

//        this.stack = newArr;

    }


    public boolean empty() {
        return count == capacity;
    }

//    public boolean full(){
//        return count == capacity;
//    }

    public void push(int item) {

        if (count == capacity) {
            growSize();
            for (int i = 0; i < capacity / 2; i++) {
                tail++;
                head++;
                shift();
            }
        }
        arr[tail--] = item;
        count++;
    }

    public Integer pop(){
        if (!empty()) {
            count--;

            int tmp = arr[head--];
            shift();
            tail++;
            head++;
            return tmp;
        }

//        if (tail == -1 && head == -1)
        return null;
    }

    public int size(){
        return count;
    }


    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.push(2);
        queue.push(6);
        queue.push(4);
        queue.push(4);

        System.out.println("first "+queue.size());


//        while (!queue.empty()){
//            System.out.println(queue.pop());
//        }





//        System.out.println("second "+queue.size());

        queue.push(2);
        queue.push(4);
        queue.push(4);

        while (!queue.empty()){
            System.out.println(queue.pop());
        }

        queue.push(2);
        queue.push(4);
        queue.push(4);

        System.out.println("Third "+queue.size());

        while (!queue.empty()){
            System.out.println(queue.pop());
        }



    }
}
