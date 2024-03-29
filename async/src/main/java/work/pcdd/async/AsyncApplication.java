package work.pcdd.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import work.pcdd.async.service.OrderService;

@RestController
@SpringBootApplication
public class AsyncApplication {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(AsyncApplication.class, args);
    }

    @GetMapping("/makeOrder")
    public String makeOrder() {
        orderService.makeOrder();
        return "ok";
    }

}
