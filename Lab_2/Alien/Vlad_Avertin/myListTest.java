


public class myListTest {
    public static void main(String[] args) throws Exception {
        myList testList = new myList();             
        testList.add(5);                            
        testList.add(10);
        testList.add(15);
        testList.add(20);
        testList.add(25);
        testList.addLast(2);                

        System.out.print("Тестовый список: ");
        System.out.println(testList);        
        myList copy = new myList(testList);  
        System.out.print("Копия тестового списка: ");
        System.out.println(copy);            

        testList.removeFirst();              

        System.out.print("Тестовый список, после удаления первого элемента: ");
        System.out.println(testList);        
        System.out.print("Копия списка для сравнения: ");
        System.out.println(copy);            

        testList.removeAtValue(10);    
        System.out.print("Тестовый список, после удаления элемента по значению(10): ");
        System.out.println(testList);  

        System.out.println("Длина тестового списка: " + testList.getLength());    
        System.out.println("Длина копии: " + copy.getLength());
        testList.clear();                                                       

        
    }
}
