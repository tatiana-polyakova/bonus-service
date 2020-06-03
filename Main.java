import java.util.logging.Logger;

public class Main {
  public static void main(String[] args) {
    Logger log = Logger.getLogger("My logger");
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;

    long result = service.calculate(amount, registered);
    log.info(String.valueOf(result));
  }
}

