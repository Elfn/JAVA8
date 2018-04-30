package classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

/**
 * Created by Elimane on May, 2018, at 01:28
 */


//TemporalQuery<TemporalAccessor> myCustomQuery = new MyCustomTemporalQuery();
//// results in 2018-03-16
//        LocalDateTime localDateTime = conversionService.convert( formatter.parse( "2018-03-16", myCustomQuery ), LocalDateTime.class );
//// results in 00:00
//        LocalTime localTime = conversionService.convert( formatter.parse( "2018-03-16", myCustomQuery ), LocalTime.class );



public class MyCustomTemporalQuery implements TemporalQuery<TemporalAccessor> {
    @Override
    public TemporalAccessor queryFrom(TemporalAccessor temporal) {

        //Using TemporalQuery allows us to check which information is present and to
        // provide defaults for any information that is missing, enabling us to easily
        // convert to the required type, using the logic that makes sense in our application.

        LocalDate date = temporal.isSupported( ChronoField.EPOCH_DAY )
                ? LocalDate.ofEpochDay( temporal.getLong( ChronoField.EPOCH_DAY ) ) : LocalDate.now();
        LocalTime time = temporal.isSupported( ChronoField.NANO_OF_DAY )
                ? LocalTime.ofNanoOfDay( temporal.getLong( ChronoField.NANO_OF_DAY ) ) : LocalTime.MIN;
        return LocalDateTime.of( date, time );

    }
}
