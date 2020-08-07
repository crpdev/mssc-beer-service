package in.crpdev.msscbeerservice.mappers;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Created by rajapandian
 * Date: 07/08/20
 * Project: mssc-beer-service
 * Package: in.crpdev.msscbeerservice.mappers
 **/
@Component
public class DateMapper {

    public OffsetDateTime asOffsetDateTime(final Timestamp timestamp){
        if (timestamp != null){
            return OffsetDateTime.of(timestamp.toLocalDateTime().getYear(), timestamp.toLocalDateTime().getMonthValue(),
                    timestamp.toLocalDateTime().getDayOfMonth(), timestamp.toLocalDateTime().getHour(),
                    timestamp.toLocalDateTime().getMinute(), timestamp.toLocalDateTime().getSecond(),
                    timestamp.toLocalDateTime().getNano(), ZoneOffset.UTC);
        }
        return null;
    }

    public Timestamp asTimestamp(final OffsetDateTime offsetDateTime){
        if (offsetDateTime != null){
            Timestamp.valueOf(offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime());
        }
        return null;
    }
}
