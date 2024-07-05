package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {

        //의존성 주입
//        BatchProcessor processor = new BatchProcessor(new MyArrayList<>());
        BatchProcessor processor = new BatchProcessor(new MyLinkedList<>()); // 데이터가 커질수록 커지는 성능 차이

        processor.logic(100_000);

    }
}
