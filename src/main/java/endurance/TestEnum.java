package endurance;

public enum TestEnum {
    ONE {
        @Override
        public void sayHello() {
            System.out.println("hi1");
        }
    }, TWO{
        @Override
        public void sayHello() {
            System.out.println("hi2");
        }
    }, THREE{
        @Override
        public void sayHello() {
            System.out.println("hi3");
        }
    };

    public abstract void sayHello();
}
