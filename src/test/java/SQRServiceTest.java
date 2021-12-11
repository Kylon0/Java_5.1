import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void sqrCount1() {
        SQRService service = new SQRService();

        long bottom = 100;
        long top = 200;

        long result = service.sqrCount(bottom, top);
        System.out.println(result);
    }

    @org.junit.jupiter.api.Test
    void sqrCount2() {
        SQRService service = new SQRService();

        long bottom = 200;
        long top = 300;

        long result = service.sqrCount(bottom, top);
        System.out.println(result);
    }

    @org.junit.jupiter.api.Test
    void sqrCount3() {
        SQRService service = new SQRService();

        long bottom = 1;
        long top = 99;

        long result = service.sqrCount(bottom, top);
        System.out.println(result);
    }

    @org.junit.jupiter.api.Test
    void sqrCount4() {
        SQRService service = new SQRService();

        long bottom = 100;
        long top = 9801;

        long result = service.sqrCount(bottom, top);
        System.out.println(result);
    }

    @org.junit.jupiter.api.Test
    void sqrCount5() {
        SQRService service = new SQRService();

        long bottom = 10000;
        long top = 100000;

        long result = service.sqrCount(bottom, top);
        System.out.println(result);
    }

}