public class ReverseTheLLAtGivenIndexes {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList(1);
        mylist.append(2);
       /* mylist.append(3);
        mylist.append(4);
        mylist.append(5);*/
        int left = 1;
        int right = 2;
        if (left==right) return;
        LinkedList.Node start = mylist.head;

        for (int i=1; i<left-1; i++){
            start = start.next;
        }
        LinkedList.Node end = start;

        for (int i=0; i<=right-left+1; i++){
            if (end==null){
                end = null;
                break;
            }
            end = end.next;
        }

        System.out.println(start.value);
        System.out.println(end.value);
    }
}
