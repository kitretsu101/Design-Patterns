// public class singleton {                     //this is eager
//     private static final singleton INSTANCE = new singleton();

//     private singleton(){

//     }

//     public static singleton getInstance(){
//         return INSTANCE;
//     }
// }

// public class singleton{                  //this is lazy

//     private singleton(){

//     }

//     private static volatile singleton instance;

//     public static singleton getInstance(){
//         if (instance==null) {
//             synchronized (singleton.class) {
//                 if (instance==null) {
//                     instance= new singleton();
//                 }
//             }
//         }
//         return instance; 
//     }
// }