public class onee {
    public static void main(String args[]){
        int target = 256;
        int root =0;

        for (int i= 0;i<=target/2;i++){
            if(i*i<=target){
                root=i;                      // linear search
            }

        }
        System.out.println(root);
}
}
