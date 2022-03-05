//On my honor, I have neither received nor given any unauthorized assistance on Midterm Exam.-Faniz Eliasvand

public class ObjectMergeSorter {

    public static void main(String[] args) {

        Student[] data = new Student[9];

        data[0] = new Student("John", "Smith", 610555739);
        data[1] = new Student("Sarah", "Barnes", 215555382);
        data[2] = new Student("Mark", "Riley", 733555382);
        data[3] = new Student("Laura", "Getz", 663555296);
        data[4] = new Student("Larry", "Smith", 464555348);
        data[5] = new Student("Frank", "Phelps", 322555228);
        data[6] = new Student("Mario", "Guzman", 804555906);
        data[7] = new Student("Marsha", "Grant", 243555283);
        data[8] = new Student("Faniz", "Eliasvand", 187001499);
        

        System.out.println("UNSORTED ARRAY");
        for(int i = 0; i < data.length; i++){
            System.out.printf("Student Object| FN: %s \t LN: %s \t ID: %d \n", data[i].firstName, data[i].lastName, data[i].StudentID);
        }

        mergeSort(data); 
        
        System.out.println("\nSORTED ARRAY");
        for(int i = 0; i < data.length; i++){
            System.out.printf("Student Object| FN: %s \t LN: %s \t ID: %d \n", data[i].firstName, data[i].lastName, data[i].StudentID);
        }
       

    }

    public static void mergeSort(Student[] data) {
        sortArray(data, 0, data.length - 1); 
    }

    
    public static void sortArray(Student[] data, int low, int high) {
        
        if ((high - low) >= 1) { 
            int middle1 = (low + high) / 2; 
            int middle2 = middle1 + 1; 

            
            sortArray(data, low, middle1); 
            sortArray(data, middle2, high); 

            
            merge(data, low, middle1, middle2, high);
            
        }
    }

    public static void merge(Student[] data, int left, int middle1,
                              int middle2, int right) {

        int leftIndex = left; 
        int rightIndex = middle2; 
        int combinedIndex = left; 
        Student[] combined = new Student[data.length];
        

        while (leftIndex <= middle1 && rightIndex <= right){
            
            if (data[leftIndex].StudentID <= data[rightIndex].StudentID) {
                combined[combinedIndex++] = data[leftIndex++];
            }
            else {
                combined[combinedIndex++] = data[rightIndex++];
            }
        }

       
        if (leftIndex == middle2) {
            // copy in rest of right array
            while (rightIndex <= right) {
                combined[combinedIndex++] = data[rightIndex++];
            }
        }
        else { 
          
            while (leftIndex <= middle1) {
                combined[combinedIndex++] = data[leftIndex++];
            }
        }

        
        for (int i = left; i <= right; i++) {
            data[i] = combined[i];
        }
    }

}