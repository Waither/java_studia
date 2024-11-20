import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber {
    private static final Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);

    public void describe(Shape shape) {
        logger.info("Opis figury:");
        logger.info("Typ figury: {}", shape.getName());
        logger.info("Pole figury: {}", shape.getArea());
        logger.info("Obwód figury: {}", shape.getPerimeter());
        logger.info("Kolor figury: {}", shape.getColorDescription());
    }
}
