import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Associate[] arr=new Associate[5];
        for(int i=0;i<5;i++){
            String b=in.nextLine();
            int a=in.nextInt();in.nextLine();
            String c=in.nextLine();
            int d=in.nextInt();in.nextLine();
            arr[i]=new Associate(b,a,c,d);
        }
        String techy=in.nextLine();
        Associate arr2[]=associateForgiventechnology(techy, arr);
        //Arrays.sort(arr2);
        for(Associate i:arr2){
            System.out.println(i.getAssociateId());
        }
    }
    public static Associate[] associateForgiventechnology(String techy,Associate[] arr){
        Associate arr2[]=new Associate[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getTechnology().equalsIgnoreCase(techy) && arr[i].getExperienceInYears()%5==0){
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        return arr2;
    }
}
