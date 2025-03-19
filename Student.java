 class Student {
     String stuId;
     String stuName;
     String stuAddress;
    String stuCourse;
     
        void insertRecord(String id, String name, String address, String course){
            stuId = id;
            stuName = name;
            stuAddress = address;
            stuCourse = course;
        }
        void displayInformation(){
            System.out.println("Student ID: "+stuId);
            System.out.println("Student Name: "+stuName);
            System.out.println("Student Address: "+stuAddress);
            System.out.println("Student Course: "+stuCourse);
        }
        public static void main(String args[]){
            Student s1 = new Student();
            Student s2 = new Student();
            s1.insertRecord("101", "anbu", "New York", "Java");
            s2.insertRecord("102", "Mike", "California", "Python");
            s1.displayInformation( );
            s2.displayInformation( );
        }
        

}
