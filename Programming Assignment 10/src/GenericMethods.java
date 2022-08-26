public class GenericMethods <GenericMethodsInterface>{
    
   	public static <AnyType extends Comparable<AnyType>> int binarySearch(AnyType[] a, AnyType x){
                      for (int i =0; i<a.length; i++){
                   
                 if(a[i].compareTo(x) == 0){
                   return i; 
                    
                 }
    
                }
            return -1;
        
    }
	public static <AnyType extends Comparable<AnyType>> int linearSearch(AnyType[] a, AnyType x){
        return -1;
    }
    
    
    
    
    
    
    
    
    //public static int linearSearch( AnyType[]a, Integer x){
        
        
             //   for (int i =0; i<a.length; i++){
                   
                // if(a[i].compareTo(x) == 0){
                //   return i; 
                    
                // }
    
             //   }
          //  return -1;
        
        
   // }
    
   // public int compareTo(){
        
   // }
    
   // public static int binarySearch(AnyType[]a, Integer x){
        
      
   // }
    
}