
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test01"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.lang.Long[] long_array5 = new java.lang.Long[] { 1531609931147L };
    java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long6, long_array5);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long6);
    simpleTrackProvider0.clear();
    boolean b10 = simpleTrackProvider0.isShuffle();
    int i11 = simpleTrackProvider0.size();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider12 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext13 = simpleTrackProvider12.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext14 = null;
    simpleTrackProvider12.setLastTrack(audioTrackContext14);
    simpleTrackProvider12.skipped();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider17 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext18 = simpleTrackProvider17.provideAudioTrack();
    int i19 = simpleTrackProvider17.size();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext20 = simpleTrackProvider17.getAsListOrdered();
    simpleTrackProvider12.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext20);
    simpleTrackProvider0.addAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext20);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test02"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array16);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("hi!", str_array16);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array16);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand20 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array16);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array16);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array16);
    fredboat.command.maintenance.GetIdCommand getIdCommand23 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.music.control.StopCommand stopCommand24 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.fun.RandomImageCommand randomImageCommand25 = new fredboat.command.fun.RandomImageCommand("Bot Admin", "\uD83D\uDEAA", str_array16);
    fredboat.command.music.seeking.RestartCommand restartCommand26 = new fredboat.command.music.seeking.RestartCommand("\uD83D\uDCDD", str_array16);
    fredboat.command.music.control.PauseCommand pauseCommand27 = new fredboat.command.music.control.PauseCommand("User", str_array16);
    fredboat.command.fun.TextCommand textCommand28 = new fredboat.command.fun.TextCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "fredboat.commandmeta.MessagingException: \uD83D\uDEAA", str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test03"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand12 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand13 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand14 = new fredboat.command.music.control.PauseCommand("", str_array10);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("hi!", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand16 = new fredboat.command.music.control.ReshuffleCommand("\u274C", str_array10);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("fredboat.commandmeta.MessagingException: DJ", "Bot Owner", str_array10);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("fredboat.util.rest.APILimitException: en_US", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = configCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test04"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.getId();
    blacklistEntry1.setLevel(0);
    blacklistEntry1.rateLimitReached = 10;
    // The following exception was thrown during execution in test generation
    try {
    blacklistEntry1.setId(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test05"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand16 = new fredboat.command.admin.ReviveCommand("", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("Provided by OpenWeatherMap.org", "hi!", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand18 = new fredboat.command.admin.ReviveCommand("Provided by OpenWeatherMap.org", str_array11);
    fredboat.perms.PermissionLevel permissionLevel19 = reviveCommand18.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test06"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    boolean b3 = simpleTrackProvider0.remove(audioTrackContext2);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext4 = simpleTrackProvider0.getAsListOrdered();
    fredboat.audio.queue.RepeatMode repeatMode5 = simpleTrackProvider0.getRepeatMode();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext8 = simpleTrackProvider0.getTracksInRange((-1), 2);
    int i9 = simpleTrackProvider0.streamsCount();
    boolean b10 = simpleTrackProvider0.isShuffle();
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.reshuffle();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext4);
    org.junit.Assert.assertTrue("'" + repeatMode5 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode5.equals(fredboat.audio.queue.RepeatMode.OFF));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test07"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str2 = weatherError1.getFormattedDate();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode3 = weatherError1.errorType();
    java.lang.String str4 = weatherError1.getTemperature();
    java.lang.String str5 = weatherError1.getDataProviderString();
    java.lang.String str6 = weatherError1.getThumbnailUrl();
    java.lang.String str7 = weatherError1.getWeatherDescription();
    java.lang.String str8 = weatherError1.getDataProviderString();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode9 = weatherError1.errorType();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    org.junit.Assert.assertTrue("'" + errorCode3 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode3.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    org.junit.Assert.assertTrue("'" + errorCode9 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode9.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test08"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("fredboat.util.BrainfuckException: ");
    guildConfig1.setLang("fredboat.commandmeta.MessagingException: fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org");

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test09"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    weatherSystemOpenWeather0.setId((int)(short)100);
    int i3 = weatherSystemOpenWeather0.getType();
    int i4 = weatherSystemOpenWeather0.getId();
    weatherSystemOpenWeather0.setSunrise(1);
    int i7 = weatherSystemOpenWeather0.getSunset();
    weatherSystemOpenWeather0.setSunset((-1));
    weatherSystemOpenWeather0.setId((int)' ');
    int i12 = weatherSystemOpenWeather0.getId();
    int i13 = weatherSystemOpenWeather0.getType();
    weatherSystemOpenWeather0.setId(100);
    weatherSystemOpenWeather0.setSunset(1);
    weatherSystemOpenWeather0.setCountry("fredboat.commandmeta.MessagingException: fredboat.util.BrainfuckException: ");
    weatherSystemOpenWeather0.setMessage((double)1531611031077L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test10"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode1 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider0.setRepeatMode(repeatMode1);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider3 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext4 = simpleTrackProvider3.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext5 = null;
    simpleTrackProvider3.setLastTrack(audioTrackContext5);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext7 = simpleTrackProvider3.getAsListOrdered();
    simpleTrackProvider0.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext7);
    fredboat.audio.queue.AudioTrackContext audioTrackContext9 = null;
    boolean b10 = simpleTrackProvider0.remove(audioTrackContext9);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider12 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext13 = simpleTrackProvider12.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext14 = null;
    simpleTrackProvider12.setLastTrack(audioTrackContext14);
    java.lang.Long[] long_array19 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long20 = new java.util.ArrayList<java.lang.Long>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long20, long_array19);
    simpleTrackProvider12.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long20);
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand28 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array27);
    fredboat.command.admin.ExitCommand exitCommand29 = new fredboat.command.admin.ExitCommand("hi!", str_array27);
    java.util.List<java.lang.String> list_str30 = exitCommand29.aliases;
    fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand> tuple2_arraylist_long_exitCommand31 = new fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand>(arraylist_long20, exitCommand29);
    boolean b32 = simpleTrackProvider0.isUserTrackOwner(1531609933098L, (java.util.Collection<java.lang.Long>)arraylist_long20);
    long long33 = simpleTrackProvider0.getDurationMillis();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext36 = simpleTrackProvider0.getTracksInRange((int)'#', (int)(byte)0);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider37 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode38 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider37.setRepeatMode(repeatMode38);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider40 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext41 = simpleTrackProvider40.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext42 = null;
    simpleTrackProvider40.setLastTrack(audioTrackContext42);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext44 = simpleTrackProvider40.getAsListOrdered();
    simpleTrackProvider37.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext44);
    fredboat.audio.queue.AudioTrackContext audioTrackContext46 = null;
    boolean b47 = simpleTrackProvider37.remove(audioTrackContext46);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider49 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext50 = simpleTrackProvider49.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext51 = null;
    simpleTrackProvider49.setLastTrack(audioTrackContext51);
    java.lang.Long[] long_array56 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long57 = new java.util.ArrayList<java.lang.Long>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long57, long_array56);
    simpleTrackProvider49.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long57);
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand65 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array64);
    fredboat.command.admin.ExitCommand exitCommand66 = new fredboat.command.admin.ExitCommand("hi!", str_array64);
    java.util.List<java.lang.String> list_str67 = exitCommand66.aliases;
    fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand> tuple2_arraylist_long_exitCommand68 = new fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand>(arraylist_long57, exitCommand66);
    boolean b69 = simpleTrackProvider37.isUserTrackOwner(1531609933098L, (java.util.Collection<java.lang.Long>)arraylist_long57);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long57);
    fredboat.audio.queue.AudioTrackContext audioTrackContext71 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext71);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext75 = simpleTrackProvider0.getTracksInRange(97, 5);
    org.junit.Assert.assertTrue("'" + repeatMode1 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode1.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext36);
    org.junit.Assert.assertTrue("'" + repeatMode38 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode38.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext75);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test11"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand14 = new fredboat.command.music.control.RepeatCommand("", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array13);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand16 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array13);
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand18 = new fredboat.command.music.control.ShuffleCommand("DJ", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand19 = new fredboat.command.maintenance.AudioDebugCommand("Base", str_array13);
    fredboat.command.admin.UpdateCommand updateCommand20 = new fredboat.command.admin.UpdateCommand("Provided by OpenWeatherMap.org", str_array13);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("fredboat.util.BrainfuckException: hi!", "fredboat.util.BrainfuckException: \uD83D\uDEAA", str_array13);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = patCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test12"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setTempMax((double)0);
    double d5 = weatherMainOpenWeather0.getTempMax();
    double d6 = weatherMainOpenWeather0.getTemp();
    weatherMainOpenWeather0.setHumidity((int)(short)-1);
    weatherMainOpenWeather0.setTempMax((double)1531609989613L);
    weatherMainOpenWeather0.setTempMax((double)0);
    double d13 = weatherMainOpenWeather0.getTemp();
    double d14 = weatherMainOpenWeather0.getTempMax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test13"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("en_US");

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test14"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("");
    guildConfig1.setAutoResume(false);
    guildConfig1.setTrackAnnounce(false);
    boolean b6 = guildConfig1.isTrackAnnounce();
    java.lang.String str7 = guildConfig1.getLang();
    guildConfig1.setTrackAnnounce(false);
    java.lang.String str10 = guildConfig1.getLang();
    boolean b11 = guildConfig1.isTrackAnnounce();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "en_US"+ "'", str7.equals("en_US"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "en_US"+ "'", str10.equals("en_US"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test15"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array10);
    fredboat.command.admin.ReviveCommand reviveCommand15 = new fredboat.command.admin.ReviveCommand("fredboat.util.BrainfuckException: \u2705", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand17 = new fredboat.command.util.AvatarCommand("en_US", str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test16"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode1 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider0.setRepeatMode(repeatMode1);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider3 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext4 = simpleTrackProvider3.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext5 = null;
    simpleTrackProvider3.setLastTrack(audioTrackContext5);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext7 = simpleTrackProvider3.getAsListOrdered();
    simpleTrackProvider0.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext7);
    fredboat.audio.queue.AudioTrackContext audioTrackContext9 = null;
    boolean b10 = simpleTrackProvider0.remove(audioTrackContext9);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider12 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext13 = simpleTrackProvider12.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext14 = null;
    simpleTrackProvider12.setLastTrack(audioTrackContext14);
    java.lang.Long[] long_array19 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long20 = new java.util.ArrayList<java.lang.Long>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long20, long_array19);
    simpleTrackProvider12.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long20);
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand28 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array27);
    fredboat.command.admin.ExitCommand exitCommand29 = new fredboat.command.admin.ExitCommand("hi!", str_array27);
    java.util.List<java.lang.String> list_str30 = exitCommand29.aliases;
    fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand> tuple2_arraylist_long_exitCommand31 = new fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand>(arraylist_long20, exitCommand29);
    boolean b32 = simpleTrackProvider0.isUserTrackOwner(1531609933098L, (java.util.Collection<java.lang.Long>)arraylist_long20);
    long long33 = simpleTrackProvider0.getDurationMillis();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext36 = simpleTrackProvider0.getTracksInRange((int)'#', (int)(byte)0);
    fredboat.audio.queue.RepeatMode repeatMode37 = simpleTrackProvider0.getRepeatMode();
    org.junit.Assert.assertTrue("'" + repeatMode1 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode1.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long33 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext36);
    org.junit.Assert.assertTrue("'" + repeatMode37 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode37.equals(fredboat.audio.queue.RepeatMode.SINGLE));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test17"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand16 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand17 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand18 = new fredboat.command.fun.CatgirlCommand("", str_array11);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("fredboat.util.BrainfuckException: \uD83D\uDEAA", str_array11);
    fredboat.perms.PermissionLevel permissionLevel21 = reshuffleCommand20.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test18"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.NodesCommand nodesCommand11 = new fredboat.command.maintenance.NodesCommand("", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("DJ", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand14 = new fredboat.command.music.control.RepeatCommand("fredboat.util.BrainfuckException: \u2705", str_array8);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("DJ", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test19"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand16 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand17 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.WeatherCommand weatherCommand19 = new fredboat.command.util.WeatherCommand(weather2, "Bot Owner", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("Base", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test20"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("\u2705", str_array11);
    fredboat.command.util.MathCommand mathCommand18 = new fredboat.command.util.MathCommand("", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("Base", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand20 = new fredboat.command.admin.BotRestartCommand("\uD83D\uDEAA", str_array11);
    fredboat.perms.PermissionLevel permissionLevel21 = botRestartCommand20.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test21"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.moderation.LanguageCommand languageCommand11 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand12 = new fredboat.command.maintenance.GetIdCommand("Bot Owner", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test22"); }

    fredboat.util.rest.Weather weather6 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather6, "Bot Admin", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand20 = new fredboat.command.admin.SetAvatarCommand("\u2757", str_array14);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: ", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("fredboat.util.BrainfuckException: \u2705", str_array14);
    fredboat.command.fun.RollCommand rollCommand23 = new fredboat.command.fun.RollCommand("fredboat.util.rest.APILimitException: en_US", "fredboat.util.BrainfuckException: \u2705", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = rollCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test23"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather3 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode4 = openWeatherCurrent0.errorType();
    boolean b5 = openWeatherCurrent0.isError();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather6 = openWeatherCurrent0.getSys();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather7 = openWeatherCurrent0.getSys();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather8 = openWeatherCurrent0.getSys();
    java.lang.String str9 = openWeatherCurrent0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str2.equals("Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloudsOpenWeather3);
    org.junit.Assert.assertTrue("'" + errorCode4 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode4.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test24"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand10 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("", str_array7);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("Bot Admin", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = exitCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = exitCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = exitCommand12.getMinimumPerms();
    int i16 = permissionLevel15.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 4);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test25"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather4 = openWeatherCurrent0.getWeather();
    int i5 = openWeatherCurrent0.getId();
    openWeatherCurrent0.setId(2);
    int i8 = openWeatherCurrent0.getDatetime();
    int i9 = openWeatherCurrent0.getVisibility();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode10 = openWeatherCurrent0.errorType();
    fredboat.util.rest.models.weather.WeatherError weatherError11 = new fredboat.util.rest.models.weather.WeatherError(errorCode10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    org.junit.Assert.assertTrue("'" + errorCode2 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode2.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_weatherOpenWeather4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode10.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test26"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand15 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.fun.CatgirlCommand catgirlCommand16 = new fredboat.command.fun.CatgirlCommand("hi!", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand17 = new fredboat.command.moderation.LanguageCommand("en_US", str_array12);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("fredboat.util.BrainfuckException: ", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("\u274C", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand22 = new fredboat.command.maintenance.PingCommand("Admin", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test27"); }

    fredboat.audio.queue.PlaylistInfo.Source source2 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo3 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source2);
    playlistInfo3.setTotalTracks((int)(short)0);
    java.lang.String str6 = playlistInfo3.getName();
    fredboat.audio.queue.PlaylistInfo.Source source9 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo10 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source9);
    fredboat.audio.queue.PlaylistInfo.Source source11 = playlistInfo10.getSource();
    playlistInfo3.setSource(source11);
    fredboat.audio.queue.PlaylistInfo.Source source19 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo20 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source19);
    fredboat.audio.queue.PlaylistInfo playlistInfo21 = new fredboat.audio.queue.PlaylistInfo(0, "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", source19);
    fredboat.audio.queue.PlaylistInfo playlistInfo22 = new fredboat.audio.queue.PlaylistInfo((int)(byte)100, "Provided by OpenWeatherMap.org", source19);
    playlistInfo3.setSource(source19);
    java.lang.String str24 = playlistInfo3.getName();
    playlistInfo3.setName("fredboat.util.BrainfuckException: \u2705");
    int i27 = playlistInfo3.getTotalTracks();
    org.junit.Assert.assertTrue("'" + source2 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source2.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\u2757"+ "'", str6.equals("\u2757"));
    org.junit.Assert.assertTrue("'" + source9 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source9.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    org.junit.Assert.assertTrue("'" + source11 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source11.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    org.junit.Assert.assertTrue("'" + source19 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source19.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "\u2757"+ "'", str24.equals("\u2757"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test28"); }

    fredboat.db.entity.GuildPermissions guildPermissions0 = new fredboat.db.entity.GuildPermissions();
    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array10);
    java.util.List<java.lang.String> list_str16 = facedeskCommand15.aliases;
    guildPermissions0.setUserList(list_str16);
    java.lang.String[] str_array22 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand23 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array22);
    fredboat.command.util.MathCommand mathCommand24 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array22);
    java.util.List<java.lang.String> list_str25 = mathCommand24.aliases;
    guildPermissions0.setAdminList(list_str25);
    guildPermissions0.setId("\u2705");
    java.util.List<java.lang.String> list_str29 = guildPermissions0.getAdminList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test29"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array14);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array14);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand18 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand20 = new fredboat.command.admin.SetAvatarCommand("Provided by OpenWeatherMap.org", str_array14);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("fredboat.util.rest.APILimitException: en_US", "", str_array14);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array14);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: ", str_array14);
    fredboat.command.music.seeking.SeekCommand seekCommand24 = new fredboat.command.music.seeking.SeekCommand("\uD83D\uDCDD", str_array14);
    fredboat.command.maintenance.GetIdCommand getIdCommand25 = new fredboat.command.maintenance.GetIdCommand("\u2757", str_array14);
    fredboat.command.admin.ReviveCommand reviveCommand26 = new fredboat.command.admin.ReviveCommand("fredboat.commandmeta.MessagingException: ", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test30"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand9 = new fredboat.command.music.control.LeaveCommand("hi!", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("hi!", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("Bot Admin", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("fredboat.commandmeta.MessagingException: fredboat.util.BrainfuckException: ", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = avatarCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test31"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    weatherSystemOpenWeather0.setId((int)(short)100);
    int i3 = weatherSystemOpenWeather0.getType();
    int i4 = weatherSystemOpenWeather0.getId();
    weatherSystemOpenWeather0.setSunrise(1);
    weatherSystemOpenWeather0.setMessage((double)10000);
    weatherSystemOpenWeather0.setId(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test32"); }

    fredboat.util.rest.APILimitException aPILimitException2 = new fredboat.util.rest.APILimitException("en_US");
    fredboat.commandmeta.MessagingException messagingException3 = new fredboat.commandmeta.MessagingException("hi!", (java.lang.Throwable)aPILimitException2);
    java.lang.Throwable[] throwable_array4 = messagingException3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test33"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Admin", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test34"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getCode();
    java.lang.String str4 = openWeatherCurrent0.getName();
    int i5 = openWeatherCurrent0.getVisibility();
    boolean b6 = openWeatherCurrent0.isError();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    org.junit.Assert.assertTrue("'" + errorCode2 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode2.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test35"); }

    fredboat.util.GitRepoState gitRepoState0 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str1 = gitRepoState0.commitId;
    java.lang.String str2 = gitRepoState0.commitTime;
    java.lang.String str3 = gitRepoState0.branch;
    java.lang.String str4 = gitRepoState0.commitUserName;
    java.lang.String str5 = gitRepoState0.commitTime;
    java.lang.String str6 = gitRepoState0.commitMessageShort;
    java.lang.String str7 = gitRepoState0.commitIdAbbrev;
    java.lang.String str8 = gitRepoState0.commitUserName;
    java.lang.String str9 = gitRepoState0.commitMessageShort;
    java.lang.String str10 = gitRepoState0.commitMessageFull;
    java.lang.String str11 = gitRepoState0.commitMessageShort;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gitRepoState0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test36"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array21 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand22 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array21);
    fredboat.command.util.MathCommand mathCommand23 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array21);
    fredboat.command.music.control.UnpauseCommand unpauseCommand24 = new fredboat.command.music.control.UnpauseCommand("", str_array21);
    fredboat.command.admin.ExitCommand exitCommand25 = new fredboat.command.admin.ExitCommand("hi!", str_array21);
    fredboat.command.admin.BotRestartCommand botRestartCommand26 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array21);
    fredboat.command.admin.ReviveCommand reviveCommand27 = new fredboat.command.admin.ReviveCommand("", str_array21);
    fredboat.command.fun.FacedeskCommand facedeskCommand28 = new fredboat.command.fun.FacedeskCommand("\u2757", "DJ", str_array21);
    fredboat.command.fun.CatgirlCommand catgirlCommand29 = new fredboat.command.fun.CatgirlCommand("fredboat.util.BrainfuckException: ", str_array21);
    fredboat.command.fun.HugCommand hugCommand30 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "\u2705", str_array21);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand31 = new fredboat.command.fun.RemoteFileCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array21);
    fredboat.command.fun.PatCommand patCommand32 = new fredboat.command.fun.PatCommand("DJ", "fredboat.util.BrainfuckException: ", str_array21);
    fredboat.command.util.WeatherCommand weatherCommand33 = new fredboat.command.util.WeatherCommand(weather2, "DJ", str_array21);
    fredboat.command.music.info.HistoryCommand historyCommand34 = new fredboat.command.music.info.HistoryCommand("\uD83D\uDEAA", str_array21);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand35 = new fredboat.command.admin.UnblacklistCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test37"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.music.seeking.RestartCommand restartCommand9 = new fredboat.command.music.seeking.RestartCommand("", str_array6);
    fredboat.command.music.control.JoinCommand joinCommand10 = new fredboat.command.music.control.JoinCommand("https://i.imgur.com/YqZuqEB.jpg", str_array6);
    fredboat.command.maintenance.GetIdCommand getIdCommand11 = new fredboat.command.maintenance.GetIdCommand("\uD83D\uDEAA", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = getIdCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test38"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", "Bot Owner", "en_US", "fredboat.util.BrainfuckException: \u2705" };
    fredboat.command.util.MathCommand mathCommand8 = new fredboat.command.util.MathCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.fun.FacedeskCommand facedeskCommand9 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: :\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "fredboat.commandmeta.MessagingException: Base", str_array7);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = facedeskCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test39"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    java.lang.String str4 = uConfig3.getUserId();
    fredboat.db.entity.UConfig uConfig6 = uConfig3.setBearerExpiration(1531609962820L);
    java.lang.String str7 = uConfig6.getUserId();
    fredboat.db.entity.UConfig uConfig9 = uConfig6.setRefresh("\uD83D\uDEAA");
    java.lang.String str10 = uConfig9.getRefresh();
    java.lang.String str11 = uConfig9.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\uD83D\uDEAA"+ "'", str10.equals("\uD83D\uDEAA"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\uD83D\uDEAA"+ "'", str11.equals("\uD83D\uDEAA"));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test40"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "http://i.imgur.com/NqyOqnj.gif", "Provided by OpenWeatherMap.org", "\u274C", "http://i.imgur.com/NqyOqnj.gif" };
    java.util.ArrayList<java.lang.String> arraylist_str5 = new java.util.ArrayList<java.lang.String>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str5, str_array4);
    java.lang.String[] str_array20 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("", "\u274C", str_array20);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("\uD83D\uDCDD", "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array20);
    fredboat.command.util.ServerInfoCommand serverInfoCommand23 = new fredboat.command.util.ServerInfoCommand("Bot Owner", str_array20);
    fredboat.command.moderation.LanguageCommand languageCommand24 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array20);
    fredboat.command.util.BrainfuckCommand brainfuckCommand25 = new fredboat.command.util.BrainfuckCommand("fredboat.commandmeta.MessagingException: fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array20);
    fredboat.command.music.info.ListCommand listCommand26 = new fredboat.command.music.info.ListCommand("fredboat.commandmeta.MessagingException: ", str_array20);
    fredboat.util.Tuple2<java.util.AbstractList<java.lang.String>,fredboat.command.music.info.ListCommand> tuple2_abstractlist_str_listCommand27 = new fredboat.util.Tuple2<java.util.AbstractList<java.lang.String>,fredboat.command.music.info.ListCommand>((java.util.AbstractList<java.lang.String>)arraylist_str5, listCommand26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test41"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.music.seeking.RestartCommand restartCommand18 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("qua, 31 dez 1969, 09:00 PM", "en_US", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test42"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    boolean b1 = simpleTrackProvider0.isEmpty();
    simpleTrackProvider0.skipped();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider3 = new fredboat.audio.queue.SimpleTrackProvider();
    simpleTrackProvider3.skipped();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext5 = simpleTrackProvider3.getAsListOrdered();
    simpleTrackProvider0.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext5);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider7 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext8 = simpleTrackProvider7.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext9 = null;
    simpleTrackProvider7.setLastTrack(audioTrackContext9);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext13 = simpleTrackProvider7.getTracksInRange((int)(byte)10, 10000);
    simpleTrackProvider7.clear();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider15 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext16 = simpleTrackProvider15.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext17 = null;
    simpleTrackProvider15.setLastTrack(audioTrackContext17);
    java.lang.Long[] long_array22 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long23 = new java.util.ArrayList<java.lang.Long>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long23, long_array22);
    simpleTrackProvider15.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long23);
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand31 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array30);
    fredboat.command.admin.ExitCommand exitCommand32 = new fredboat.command.admin.ExitCommand("hi!", str_array30);
    java.util.List<java.lang.String> list_str33 = exitCommand32.aliases;
    fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand> tuple2_arraylist_long_exitCommand34 = new fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand>(arraylist_long23, exitCommand32);
    java.util.ArrayList<java.lang.Long> arraylist_long35 = tuple2_arraylist_long_exitCommand34.a;
    simpleTrackProvider7.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long35);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long35);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext38 = simpleTrackProvider0.getAsList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext38);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test43"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather1 = openWeatherCurrent0.getSys();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderIcon();
    java.lang.String str3 = openWeatherCurrent0.getThumbnailUrl();
    java.lang.String str4 = openWeatherCurrent0.getDataProviderString();
    int i5 = openWeatherCurrent0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "https://i.imgur.com/YqZuqEB.jpg"+ "'", str2.equals("https://i.imgur.com/YqZuqEB.jpg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str4.equals("Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test44"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    simpleTrackProvider0.skipped();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext4 = simpleTrackProvider0.getTracksInRange(3000, 10);
    fredboat.audio.queue.AudioTrackContext audioTrackContext5 = null;
    boolean b6 = simpleTrackProvider0.remove(audioTrackContext5);
    boolean b7 = simpleTrackProvider0.isShuffle();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider8 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext9 = simpleTrackProvider8.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext10 = null;
    simpleTrackProvider8.setLastTrack(audioTrackContext10);
    java.lang.Long[] long_array13 = new java.lang.Long[] { 1531609931147L };
    java.util.ArrayList<java.lang.Long> arraylist_long14 = new java.util.ArrayList<java.lang.Long>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long14, long_array13);
    simpleTrackProvider8.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long14);
    simpleTrackProvider8.clear();
    boolean b18 = simpleTrackProvider8.isShuffle();
    simpleTrackProvider8.clear();
    fredboat.audio.queue.AudioTrackContext audioTrackContext20 = simpleTrackProvider8.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext21 = simpleTrackProvider8.provideAudioTrack();
    fredboat.audio.queue.RepeatMode repeatMode22 = simpleTrackProvider8.getRepeatMode();
    simpleTrackProvider0.setRepeatMode(repeatMode22);
    fredboat.audio.queue.AudioTrackContext audioTrackContext24 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext21);
    org.junit.Assert.assertTrue("'" + repeatMode22 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode22.equals(fredboat.audio.queue.RepeatMode.OFF));

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test45"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    fredboat.db.entity.UConfig uConfig5 = uConfig0.setBearer("");
    fredboat.db.entity.UConfig uConfig7 = uConfig5.setBearer("fredboat.util.rest.APILimitException: en_US");
    java.lang.String str8 = uConfig5.getUserId();
    uConfig5.setId("fredboat.util.BrainfuckException: fredboat.util.BrainfuckException: ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test46"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("", str_array13);
    fredboat.command.admin.EvalCommand evalCommand18 = new fredboat.command.admin.EvalCommand("", str_array13);
    fredboat.command.util.CommandsCommand commandsCommand19 = new fredboat.command.util.CommandsCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand21 = new fredboat.command.music.info.HistoryCommand("Base", str_array13);
    fredboat.command.fun.HugCommand hugCommand22 = new fredboat.command.fun.HugCommand("", "Base", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test47"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(10L);
    blacklistEntry1.setRateLimitReachedTimestamp(1531609939130L);
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    blacklistEntry1.id = 5L;
    int i7 = blacklistEntry1.level;
    int i8 = blacklistEntry1.level;
    blacklistEntry1.setBlacklistedTimestamp(1531610084700L);
    blacklistEntry1.setLevel(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1531609939130L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test48"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array14);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand20 = new fredboat.command.util.ServerInfoCommand("fredboat.util.BrainfuckException: \uD83D\uDEAA", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("\u274C", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test49"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("Bot Admin", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand12 = new fredboat.command.music.control.JoinCommand("fredboat.util.BrainfuckException: \uD83D\uDEAA", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test50"); }

    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException4 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException3);
    java.lang.Throwable[] throwable_array5 = brainfuckException4.getSuppressed();
    fredboat.util.BrainfuckException brainfuckException7 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array8 = brainfuckException7.getSuppressed();
    brainfuckException4.addSuppressed((java.lang.Throwable)brainfuckException7);
    fredboat.util.BrainfuckException brainfuckException13 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array14 = brainfuckException13.getSuppressed();
    java.lang.String str15 = brainfuckException13.toString();
    fredboat.util.BrainfuckException brainfuckException16 = new fredboat.util.BrainfuckException("https://i.imgur.com/YqZuqEB.jpg", (java.lang.Throwable)brainfuckException13);
    fredboat.commandmeta.MessagingException messagingException17 = new fredboat.commandmeta.MessagingException("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", (java.lang.Throwable)brainfuckException16);
    brainfuckException4.addSuppressed((java.lang.Throwable)messagingException17);
    java.lang.Throwable[] throwable_array19 = messagingException17.getSuppressed();
    fredboat.util.BrainfuckException brainfuckException20 = new fredboat.util.BrainfuckException("\u2757", (java.lang.Throwable)messagingException17);
    java.lang.Throwable[] throwable_array21 = messagingException17.getSuppressed();
    fredboat.commandmeta.MessagingException messagingException24 = new fredboat.commandmeta.MessagingException("https://i.imgur.com/YqZuqEB.jpg");
    fredboat.util.BrainfuckException brainfuckException29 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException30 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException29);
    fredboat.commandmeta.MessagingException messagingException31 = new fredboat.commandmeta.MessagingException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException29);
    fredboat.util.BrainfuckException brainfuckException35 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException36 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException35);
    fredboat.util.BrainfuckException brainfuckException37 = new fredboat.util.BrainfuckException(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", (java.lang.Throwable)brainfuckException35);
    brainfuckException29.addSuppressed((java.lang.Throwable)brainfuckException37);
    fredboat.util.BrainfuckException brainfuckException40 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array41 = brainfuckException40.getSuppressed();
    brainfuckException37.addSuppressed((java.lang.Throwable)brainfuckException40);
    fredboat.commandmeta.MessagingException messagingException43 = new fredboat.commandmeta.MessagingException("hi!", (java.lang.Throwable)brainfuckException40);
    messagingException24.addSuppressed((java.lang.Throwable)brainfuckException40);
    fredboat.util.BrainfuckException brainfuckException45 = new fredboat.util.BrainfuckException("Base", (java.lang.Throwable)brainfuckException40);
    messagingException17.addSuppressed((java.lang.Throwable)brainfuckException40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org"+ "'", str15.equals("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array41);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test51"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.maintenance.PingCommand pingCommand9 = new fredboat.command.maintenance.PingCommand("\u274C", str_array7);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array7);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array7);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand12 = new fredboat.command.moderation.DisableCommandsCommand("Bot Owner", str_array7);
    fredboat.command.music.control.PauseCommand pauseCommand13 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array7);
    fredboat.perms.PermissionLevel permissionLevel14 = pauseCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = pauseCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand13.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test52"); }

    fredboat.util.rest.Weather weather9 = null;
    fredboat.util.rest.Weather weather12 = null;
    java.lang.String[] str_array20 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array20);
    fredboat.command.music.control.ShuffleCommand shuffleCommand22 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array20);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array20);
    fredboat.command.util.WeatherCommand weatherCommand24 = new fredboat.command.util.WeatherCommand(weather12, "Bot Admin", str_array20);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand25 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array20);
    fredboat.command.util.WeatherCommand weatherCommand26 = new fredboat.command.util.WeatherCommand(weather9, "Bot Owner", str_array20);
    fredboat.command.music.control.LeaveCommand leaveCommand27 = new fredboat.command.music.control.LeaveCommand("\u2705", str_array20);
    fredboat.command.music.control.JoinCommand joinCommand28 = new fredboat.command.music.control.JoinCommand("Bot Owner", str_array20);
    fredboat.command.music.control.LeaveCommand leaveCommand29 = new fredboat.command.music.control.LeaveCommand("fredboat.util.BrainfuckException: hi!", str_array20);
    fredboat.command.fun.FacedeskCommand facedeskCommand30 = new fredboat.command.fun.FacedeskCommand("\uD83D\uDEAA", "fredboat.util.BrainfuckException: ", str_array20);
    fredboat.command.moderation.LanguageCommand languageCommand31 = new fredboat.command.moderation.LanguageCommand("\uD83D\uDCDD", str_array20);
    fredboat.command.util.AvatarCommand avatarCommand32 = new fredboat.command.util.AvatarCommand("", str_array20);
    fredboat.command.maintenance.NodesCommand nodesCommand33 = new fredboat.command.maintenance.NodesCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array20);
    fredboat.command.music.info.HistoryCommand historyCommand34 = new fredboat.command.music.info.HistoryCommand("qua, 31 dez 1969, 09:00 PM", str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test53"); }

    fredboat.db.entity.GuildPermissions guildPermissions0 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions1 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str2 = guildPermissions1.getDjList();
    guildPermissions0.setUserList(list_str2);
    java.lang.String[] str_array8 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand10 = new fredboat.command.music.control.LeaveCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel11 = leaveCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = leaveCommand10.getMinimumPerms();
    java.util.List<java.lang.String> list_str13 = guildPermissions0.getFromEnum(permissionLevel12);
    java.util.List<java.lang.String> list_str14 = guildPermissions0.getAdminList();
    fredboat.db.entity.GuildPermissions guildPermissions15 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str16 = guildPermissions15.getDjList();
    java.lang.String[] str_array24 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand25 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array24);
    fredboat.command.util.MathCommand mathCommand26 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array24);
    fredboat.command.music.control.UnpauseCommand unpauseCommand27 = new fredboat.command.music.control.UnpauseCommand("", str_array24);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand28 = new fredboat.command.moderation.EnableCommandsCommand("", str_array24);
    fredboat.command.music.seeking.RewindCommand rewindCommand29 = new fredboat.command.music.seeking.RewindCommand("", str_array24);
    java.lang.String[] str_array34 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand35 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array34);
    fredboat.command.music.control.RepeatCommand repeatCommand36 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array34);
    fredboat.command.util.CommandsCommand commandsCommand37 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array34);
    fredboat.util.Tuple2<fredboat.command.music.seeking.RewindCommand,fredboat.commandmeta.abs.IUtilCommand> tuple2_rewindCommand_iUtilCommand38 = new fredboat.util.Tuple2<fredboat.command.music.seeking.RewindCommand,fredboat.commandmeta.abs.IUtilCommand>(rewindCommand29, (fredboat.commandmeta.abs.IUtilCommand)commandsCommand37);
    fredboat.perms.PermissionLevel permissionLevel39 = rewindCommand29.getMinimumPerms();
    java.util.List<java.lang.String> list_str40 = guildPermissions15.getFromEnum(permissionLevel39);
    fredboat.db.entity.GuildPermissions guildPermissions41 = new fredboat.db.entity.GuildPermissions();
    java.lang.String[] str_array51 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand52 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array51);
    fredboat.command.music.control.ShuffleCommand shuffleCommand53 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array51);
    fredboat.command.fun.TextCommand textCommand54 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array51);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand55 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array51);
    fredboat.command.fun.FacedeskCommand facedeskCommand56 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array51);
    java.util.List<java.lang.String> list_str57 = facedeskCommand56.aliases;
    guildPermissions41.setUserList(list_str57);
    java.lang.String[] str_array63 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand64 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array63);
    fredboat.command.util.MathCommand mathCommand65 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array63);
    java.util.List<java.lang.String> list_str66 = mathCommand65.aliases;
    guildPermissions41.setAdminList(list_str66);
    java.util.List<java.lang.String> list_str68 = guildPermissions41.getAdminList();
    guildPermissions15.setAdminList(list_str68);
    guildPermissions0.setUserList(list_str68);
    guildPermissions0.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    org.junit.Assert.assertTrue("'" + permissionLevel39 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel39.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str68);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test54"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand12 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand13 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("hi!", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("\u274C", "\uD83D\uDCDD", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand16 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: \uD83D\uDEAA", "Base", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("fredboat.commandmeta.MessagingException: Base", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = enableCommandsCommand17.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test55"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    java.lang.String str1 = weatherOpenWeather0.getDescription();
    weatherOpenWeather0.setDescription(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    java.lang.String str4 = weatherOpenWeather0.getIcon();
    weatherOpenWeather0.setDescription("Base");
    int i7 = weatherOpenWeather0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test56"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("\u2705", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("https://i.imgur.com/YqZuqEB.jpg", str_array11);
    fredboat.command.util.CommandsCommand commandsCommand19 = new fredboat.command.util.CommandsCommand("fredboat.util.BrainfuckException: :\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand20 = new fredboat.command.maintenance.PingCommand("fredboat.util.BrainfuckException: fredboat.util.BrainfuckException: ", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test57"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array13);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand19 = new fredboat.command.music.control.UnpauseCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array13);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("\u274C", "fredboat.util.BrainfuckException: \u2705", str_array13);
    fredboat.command.admin.ReviveCommand reviveCommand21 = new fredboat.command.admin.ReviveCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.admin.ExitCommand exitCommand22 = new fredboat.command.admin.ExitCommand("Bot Owner", str_array13);
    fredboat.perms.PermissionLevel permissionLevel23 = exitCommand22.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel24 = exitCommand22.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel23 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel23.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test58"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather4 = openWeatherCurrent0.getWeather();
    int i5 = openWeatherCurrent0.getId();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather6 = openWeatherCurrent0.getSys();
    boolean b7 = openWeatherCurrent0.isError();
    openWeatherCurrent0.setId((int)'#');
    java.lang.String str10 = openWeatherCurrent0.getThumbnailUrl();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    org.junit.Assert.assertTrue("'" + errorCode2 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode2.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_weatherOpenWeather4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test59"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.moderation.LanguageCommand languageCommand7 = new fredboat.command.moderation.LanguageCommand("", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand8 = new fredboat.command.music.control.UnpauseCommand("qua, 31 dez 1969, 09:00 PM", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand("fredboat.util.BrainfuckException: hi!", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = shuffleCommand9.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel11 = shuffleCommand9.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand9.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test60"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("en_US", str_array12);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.admin.UpdateCommand updateCommand21 = new fredboat.command.admin.UpdateCommand("fredboat.util.BrainfuckException: :\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test61"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    simpleTrackProvider0.skipped();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider5 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext6 = simpleTrackProvider5.provideAudioTrack();
    int i7 = simpleTrackProvider5.size();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext8 = simpleTrackProvider5.getAsListOrdered();
    simpleTrackProvider0.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext8);
    simpleTrackProvider0.clear();
    simpleTrackProvider0.skipped();
    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather12 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather12.setMain(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherOpenWeather12.setMain("Provided by OpenWeatherMap.org");
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand24 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array23);
    fredboat.command.admin.ExitCommand exitCommand25 = new fredboat.command.admin.ExitCommand("hi!", str_array23);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand26 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array23);
    fredboat.command.moderation.LanguageCommand languageCommand27 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array23);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand28 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather12, languageCommand27);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider29 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode30 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider29.setRepeatMode(repeatMode30);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider32 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext33 = simpleTrackProvider32.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext34 = null;
    simpleTrackProvider32.setLastTrack(audioTrackContext34);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext36 = simpleTrackProvider32.getAsListOrdered();
    simpleTrackProvider29.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext36);
    fredboat.audio.queue.AudioTrackContext audioTrackContext38 = null;
    boolean b39 = simpleTrackProvider29.remove(audioTrackContext38);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext40 = simpleTrackProvider29.getAsList();
    fredboat.util.Tuple2<fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>,fredboat.audio.queue.ITrackProvider> tuple2_tuple2_weatherOpenWeather_languageCommand_iTrackProvider41 = new fredboat.util.Tuple2<fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>,fredboat.audio.queue.ITrackProvider>(tuple2_weatherOpenWeather_languageCommand28, (fredboat.audio.queue.ITrackProvider)simpleTrackProvider29);
    fredboat.audio.queue.RepeatMode repeatMode42 = simpleTrackProvider29.getRepeatMode();
    simpleTrackProvider0.setRepeatMode(repeatMode42);
    boolean b44 = simpleTrackProvider0.isShuffle();
    simpleTrackProvider0.skipped();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    org.junit.Assert.assertTrue("'" + repeatMode30 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode30.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext40);
    org.junit.Assert.assertTrue("'" + repeatMode42 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode42.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test62"); }

    fredboat.commandmeta.MessagingException messagingException3 = new fredboat.commandmeta.MessagingException("\u2757");
    java.lang.Throwable[] throwable_array4 = messagingException3.getSuppressed();
    fredboat.commandmeta.MessagingException messagingException5 = new fredboat.commandmeta.MessagingException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)messagingException3);
    fredboat.commandmeta.MessagingException messagingException6 = new fredboat.commandmeta.MessagingException("fredboat.util.BrainfuckException: hi!", (java.lang.Throwable)messagingException5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test63"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("http://i.imgur.com/NqyOqnj.gif", "fredboat.util.BrainfuckException: hi!", str_array11);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("fredboat.commandmeta.MessagingException: ", str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test64"); }

    java.lang.String[] str_array12 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand13 = new fredboat.command.fun.HugCommand("", "\u274C", str_array12);
    fredboat.command.admin.ReviveCommand reviveCommand14 = new fredboat.command.admin.ReviveCommand("Bot Admin", str_array12);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("en_US", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("https://i.imgur.com/YqZuqEB.jpg", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("DJ", "\uD83D\uDEAA", str_array12);
    java.io.File file18 = patCommand17.getRandomFile();
    java.lang.String str19 = patCommand17.name;
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand17.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "\uD83D\uDEAA"+ "'", str19.equals("\uD83D\uDEAA"));

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test65"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("fredboat.util.BrainfuckException: ");
    java.lang.String str2 = guildConfig1.getGuildId();
    guildConfig1.setAutoResume(true);
    boolean b5 = guildConfig1.isAutoResume();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "fredboat.util.BrainfuckException: "+ "'", str2.equals("fredboat.util.BrainfuckException: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test66"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    java.lang.String str4 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig6 = uConfig0.setRefresh("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org");
    fredboat.util.GitRepoState gitRepoState7 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str8 = gitRepoState7.commitMessageShort;
    java.lang.String str9 = gitRepoState7.commitUserName;
    java.lang.String str10 = gitRepoState7.commitMessageFull;
    java.lang.String str11 = gitRepoState7.commitTime;
    java.lang.String str12 = gitRepoState7.commitIdAbbrev;
    java.lang.String str13 = gitRepoState7.branch;
    fredboat.util.Tuple2<fredboat.db.entity.UConfig,fredboat.util.GitRepoState> tuple2_uConfig_gitRepoState14 = new fredboat.util.Tuple2<fredboat.db.entity.UConfig,fredboat.util.GitRepoState>(uConfig6, gitRepoState7);
    fredboat.db.entity.UConfig uConfig15 = tuple2_uConfig_gitRepoState14.a;
    fredboat.db.entity.UConfig uConfig17 = uConfig15.setUserId("Bot Owner");
    fredboat.db.entity.UConfig uConfig19 = uConfig15.setBearer("http://i.imgur.com/NqyOqnj.gif");
    fredboat.db.entity.UConfig uConfig21 = uConfig19.setRefresh("");
    java.lang.String str22 = uConfig21.getBearer();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\u2705"+ "'", str4.equals("\u2705"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gitRepoState7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str22.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test67"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array14);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand21 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("en_US", "\uD83D\uDEAA", str_array14);
    fredboat.command.util.ServerInfoCommand serverInfoCommand23 = new fredboat.command.util.ServerInfoCommand("\uD83D\uDCDD", str_array14);
    fredboat.command.music.seeking.ForwardCommand forwardCommand24 = new fredboat.command.music.seeking.ForwardCommand("\u2757", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test68"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    fredboat.db.entity.UConfig uConfig5 = uConfig3.setRefresh("\uD83D\uDEAA");
    fredboat.db.entity.UConfig uConfig7 = uConfig3.setBearerExpiration(1531610566440L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig7);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test69"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array10);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array10);
    textCommand12.msg = "en_US";
    textCommand12.msg = "Base";
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = textCommand12.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test70"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand17 = new fredboat.command.music.control.RepeatCommand("", str_array16);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array16);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand19 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array16);
    fredboat.command.fun.RollCommand rollCommand20 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array16);
    fredboat.command.music.control.ShuffleCommand shuffleCommand21 = new fredboat.command.music.control.ShuffleCommand("DJ", str_array16);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("Base", str_array16);
    fredboat.command.admin.UpdateCommand updateCommand23 = new fredboat.command.admin.UpdateCommand("Provided by OpenWeatherMap.org", str_array16);
    fredboat.command.fun.CatgirlCommand catgirlCommand24 = new fredboat.command.fun.CatgirlCommand("\u2757", str_array16);
    fredboat.command.fun.FacedeskCommand facedeskCommand25 = new fredboat.command.fun.FacedeskCommand("", "fredboat.util.BrainfuckException: \u2705", str_array16);
    fredboat.command.fun.CatgirlCommand catgirlCommand26 = new fredboat.command.fun.CatgirlCommand("Provided by OpenWeatherMap.org", str_array16);
    fredboat.command.admin.ExitCommand exitCommand27 = new fredboat.command.admin.ExitCommand("\u274C", str_array16);
    fredboat.perms.PermissionLevel permissionLevel28 = exitCommand27.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test71"); }

    java.lang.String[] str_array19 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand20 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array19);
    fredboat.command.music.control.ShuffleCommand shuffleCommand21 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array19);
    fredboat.command.util.ServerInfoCommand serverInfoCommand22 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array19);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand23 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array19);
    fredboat.command.maintenance.VersionCommand versionCommand24 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array19);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand25 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array19);
    fredboat.command.music.control.JoinCommand joinCommand26 = new fredboat.command.music.control.JoinCommand("\uD83D\uDEAA", str_array19);
    fredboat.command.moderation.ConfigCommand configCommand27 = new fredboat.command.moderation.ConfigCommand("\u2757", str_array19);
    fredboat.command.maintenance.GetIdCommand getIdCommand28 = new fredboat.command.maintenance.GetIdCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array19);
    fredboat.command.fun.FacedeskCommand facedeskCommand29 = new fredboat.command.fun.FacedeskCommand("\uD83D\uDCDD", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array19);
    fredboat.command.music.seeking.ForwardCommand forwardCommand30 = new fredboat.command.music.seeking.ForwardCommand("DJ", str_array19);
    fredboat.command.moderation.ConfigCommand configCommand31 = new fredboat.command.moderation.ConfigCommand("\u2705", str_array19);
    fredboat.command.fun.PatCommand patCommand32 = new fredboat.command.fun.PatCommand("fredboat.commandmeta.MessagingException: fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "Provided by OpenWeatherMap.org", str_array19);
    fredboat.command.fun.HugCommand hugCommand33 = new fredboat.command.fun.HugCommand("\u2705", "fredboat.util.BrainfuckException: fredboat.util.BrainfuckException: ", str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test72"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setTempMax((double)0);
    double d5 = weatherMainOpenWeather0.getTempMax();
    weatherMainOpenWeather0.setHumidity(100);
    weatherMainOpenWeather0.setPressure(3);
    int i10 = weatherMainOpenWeather0.getPressure();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test73"); }

    fredboat.db.entity.GuildConfig guildConfig0 = new fredboat.db.entity.GuildConfig();
    java.lang.String str1 = guildConfig0.getGuildId();
    boolean b2 = guildConfig0.isAutoResume();
    guildConfig0.setTrackAnnounce(false);
    java.lang.String str5 = guildConfig0.getLang();
    java.lang.String str6 = guildConfig0.getGuildId();
    guildConfig0.setAutoResume(false);
    boolean b9 = guildConfig0.isTrackAnnounce();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "en_US"+ "'", str5.equals("en_US"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test74"); }

    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather0 = new fredboat.util.rest.models.weather.CloudsOpenWeather();
    cloudsOpenWeather0.setAll(10);
    int i3 = cloudsOpenWeather0.getAll();
    cloudsOpenWeather0.setAll((int)'a');
    cloudsOpenWeather0.setAll((int)'4');
    int i8 = cloudsOpenWeather0.getAll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test75"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.util.MathCommand mathCommand15 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("", str_array13);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("", str_array13);
    fredboat.command.music.seeking.RewindCommand rewindCommand19 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand20 = new fredboat.command.maintenance.VersionCommand("en_US", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand21 = new fredboat.command.util.BrainfuckCommand("en_US", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand22 = new fredboat.command.util.WeatherCommand(weather1, "\u274C", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand23 = new fredboat.command.music.control.PlaySplitCommand("fredboat.util.BrainfuckException: :\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.perms.PermissionLevel permissionLevel24 = playSplitCommand23.getMinimumPerms();
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = playSplitCommand23.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    org.junit.Assert.assertTrue("'" + permissionLevel24 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel24.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test76"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array15);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array15);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array15);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand19 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array15);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array15);
    fredboat.command.music.seeking.RestartCommand restartCommand21 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array15);
    fredboat.command.maintenance.GetIdCommand getIdCommand22 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand24 = new fredboat.command.maintenance.AudioDebugCommand("\uD83D\uDCDD", str_array15);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand25 = new fredboat.command.maintenance.GitInfoCommand("", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand26 = new fredboat.command.moderation.ConfigCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand27 = new fredboat.command.fun.CatgirlCommand("fredboat.util.BrainfuckException: :\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand28 = new fredboat.command.maintenance.VersionCommand("Admin", str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test77"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str2 = weatherError1.getDataProviderIcon();
    java.lang.String str3 = weatherError1.getFormattedDate();
    java.lang.String str4 = weatherError1.getThumbnailUrl();
    java.lang.String str5 = weatherError1.getDataProviderString();
    java.lang.String str6 = weatherError1.getTemperature();
    java.lang.String str7 = weatherError1.getDataProviderIcon();
    java.lang.String str8 = weatherError1.getThumbnailUrl();
    java.lang.String str9 = weatherError1.getDataProviderString();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode10 = weatherError1.errorType();
    boolean b11 = weatherError1.isError();
    java.lang.String str12 = weatherError1.getThumbnailUrl();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    org.junit.Assert.assertTrue("'" + errorCode10 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode10.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test78"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather0.setMain(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherOpenWeather0.setMain("Provided by OpenWeatherMap.org");
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array11);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand16 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather0, languageCommand15);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider17 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode18 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider17.setRepeatMode(repeatMode18);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider20 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext21 = simpleTrackProvider20.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext22 = null;
    simpleTrackProvider20.setLastTrack(audioTrackContext22);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext24 = simpleTrackProvider20.getAsListOrdered();
    simpleTrackProvider17.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext24);
    fredboat.audio.queue.AudioTrackContext audioTrackContext26 = null;
    boolean b27 = simpleTrackProvider17.remove(audioTrackContext26);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext28 = simpleTrackProvider17.getAsList();
    fredboat.util.Tuple2<fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>,fredboat.audio.queue.ITrackProvider> tuple2_tuple2_weatherOpenWeather_languageCommand_iTrackProvider29 = new fredboat.util.Tuple2<fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>,fredboat.audio.queue.ITrackProvider>(tuple2_weatherOpenWeather_languageCommand16, (fredboat.audio.queue.ITrackProvider)simpleTrackProvider17);
    fredboat.audio.queue.RepeatMode repeatMode30 = simpleTrackProvider17.getRepeatMode();
    simpleTrackProvider17.setShuffle(true);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext35 = simpleTrackProvider17.getTracksInRange(10000, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + repeatMode18 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode18.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext28);
    org.junit.Assert.assertTrue("'" + repeatMode30 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode30.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext35);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test79"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    weatherSystemOpenWeather0.setId((int)(short)100);
    int i3 = weatherSystemOpenWeather0.getType();
    weatherSystemOpenWeather0.setSunrise(100);
    weatherSystemOpenWeather0.setId(100);
    int i8 = weatherSystemOpenWeather0.getType();
    weatherSystemOpenWeather0.setCountry("Bot Owner");
    int i11 = weatherSystemOpenWeather0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test80"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    int i4 = openWeatherCurrent0.getId();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather6 = openWeatherCurrent0.getClouds();
    java.lang.String str7 = openWeatherCurrent0.getName();
    java.lang.String str8 = openWeatherCurrent0.getThumbnailUrl();
    java.lang.String str9 = openWeatherCurrent0.getThumbnailUrl();
    int i10 = openWeatherCurrent0.getId();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather11 = openWeatherCurrent0.getMain();
    java.lang.String str12 = openWeatherCurrent0.getName();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode13 = openWeatherCurrent0.errorType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str2.equals("Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str5.equals("qua, 31 dez 1969, 09:00 PM"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloudsOpenWeather6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    org.junit.Assert.assertTrue("'" + errorCode13 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode13.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test81"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode5 = openWeatherCurrent0.errorType();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather6 = openWeatherCurrent0.getSys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str2.equals("Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str4.equals("qua, 31 dez 1969, 09:00 PM"));
    org.junit.Assert.assertTrue("'" + errorCode5 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode5.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather6);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test82"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext6 = simpleTrackProvider0.getTracksInRange((int)(byte)10, 10000);
    fredboat.audio.queue.AudioTrackContext audioTrackContext7 = simpleTrackProvider0.peek();
    boolean b8 = simpleTrackProvider0.isEmpty();
    fredboat.audio.queue.AudioTrackContext audioTrackContext9 = simpleTrackProvider0.peek();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider10 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext11 = simpleTrackProvider10.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext12 = null;
    simpleTrackProvider10.setLastTrack(audioTrackContext12);
    java.lang.Long[] long_array15 = new java.lang.Long[] { 1531609931147L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    simpleTrackProvider10.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long16);
    simpleTrackProvider10.clear();
    boolean b20 = simpleTrackProvider10.isShuffle();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider22 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext23 = simpleTrackProvider22.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext24 = null;
    simpleTrackProvider22.setLastTrack(audioTrackContext24);
    java.lang.Long[] long_array29 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long30 = new java.util.ArrayList<java.lang.Long>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long30, long_array29);
    simpleTrackProvider22.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long30);
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand38 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array37);
    fredboat.command.admin.ExitCommand exitCommand39 = new fredboat.command.admin.ExitCommand("hi!", str_array37);
    java.util.List<java.lang.String> list_str40 = exitCommand39.aliases;
    fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand> tuple2_arraylist_long_exitCommand41 = new fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand>(arraylist_long30, exitCommand39);
    boolean b42 = simpleTrackProvider10.isUserTrackOwner(1531610002700L, (java.util.Collection<java.lang.Long>)arraylist_long30);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider43 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext44 = simpleTrackProvider43.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext45 = null;
    simpleTrackProvider43.setLastTrack(audioTrackContext45);
    simpleTrackProvider43.skipped();
    boolean b48 = simpleTrackProvider43.isShuffle();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider49 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode50 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider49.setRepeatMode(repeatMode50);
    boolean b52 = simpleTrackProvider49.isEmpty();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider53 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext54 = simpleTrackProvider53.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext55 = null;
    simpleTrackProvider53.setLastTrack(audioTrackContext55);
    fredboat.audio.queue.RepeatMode repeatMode57 = simpleTrackProvider53.getRepeatMode();
    simpleTrackProvider49.setRepeatMode(repeatMode57);
    simpleTrackProvider43.setRepeatMode(repeatMode57);
    simpleTrackProvider10.setRepeatMode(repeatMode57);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider61 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext62 = simpleTrackProvider61.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext63 = null;
    simpleTrackProvider61.setLastTrack(audioTrackContext63);
    fredboat.audio.queue.AudioTrackContext audioTrackContext65 = simpleTrackProvider61.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext66 = simpleTrackProvider61.provideAudioTrack();
    fredboat.audio.queue.RepeatMode repeatMode67 = simpleTrackProvider61.getRepeatMode();
    simpleTrackProvider10.setRepeatMode(repeatMode67);
    simpleTrackProvider0.setRepeatMode(repeatMode67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    org.junit.Assert.assertTrue("'" + repeatMode50 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode50.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext54);
    org.junit.Assert.assertTrue("'" + repeatMode57 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode57.equals(fredboat.audio.queue.RepeatMode.OFF));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext66);
    org.junit.Assert.assertTrue("'" + repeatMode67 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode67.equals(fredboat.audio.queue.RepeatMode.OFF));

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test83"); }

    fredboat.util.rest.Weather weather5 = null;
    fredboat.util.rest.Weather weather8 = null;
    java.lang.String[] str_array16 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array16);
    fredboat.command.music.control.ShuffleCommand shuffleCommand18 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array16);
    fredboat.command.fun.TextCommand textCommand19 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array16);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather8, "Bot Admin", str_array16);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array16);
    fredboat.command.util.WeatherCommand weatherCommand22 = new fredboat.command.util.WeatherCommand(weather5, "Bot Owner", str_array16);
    fredboat.command.music.control.LeaveCommand leaveCommand23 = new fredboat.command.music.control.LeaveCommand("\u2705", str_array16);
    fredboat.command.music.control.JoinCommand joinCommand24 = new fredboat.command.music.control.JoinCommand("Bot Owner", str_array16);
    fredboat.command.music.control.LeaveCommand leaveCommand25 = new fredboat.command.music.control.LeaveCommand("fredboat.util.BrainfuckException: hi!", str_array16);
    fredboat.command.fun.FacedeskCommand facedeskCommand26 = new fredboat.command.fun.FacedeskCommand("\uD83D\uDEAA", "fredboat.util.BrainfuckException: ", str_array16);
    fredboat.messaging.internal.Context context27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str28 = facedeskCommand26.help(context27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test84"); }

    fredboat.db.entity.GuildConfig guildConfig0 = new fredboat.db.entity.GuildConfig();
    java.lang.String str1 = guildConfig0.getGuildId();
    boolean b2 = guildConfig0.isTrackAnnounce();
    java.lang.String str3 = guildConfig0.getLang();
    java.lang.String str4 = guildConfig0.getLang();
    guildConfig0.setTrackAnnounce(false);
    guildConfig0.setAutoResume(true);
    guildConfig0.setLang("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "en_US"+ "'", str3.equals("en_US"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "en_US"+ "'", str4.equals("en_US"));

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test85"); }

    fredboat.db.DatabaseManager databaseManager0 = null;
    fredboat.agent.DBConnectionWatchdogAgent dBConnectionWatchdogAgent1 = new fredboat.agent.DBConnectionWatchdogAgent(databaseManager0);
    dBConnectionWatchdogAgent1.run();
    dBConnectionWatchdogAgent1.doRun();
    dBConnectionWatchdogAgent1.doRun();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider5 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext6 = simpleTrackProvider5.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext7 = null;
    simpleTrackProvider5.setLastTrack(audioTrackContext7);
    java.lang.Long[] long_array12 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    simpleTrackProvider5.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long13);
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand21 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array20);
    fredboat.command.admin.ExitCommand exitCommand22 = new fredboat.command.admin.ExitCommand("hi!", str_array20);
    java.util.List<java.lang.String> list_str23 = exitCommand22.aliases;
    fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand> tuple2_arraylist_long_exitCommand24 = new fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand>(arraylist_long13, exitCommand22);
    java.util.ArrayList<java.lang.Long> arraylist_long25 = tuple2_arraylist_long_exitCommand24.a;
    fredboat.util.Tuple2<java.lang.Runnable,java.util.ArrayList<java.lang.Long>> tuple2_runnable_arraylist_long26 = new fredboat.util.Tuple2<java.lang.Runnable,java.util.ArrayList<java.lang.Long>>((java.lang.Runnable)dBConnectionWatchdogAgent1, arraylist_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long25);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test86"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    int i3 = weatherMainOpenWeather0.getPressure();
    weatherMainOpenWeather0.setTempMax((double)(byte)-1);
    weatherMainOpenWeather0.setTempMax((double)' ');
    weatherMainOpenWeather0.setHumidity((int)(short)100);
    double d10 = weatherMainOpenWeather0.getTemp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test87"); }

    fredboat.db.DatabaseManager databaseManager0 = null;
    fredboat.agent.DBConnectionWatchdogAgent dBConnectionWatchdogAgent1 = new fredboat.agent.DBConnectionWatchdogAgent(databaseManager0);
    dBConnectionWatchdogAgent1.doRun();
    dBConnectionWatchdogAgent1.run();
    dBConnectionWatchdogAgent1.doRun();
    dBConnectionWatchdogAgent1.doRun();

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test88"); }

    fredboat.db.entity.GuildPermissions guildPermissions0 = new fredboat.db.entity.GuildPermissions();
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = rewindCommand15.getMinimumPerms();
    java.util.List<java.lang.String> list_str17 = guildPermissions0.getFromEnum(permissionLevel16);
    java.util.List<java.lang.String> list_str18 = guildPermissions0.getUserList();
    java.util.List<java.lang.String> list_str19 = guildPermissions0.getDjList();
    java.lang.String[] str_array24 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand25 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array24);
    fredboat.command.maintenance.PingCommand pingCommand26 = new fredboat.command.maintenance.PingCommand("\u274C", str_array24);
    fredboat.command.music.info.HistoryCommand historyCommand27 = new fredboat.command.music.info.HistoryCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array24);
    java.util.List<java.lang.String> list_str28 = historyCommand27.aliases;
    guildPermissions0.setDjList(list_str28);
    java.util.List<java.lang.String> list_str30 = guildPermissions0.getUserList();
    java.util.List<java.lang.String> list_str31 = guildPermissions0.getUserList();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test89"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather0.setMain(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherOpenWeather0.setMain("Provided by OpenWeatherMap.org");
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array11);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand16 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather0, languageCommand15);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider17 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode18 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider17.setRepeatMode(repeatMode18);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider20 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext21 = simpleTrackProvider20.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext22 = null;
    simpleTrackProvider20.setLastTrack(audioTrackContext22);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext24 = simpleTrackProvider20.getAsListOrdered();
    simpleTrackProvider17.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext24);
    fredboat.audio.queue.AudioTrackContext audioTrackContext26 = null;
    boolean b27 = simpleTrackProvider17.remove(audioTrackContext26);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext28 = simpleTrackProvider17.getAsList();
    fredboat.util.Tuple2<fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>,fredboat.audio.queue.ITrackProvider> tuple2_tuple2_weatherOpenWeather_languageCommand_iTrackProvider29 = new fredboat.util.Tuple2<fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>,fredboat.audio.queue.ITrackProvider>(tuple2_weatherOpenWeather_languageCommand16, (fredboat.audio.queue.ITrackProvider)simpleTrackProvider17);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider31 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext32 = simpleTrackProvider31.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext33 = null;
    simpleTrackProvider31.setLastTrack(audioTrackContext33);
    java.lang.Long[] long_array38 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long39 = new java.util.ArrayList<java.lang.Long>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long39, long_array38);
    simpleTrackProvider31.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long39);
    java.lang.String[] str_array46 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand47 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array46);
    fredboat.command.admin.ExitCommand exitCommand48 = new fredboat.command.admin.ExitCommand("hi!", str_array46);
    java.util.List<java.lang.String> list_str49 = exitCommand48.aliases;
    fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand> tuple2_arraylist_long_exitCommand50 = new fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand>(arraylist_long39, exitCommand48);
    boolean b51 = simpleTrackProvider17.isUserTrackOwner(1531609969962L, (java.util.Collection<java.lang.Long>)arraylist_long39);
    long long52 = simpleTrackProvider17.getDurationMillis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + repeatMode18 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode18.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long52 == 0L);

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test90"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    int i4 = blacklistEntry1.getRateLimitReached();
    blacklistEntry1.level = (short)10;
    blacklistEntry1.setRateLimitReachedTimestamp((long)5);
    blacklistEntry1.id = 0;
    blacklistEntry1.blacklistedTimestamp = 1531609936760L;
    blacklistEntry1.setRateLimitReachedTimestamp(1531609958568L);
    blacklistEntry1.setRateLimitReached((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test91"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("\u2705", str_array12);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("Base", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.NodesCommand nodesCommand19 = new fredboat.command.maintenance.NodesCommand("Bot Owner", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand20 = new fredboat.command.admin.UnblacklistCommand("Base", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand21 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array12);
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand33 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array32);
    fredboat.command.admin.ExitCommand exitCommand34 = new fredboat.command.admin.ExitCommand("hi!", str_array32);
    fredboat.command.music.info.ListCommand listCommand35 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array32);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand36 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array32);
    fredboat.command.util.BrainfuckCommand brainfuckCommand37 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array32);
    fredboat.command.music.control.PauseCommand pauseCommand38 = new fredboat.command.music.control.PauseCommand("", str_array32);
    fredboat.command.music.seeking.RewindCommand rewindCommand39 = new fredboat.command.music.seeking.RewindCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array32);
    fredboat.command.util.AvatarCommand avatarCommand40 = new fredboat.command.util.AvatarCommand("fredboat.commandmeta.MessagingException: fredboat.util.BrainfuckException: \u2705", str_array32);
    fredboat.util.Tuple2<fredboat.command.music.control.DestroyCommand,fredboat.command.util.AvatarCommand> tuple2_destroyCommand_avatarCommand41 = new fredboat.util.Tuple2<fredboat.command.music.control.DestroyCommand,fredboat.command.util.AvatarCommand>(destroyCommand21, avatarCommand40);
    fredboat.messaging.internal.Context context42 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str43 = destroyCommand21.help(context42);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test92"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("hi!");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.start((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test93"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array9);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("Base", "\u2705", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("Bot Owner", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test94() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test94"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand19 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array14);
    fredboat.command.fun.HugCommand hugCommand21 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand22 = new fredboat.command.music.control.DestroyCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array14);
    fredboat.command.music.control.StopCommand stopCommand23 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: hi!", str_array14);
    fredboat.command.music.control.DestroyCommand destroyCommand24 = new fredboat.command.music.control.DestroyCommand("", str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test95() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test95"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    simpleTrackProvider0.skipped();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext4 = simpleTrackProvider0.getTracksInRange(3000, 10);
    fredboat.audio.queue.AudioTrackContext audioTrackContext5 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext6 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext6);
    fredboat.audio.queue.AudioTrackContext audioTrackContext8 = null;
    boolean b9 = simpleTrackProvider0.remove(audioTrackContext8);
    boolean b10 = simpleTrackProvider0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test96() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test96"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("DJ");
    statsAgent1.run();
    statsAgent1.run();
    statsAgent1.run();

  }

  @Test
  public void test97() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test97"); }

    fredboat.db.entity.GuildPermissions guildPermissions0 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions1 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str2 = guildPermissions1.getDjList();
    guildPermissions0.setUserList(list_str2);
    java.lang.String[] str_array8 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand10 = new fredboat.command.music.control.LeaveCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel11 = leaveCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = leaveCommand10.getMinimumPerms();
    java.util.List<java.lang.String> list_str13 = guildPermissions0.getFromEnum(permissionLevel12);
    fredboat.db.entity.GuildPermissions guildPermissions14 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions15 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str16 = guildPermissions15.getDjList();
    guildPermissions14.setUserList(list_str16);
    fredboat.db.entity.GuildPermissions guildPermissions18 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions19 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str20 = guildPermissions19.getDjList();
    guildPermissions18.setUserList(list_str20);
    java.lang.String[] str_array26 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand27 = new fredboat.command.music.control.RepeatCommand("", str_array26);
    fredboat.command.music.control.LeaveCommand leaveCommand28 = new fredboat.command.music.control.LeaveCommand("hi!", str_array26);
    fredboat.perms.PermissionLevel permissionLevel29 = leaveCommand28.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel30 = leaveCommand28.getMinimumPerms();
    java.util.List<java.lang.String> list_str31 = guildPermissions18.getFromEnum(permissionLevel30);
    java.util.List<java.lang.String> list_str32 = guildPermissions18.getAdminList();
    guildPermissions14.setDjList(list_str32);
    java.lang.String[] str_array43 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand44 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array43);
    fredboat.command.music.control.ShuffleCommand shuffleCommand45 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array43);
    fredboat.command.fun.TextCommand textCommand46 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array43);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand47 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array43);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand48 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array43);
    fredboat.command.music.control.UnpauseCommand unpauseCommand49 = new fredboat.command.music.control.UnpauseCommand("\uD83D\uDCDD", str_array43);
    fredboat.perms.PermissionLevel permissionLevel50 = unpauseCommand49.getMinimumPerms();
    java.util.List<java.lang.String> list_str51 = guildPermissions14.getFromEnum(permissionLevel50);
    java.util.List<java.lang.String> list_str52 = guildPermissions14.getUserList();
    guildPermissions0.setAdminList(list_str52);
    fredboat.db.entity.GuildPermissions guildPermissions54 = new fredboat.db.entity.GuildPermissions();
    java.lang.String[] str_array64 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand65 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array64);
    fredboat.command.music.control.ShuffleCommand shuffleCommand66 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array64);
    fredboat.command.fun.TextCommand textCommand67 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array64);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand68 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array64);
    fredboat.command.fun.FacedeskCommand facedeskCommand69 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array64);
    java.util.List<java.lang.String> list_str70 = facedeskCommand69.aliases;
    guildPermissions54.setUserList(list_str70);
    java.lang.String[] str_array76 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand77 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array76);
    fredboat.command.util.MathCommand mathCommand78 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array76);
    java.util.List<java.lang.String> list_str79 = mathCommand78.aliases;
    guildPermissions54.setAdminList(list_str79);
    java.util.List<java.lang.String> list_str81 = guildPermissions54.getDjList();
    java.util.List<java.lang.String> list_str82 = guildPermissions54.getUserList();
    java.util.List<java.lang.String> list_str83 = guildPermissions54.getAdminList();
    guildPermissions0.setAdminList(list_str83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    org.junit.Assert.assertTrue("'" + permissionLevel29 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel29.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel30 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel30.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    org.junit.Assert.assertTrue("'" + permissionLevel50 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel50.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str83);

  }

}
