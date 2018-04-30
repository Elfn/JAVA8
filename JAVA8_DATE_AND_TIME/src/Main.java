import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Elimane on May, 2018, at 01:11
 */
public class Main {

    public static void main(String[] args)
    {
       // Java 8, new APIs to handle date and time,
        // which allow us to have more fine-grained
        // control over our date and time representation


        LocalDate date = LocalDate.of(2018,2,13);

        // Uses DateTimeformatter.ISO_LOCAL_DATE for which the format is: yyyy-MM-dd
        LocalDate date1 = LocalDate.parse("2018-02-13");
        LocalTime time = LocalTime.of(6,30);

        // Uses DateTimeFormatter.ISO_LOCAL_TIME for which the format is: HH:mm[:ss[.SSSSSSSSS]]
        // this means that both seconds and nanoseconds may optionally be present.
        LocalTime time1 = LocalTime.parse("06:30");
        LocalDateTime dateTime1 = LocalDateTime.of(2018,2,13,6,30);

        // Uses DateTimeFormatter.ISO_LOCAL_DATE_TIME for which the format is the
        // combination of the ISO date and time format, joined by 'T': yyyy-MM-dd'T'HH:mm[:ss[.SSSSSSSSS]]
        LocalDateTime dateTime2 = LocalDateTime.parse("2018-02-13T06:30");



        // LocalDate to LocalDateTime
        LocalDateTime dateTime3 = LocalDate.parse("2018-02-13").atTime(LocalTime.parse("06:30"));
// LocalTime to LocalDateTime
        LocalDateTime dateTime4 = LocalTime.parse("06:30").atDate(LocalDate.parse("2018-02-13"));
// LocalDateTime to LocalDate/LocalTime
        LocalDate date2 = LocalDateTime.parse("2018-02-13T06:30").toLocalDate();
        LocalTime time2 = LocalDateTime.parse("2018-02-13T06:30").toLocalTime();


        LocalDate date3 = LocalDate.parse("2018-02-13").plusDays(5);
        LocalDate date4 = LocalDate.parse("2018-02-13").plus(3, ChronoUnit.MONTHS);
        LocalTime time3 = LocalTime.parse("06:30").minusMinutes(30);
        LocalTime time4 = LocalTime.parse("06:30").minus(500, ChronoUnit.MILLIS);
        LocalDateTime dateTime = LocalDateTime.parse("2018-02-13T06:30").plus(Duration.ofHours(2));

        // using TemporalAdjusters, which implements a few useful cases:
        LocalDate date5 = LocalDate.parse("2018-02-13").with(TemporalAdjusters.lastDayOfMonth());



        LocalDateTime dateTime5 = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());


        // represents Wed Feb 28 23:24:43 CET 2018
        Date now = new Date();
// represents 2018-02-28T23:24:43.106
        LocalDateTime dateTime6 = LocalDateTime.ofInstant(now.toInstant(), ZoneId.systemDefault());
// represent Wed Feb 28 23:24:43 CET 2018
        Date date6 = Date.from(dateTime.toInstant(ZoneOffset.ofHours(1)));
        Date date7 = Date.from(dateTime.toInstant(ZoneId.systemDefault().getRules().getOffset(dateTime)));

        Period period = Period.between(LocalDate.parse("2018-01-18"), LocalDate.parse("2018-02-14"));

        Duration duration = Duration.between(LocalDateTime.parse("2018-01-18T06:30"), LocalDateTime.parse("2018-02-14T22:58"));


        // represents a period of 27 days
        Period period1 = Period.parse("P27D");

        // represents PT664H28M
        Duration duration1 = Duration.between(LocalDateTime.parse("2018-01-18T06:30"), LocalDateTime.parse("2018-02-14T22:58"));
// returns 664
        long hours = duration.toHours();
// returns 664
        long hours1 = LocalDateTime.parse("2018-01-18T06:30").until(LocalDateTime.parse("2018-02-14T22:58"), ChronoUnit.HOURS);



        OffsetDateTime offsetDateTime = LocalDateTime.parse("2018-02-14T06:30").atOffset(ZoneOffset.ofHours(2));
// Uses DateTimeFormatter.ISO_OFFSET_DATE_TIME for which the default format is
// ISO_LOCAL_DATE_TIME followed by the offset ("+HH:mm:ss").
        OffsetDateTime offsetDateTime1 = OffsetDateTime.parse("2018-02-14T06:30+06:00");
        ZonedDateTime zonedDateTime = LocalDateTime.parse("2018-02-14T06:30").atZone(ZoneId.of("Europe/Paris"));
// Uses DateTimeFormatter.ISO_ZONED_DATE_TIME for which the default format is
// ISO_OFFSET_DATE_TIME followed by the the ZoneId in square brackets.
        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse("2018-02-14T06:30+08:00[Asia/Macau]");
// note that the offset does not matter in this case.
// The following example will also return an offset of +08:00
        ZonedDateTime zonedDateTime3 = ZonedDateTime.parse("2018-02-14T06:30+06:00[Asia/Macau]");


        ZonedDateTime winter = LocalDateTime.parse("2018-01-14T06:30").atZone(ZoneId.of("Europe/Paris"));
        ZonedDateTime summer = LocalDateTime.parse("2018-08-14T06:30").atZone(ZoneId.of("Europe/Paris"));

        // offset will be +01:00
        OffsetDateTime offsetDateTime2 = winter.toOffsetDateTime();

        // offset will be +02:00
        OffsetDateTime offsetDateTime3 = summer.toOffsetDateTime();
        OffsetDateTime offsetDateTime4 = zonedDateTime.toOffsetDateTime();
        OffsetDateTime offsetDateTime5 = LocalDateTime.parse("2018-02-14T06:30").atOffset(ZoneOffset.ofHours(5));
        ZonedDateTime zonedDateTime1 = offsetDateTime.toZonedDateTime();




        // timeInMacau represents 2018-02-14T13:30+08:00[Asia/Macau]
        ZonedDateTime timeInMacau = LocalDateTime.parse( "2018-02-14T13:30" ).atZone( ZoneId.of( "Asia/Macau" ) );
// timeInParis represents 2018-02-14T06:30+01:00[Europe/Paris]
        ZonedDateTime timeInParis = timeInMacau.withZoneSameInstant( ZoneId.of( "Europe/Paris" ) );
        OffsetDateTime offsetInMacau = LocalDateTime.parse( "2018-02-14T13:30" ).atOffset( ZoneOffset.ofHours( 8 ) );
        OffsetDateTime offsetInParis = offsetInMacau.withOffsetSameInstant( ZoneOffset.ofHours( 1 ) );


        ZonedDateTime zonedDateTime4 = LocalDateTime.parse("2018-01-14T06:30").atZone(ZoneId.of("Asia/Macau"));
// will represent 2018-01-14T06:30, regardless of the region your application has specified
        //LocalDateTime localDateTime = conversionService.convert(zonedDateTime, LocalDateTime.class);


        // Let’s say we want to convert all of patterns mentioned above.
// 09-23-2018, 23/09/2018 and 2018-09-23 should all convert to the same LocalDate.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/MM/yyyy][MM-dd-yyyy]");
        LocalDate.parse("09-23-2018", formatter);
        LocalDate.parse("23/09/2018", formatter);
        LocalDate.parse("2018-09-23", formatter);


        DateTimeFormatter formatter1 = new DateTimeFormatterBuilder()
                .appendOptional( DateTimeFormatter.ofPattern( "yyyy-MM-dd" ) )
                .optionalStart().appendPattern( "dd/MM/yyyy" ).optionalEnd()
                .optionalStart().appendPattern( "MM-dd-yyyy" ).optionalEnd()
                .toFormatter();

        // 2018-09-23 and 2018-Sep-23 should convert to the same LocalDate.
// Using the ofPattern example we’ve used above will work:
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("[yyyy-MM-dd][yyyy-MMM-dd]" );
        LocalDate.parse( "2018-09-23", formatter );
        LocalDate.parse( "2018-Sep-23", formatter );
// Using the ofPattern example where we reuse the common part of the pattern
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern( "yyyy-[MM-dd][MMM-dd]" );
        LocalDate.parse( "2018-09-23", formatter );
        LocalDate.parse( "2018-Sep-23", formatter );


        LocalDate date8 = LocalDate.parse("2018-09-23");
// will result in 2018-09-232018-Sep-23
        date.format(DateTimeFormatter.ofPattern("[yyyy-MM-dd][yyyy-MMM-dd]" ));
// will result in 2018-09-23Sep-23
        date.format(DateTimeFormatter.ofPattern( "yyyy-[MM-dd][MMM-dd]" ));


        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern( "EEEE, MMM dd, yyyy" ).withLocale(Locale.UK);
        DateTimeFormatter formatter5 = new DateTimeFormatterBuilder().appendPattern("yyyy-MMM-dd" ).toFormatter(Locale.UK);


        // The issue: this will throw an exception.
        LocalDate date9 = LocalDate.parse("2018-02-15T13:45");
// We provide a DateTimeFormatter that can parse the given date representation.
// The result will be a LocalDate holding 2018-02-15.
        LocalDate date10 = LocalDate.parse("2018-02-15T13:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME);


        DateTimeFormatter formatter8 = new DateTimeFormatterBuilder()
                .appendOptional( DateTimeFormatter.ISO_LOCAL_DATE )
                .optionalStart().appendLiteral( "T" ).optionalEnd()
                .appendOptional( DateTimeFormatter.ISO_LOCAL_TIME )
                .toFormatter();


        // results in 2018-03-16
        LocalDate date11 = LocalDate.parse( "2018-03-16T06:30", formatter );
        LocalDate date12 = LocalDate.parse( "2018-03-16", formatter );
// results in 06:30
        LocalTime time7 = LocalTime.parse( "2018-03-16T06:30", formatter );
        LocalTime time8= LocalTime.parse( "06:30", formatter );
        LocalDateTime localDateTime = LocalDateTime.parse( "2018-03-16T06:30", formatter );


        // will throw an exception
        LocalDateTime localDateTime1 = LocalDateTime.parse("2018-03-16", formatter);
        LocalDate localDate = LocalDate.parse("06:30", formatter);




    }

}
