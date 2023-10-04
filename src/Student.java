public class Student {
        private String name;
        private String contact_no;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String  getContactNo() {
            return contact_no;
        }
        public void setContactNo(String contact_no){
            this.contact_no = contact_no;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
    }
    class display{
        public static void main(String[] args) {
            Student s = new Student();
            s.setName("Medha");
            s.setContactNo("+94741496500");
            s.setAge(21);
            System.out.println("Name =" + "\t" + s.getName() + "\n" + "ContactNo" + "\t" + s.getContactNo() + "\n" + "Age" + "\t" + s.getAge());
        }
    }

