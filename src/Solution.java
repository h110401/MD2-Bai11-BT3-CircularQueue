public class Solution {

    Queue queue = new Queue();

    public void enQueue(int value) {
        Node temp = new Node(value);
        if (queue.front == null) {
            queue.front = queue.rear = temp;
            queue.rear.link = queue.front;
        } else {
            queue.rear.link = temp;
            temp.link = queue.front;
            queue.rear = temp;
        }
    }

    public int deQueue() {
        Node temp;
        if (queue.front == null) {
            throw new NullPointerException("Queue is empty");
        } else {
            temp = queue.front;
            if (queue.front.equals(queue.rear)) {
                queue.front = queue.rear = null;
            } else {
                queue.rear.link = queue.front.link;
                queue.front = queue.front.link;
            }
            return temp.data;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.enQueue(1);
        solution.enQueue(2);
        solution.enQueue(3);
        solution.enQueue(4);
        solution.enQueue(5);

        System.out.println(solution.deQueue());
        System.out.println(solution.deQueue());
        System.out.println(solution.deQueue());
        System.out.println(solution.deQueue());
        System.out.println(solution.deQueue());
        System.out.println(solution.deQueue());

    }
}
