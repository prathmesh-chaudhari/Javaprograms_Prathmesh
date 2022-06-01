package demo.garbagecollection;
public class TestGarbageCollectionDemo {

    public void finalize() {
        System.out.println("Object is garbage collected!!!");
    }

    public static void main(String[] args) {
        TestGarbageCollectionDemo s1 = new TestGarbageCollectionDemo();
        TestGarbageCollectionDemo s2 = new TestGarbageCollectionDemo();
        s1 = null;
        s2 = null;
        System.gc();
    }
}
