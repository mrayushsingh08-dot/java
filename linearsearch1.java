public class linearsearch1 {
    public static void main(String[] args) {
    String name = "ayush";
    char target = 's';
    System.out.println(search(name,target));
    }
    static boolean search (String str, char target){
    if(str.length()==0){
        return false;
    }
    for(int i = 0 ;i < str.length() ;i++){
        char element = str.charAt(i);
        if(element == target){
            System.out.println(i); 
            return true ;
        }
    }
    return false;
}
}