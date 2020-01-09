import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author： Administrator
 * @create： 2020-01-09 16:08
 * 说明：输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class PrintListFromTailToHead {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = PrintListFromTailToHead.printListFromTailToHead1(listNode1);
        System.out.println(arrayList.toString());
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode listNode1 = new ListNode(-1);
        int count = 1;
        while (listNode != null) {
            if (listNode1.val == -1) {
                listNode1.val = listNode.val;
                listNode1.next = null;
            } else {
                ListNode listNode2 = listNode1;
                while (count > 0) {
                    listNode1.next = listNode2;
                    count--;
                }
                listNode1.val = listNode.val;
            }

            System.out.println(listNode1.val);

            listNode = listNode.next;

        }
        while (listNode1 != null) {
            arrayList.add(listNode1.val);
            listNode1 = listNode1.next;
        }
        return arrayList;
    }
}

class ListNode {
    public int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}