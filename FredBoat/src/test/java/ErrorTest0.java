
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather1 = openWeatherCurrent0.getSys();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderIcon();
    int i3 = openWeatherCurrent0.getDatetime();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str4 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getWeatherDescription();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str5 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather3 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather4 = openWeatherCurrent0.getClouds();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str5 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather3 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather4 = openWeatherCurrent0.getClouds();
    java.lang.String str5 = openWeatherCurrent0.getThumbnailUrl();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    java.lang.String str1 = openWeatherCurrent0.getLocation();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather2 = openWeatherCurrent0.getClouds();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str3 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    int i4 = openWeatherCurrent0.getId();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str5 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    int i5 = openWeatherCurrent0.getDatetime();
    java.lang.String str6 = openWeatherCurrent0.getDataProviderIcon();
    java.lang.String str7 = openWeatherCurrent0.getName();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    int i4 = openWeatherCurrent0.getId();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    openWeatherCurrent0.setId((int)(byte)1);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    java.lang.String str3 = openWeatherCurrent0.getName();
    java.lang.String str4 = openWeatherCurrent0.getDataProviderString();
    java.lang.String str5 = openWeatherCurrent0.getName();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather6 = openWeatherCurrent0.getClouds();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str7 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    int i4 = openWeatherCurrent0.getId();
    int i5 = openWeatherCurrent0.getId();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getCode();
    int i4 = openWeatherCurrent0.getDatetime();
    int i5 = openWeatherCurrent0.getCode();
    java.lang.String str6 = openWeatherCurrent0.getThumbnailUrl();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather7 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather8 = openWeatherCurrent0.getSys();
    int i9 = openWeatherCurrent0.getVisibility();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str10 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    openWeatherCurrent0.setId((int)' ');
    openWeatherCurrent0.setId((int)'a');
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str7 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather1 = openWeatherCurrent0.getSys();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderIcon();
    java.lang.String str3 = openWeatherCurrent0.getFormattedDate();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    java.lang.String str5 = openWeatherCurrent0.getName();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode6 = openWeatherCurrent0.errorType();
    int i7 = openWeatherCurrent0.getId();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather4 = openWeatherCurrent0.getWeather();
    int i5 = openWeatherCurrent0.getId();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather6 = openWeatherCurrent0.getSys();
    java.lang.String str7 = openWeatherCurrent0.getFormattedDate();
    boolean b8 = openWeatherCurrent0.isError();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str9 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather1 = openWeatherCurrent0.getSys();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderIcon();
    int i3 = openWeatherCurrent0.getDatetime();
    java.lang.String str4 = openWeatherCurrent0.getDataProviderIcon();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str5 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    java.lang.String str1 = openWeatherCurrent0.getLocation();
    java.lang.String str2 = openWeatherCurrent0.getName();
    java.lang.String str3 = openWeatherCurrent0.getName();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode4 = openWeatherCurrent0.errorType();
    int i5 = openWeatherCurrent0.getId();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    java.lang.String str3 = openWeatherCurrent0.getWeatherDescription();
    java.lang.String str4 = openWeatherCurrent0.getWeatherDescription();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather5 = openWeatherCurrent0.getSys();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather6 = openWeatherCurrent0.getWeather();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str7 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    java.lang.String str1 = openWeatherCurrent0.getLocation();
    java.lang.String str2 = openWeatherCurrent0.getName();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str3 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getCode();
    int i4 = openWeatherCurrent0.getDatetime();
    int i5 = openWeatherCurrent0.getCode();
    java.lang.String str6 = openWeatherCurrent0.getThumbnailUrl();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather7 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather8 = openWeatherCurrent0.getSys();
    int i9 = openWeatherCurrent0.getVisibility();
    java.lang.String str10 = openWeatherCurrent0.getLocation();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather11 = openWeatherCurrent0.getWeather();
    java.lang.String str12 = openWeatherCurrent0.getName();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str13 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    java.lang.String str3 = openWeatherCurrent0.getLocation();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    openWeatherCurrent0.setId(0);
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather6 = openWeatherCurrent0.getClouds();
    java.lang.String str7 = openWeatherCurrent0.getFormattedDate();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    boolean b1 = openWeatherCurrent0.isError();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderIcon();
    java.lang.String str3 = openWeatherCurrent0.getThumbnailUrl();
    int i4 = openWeatherCurrent0.getDatetime();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str5 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getLocation();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather3 = openWeatherCurrent0.getSys();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather4 = openWeatherCurrent0.getClouds();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str5 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    int i5 = openWeatherCurrent0.getDatetime();
    java.lang.String str6 = openWeatherCurrent0.getDataProviderIcon();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode7 = openWeatherCurrent0.errorType();
    int i8 = openWeatherCurrent0.getVisibility();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather9 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather10 = openWeatherCurrent0.getClouds();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str11 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    int i4 = openWeatherCurrent0.getId();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    java.lang.String str6 = openWeatherCurrent0.getLocation();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather7 = openWeatherCurrent0.getClouds();
    java.lang.String str8 = openWeatherCurrent0.getWeatherDescription();
    java.lang.String str9 = openWeatherCurrent0.getWeatherDescription();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str10 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather1 = openWeatherCurrent0.getSys();
    openWeatherCurrent0.setId((int)(short)1);
    boolean b4 = openWeatherCurrent0.isError();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str5 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test27"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather3 = openWeatherCurrent0.getWeather();
    openWeatherCurrent0.setId((int)(short)1);
    openWeatherCurrent0.setId((int)(short)-1);
    java.lang.String str8 = openWeatherCurrent0.getLocation();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str9 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test28"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather4 = openWeatherCurrent0.getWeather();
    int i5 = openWeatherCurrent0.getId();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode6 = openWeatherCurrent0.errorType();
    int i7 = openWeatherCurrent0.getCode();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test29"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    int i5 = openWeatherCurrent0.getDatetime();
    java.lang.String str6 = openWeatherCurrent0.getDataProviderIcon();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str7 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test30"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    java.lang.String str3 = openWeatherCurrent0.getWeatherDescription();
    java.lang.String str4 = openWeatherCurrent0.getWeatherDescription();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather5 = openWeatherCurrent0.getSys();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather6 = openWeatherCurrent0.getMain();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str7 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test31"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    int i4 = openWeatherCurrent0.getId();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    java.lang.String str6 = openWeatherCurrent0.getLocation();
    java.lang.String str7 = openWeatherCurrent0.getDataProviderIcon();
    int i8 = openWeatherCurrent0.getDatetime();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather9 = openWeatherCurrent0.getClouds();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str10 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test32"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    java.lang.String str1 = openWeatherCurrent0.getLocation();
    java.lang.String str2 = openWeatherCurrent0.getName();
    java.lang.String str3 = openWeatherCurrent0.getName();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode4 = openWeatherCurrent0.errorType();
    boolean b5 = openWeatherCurrent0.isError();
    int i6 = openWeatherCurrent0.getCode();
    java.lang.String str7 = openWeatherCurrent0.getDataProviderString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test33"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    boolean b1 = openWeatherCurrent0.isError();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str2 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test34"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    java.lang.String str1 = openWeatherCurrent0.getLocation();
    openWeatherCurrent0.setId((int)(byte)-1);
    java.lang.String str4 = openWeatherCurrent0.getThumbnailUrl();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather5 = openWeatherCurrent0.getSys();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test35"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather4 = openWeatherCurrent0.getWeather();
    int i5 = openWeatherCurrent0.getId();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather6 = openWeatherCurrent0.getSys();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode7 = openWeatherCurrent0.errorType();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test36"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    java.lang.String str3 = openWeatherCurrent0.getName();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode4 = openWeatherCurrent0.errorType();
    openWeatherCurrent0.setId((-1));
    openWeatherCurrent0.setId(52);
    java.lang.String str9 = openWeatherCurrent0.getFormattedDate();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str10 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test37"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    java.lang.String str3 = openWeatherCurrent0.getLocation();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    java.lang.String str6 = openWeatherCurrent0.getDataProviderIcon();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str7 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test38"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getThumbnailUrl();
    java.lang.String str5 = openWeatherCurrent0.getLocation();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather6 = openWeatherCurrent0.getClouds();
    java.lang.String str7 = openWeatherCurrent0.getThumbnailUrl();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test39"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    java.lang.String str3 = openWeatherCurrent0.getName();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather4 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather5 = openWeatherCurrent0.getMain();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test40"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    int i3 = openWeatherCurrent0.getVisibility();
    java.lang.String str4 = openWeatherCurrent0.getThumbnailUrl();
    int i5 = openWeatherCurrent0.getDatetime();
    java.lang.String str6 = openWeatherCurrent0.getDataProviderString();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str7 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test41"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    java.lang.String str3 = openWeatherCurrent0.getName();
    java.lang.String str4 = openWeatherCurrent0.getDataProviderString();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test42"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather4 = openWeatherCurrent0.getWeather();
    int i5 = openWeatherCurrent0.getId();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather6 = openWeatherCurrent0.getSys();
    java.lang.String str7 = openWeatherCurrent0.getFormattedDate();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather8 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode9 = openWeatherCurrent0.errorType();
    int i10 = openWeatherCurrent0.getId();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str11 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test43"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather3 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode4 = openWeatherCurrent0.errorType();
    boolean b5 = openWeatherCurrent0.isError();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather6 = openWeatherCurrent0.getSys();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather7 = openWeatherCurrent0.getSys();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode8 = openWeatherCurrent0.errorType();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str9 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test44"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    int i5 = openWeatherCurrent0.getDatetime();
    java.lang.String str6 = openWeatherCurrent0.getDataProviderIcon();
    java.lang.String str7 = openWeatherCurrent0.getDataProviderIcon();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test45"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    boolean b1 = openWeatherCurrent0.isError();
    boolean b2 = openWeatherCurrent0.isError();
    java.lang.String str3 = openWeatherCurrent0.getName();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str4 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test46"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    int i5 = openWeatherCurrent0.getDatetime();
    java.lang.String str6 = openWeatherCurrent0.getDataProviderIcon();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode7 = openWeatherCurrent0.errorType();
    int i8 = openWeatherCurrent0.getVisibility();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather9 = openWeatherCurrent0.getClouds();
    int i10 = openWeatherCurrent0.getCode();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str11 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test47"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather3 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather4 = openWeatherCurrent0.getClouds();
    int i5 = openWeatherCurrent0.getCode();
    java.lang.String str6 = openWeatherCurrent0.getFormattedDate();
    openWeatherCurrent0.setId((int)'#');
    java.lang.String str9 = openWeatherCurrent0.getWeatherDescription();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str10 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test48"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    int i4 = openWeatherCurrent0.getId();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    java.lang.String str6 = openWeatherCurrent0.getLocation();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather7 = openWeatherCurrent0.getClouds();
    int i8 = openWeatherCurrent0.getDatetime();
    java.lang.String str9 = openWeatherCurrent0.getLocation();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str10 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test49"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather4 = openWeatherCurrent0.getSys();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    java.lang.String str6 = openWeatherCurrent0.getThumbnailUrl();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str7 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test50"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    java.lang.String str3 = openWeatherCurrent0.getName();
    java.lang.String str4 = openWeatherCurrent0.getDataProviderString();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    int i6 = openWeatherCurrent0.getDatetime();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str7 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test51"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather4 = openWeatherCurrent0.getSys();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test52"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getThumbnailUrl();
    java.lang.String str5 = openWeatherCurrent0.getLocation();
    java.lang.String str6 = openWeatherCurrent0.getDataProviderIcon();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str7 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test53"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    openWeatherCurrent0.setId((int)' ');
    int i5 = openWeatherCurrent0.getCode();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = openWeatherCurrent0.getTemperature();

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test54"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather3 = openWeatherCurrent0.getClouds();
    java.lang.String str4 = openWeatherCurrent0.getThumbnailUrl();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = openWeatherCurrent0.getTemperature();

  }

}
