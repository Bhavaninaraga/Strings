public class Strings {
    public static void main(String[] args) {
        String str1="Geeks";
        String str2="Geeks";
        int comparison=str1.compareTo(str2);
        if(comparison<0){
            System.out.println(str1+"comes before"+str2);
        }else if(comparison>0){;
        System.out.println(str1+"comes after"+str2);
        }else{
            System.out.println(str1+"and"+str2+"are equal");
        }
    }
    
}
