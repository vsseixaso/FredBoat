
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = configCommand15.getMinimumPerms();
    java.lang.String str17 = permissionLevel16.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BASE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Base"+ "'", str17.equals("Base"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    int i5 = blacklistEntry1.getLevel();
    long long6 = blacklistEntry1.id;
    blacklistEntry1.level = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 10L);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    double d3 = weatherMainOpenWeather0.getTemp();
    weatherMainOpenWeather0.setTemp((double)1L);
    double d6 = weatherMainOpenWeather0.getTempMin();
    int i7 = weatherMainOpenWeather0.getPressure();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.util.BrainfuckCommand brainfuckCommand9 = new fredboat.command.util.BrainfuckCommand("", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("\u2705", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("", "fredboat.util.BrainfuckException: \u2705", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "fredboat.util.BrainfuckException: \u2705", str_array7);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand("\u2705", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    mathCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1531609935745L);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.seeking.RestartCommand restartCommand8 = new fredboat.command.music.seeking.RestartCommand("", str_array5);
    fredboat.command.music.control.JoinCommand joinCommand9 = new fredboat.command.music.control.JoinCommand("https://i.imgur.com/YqZuqEB.jpg", str_array5);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = joinCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand("fredboat.util.BrainfuckException: ", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = forwardCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array9);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("en_US", str_array9);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand16 = new fredboat.command.music.control.ReshuffleCommand("\u274C", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    remoteFileCommand9.url = "en_US";
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = remoteFileCommand9.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\u274C"+ "'", str10.equals("\u274C"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand11 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.perms.PermissionLevel permissionLevel12 = botRestartCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = botRestartCommand11.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand11.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand8 = new fredboat.command.music.control.LeaveCommand("hi!", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("hi!", str_array6);
    fredboat.command.music.control.PauseCommand pauseCommand10 = new fredboat.command.music.control.PauseCommand("hi!", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("en_US", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("Provided by OpenWeatherMap.org", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = nodesCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    int i2 = simpleTrackProvider0.size();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext3 = simpleTrackProvider0.getAsListOrdered();
    int i4 = simpleTrackProvider0.size();
    simpleTrackProvider0.skipped();
    fredboat.audio.queue.RepeatMode repeatMode6 = null;
    simpleTrackProvider0.setRepeatMode(repeatMode6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("\uD83D\uDCDD", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("fredboat.util.BrainfuckException: \u2705", "\uD83D\uDEAA", str_array12);
    java.io.File file21 = randomImageCommand20.getRandomFile();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file21);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("\uD83D\uDEAA", (int)'#', timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.lang.Long[] long_array7 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long8);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider12 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext13 = simpleTrackProvider12.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext14 = null;
    simpleTrackProvider12.setLastTrack(audioTrackContext14);
    java.lang.Long[] long_array19 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long20 = new java.util.ArrayList<java.lang.Long>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long20, long_array19);
    simpleTrackProvider12.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long20);
    boolean b23 = simpleTrackProvider0.isUserTrackOwner(10L, (java.util.Collection<java.lang.Long>)arraylist_long20);
    fredboat.audio.queue.AudioTrackContext audioTrackContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.add(audioTrackContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.start((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("qua, 31 dez 1969, 09:00 PM");
    statsAgent1.run();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.startNow((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode1 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider0.setRepeatMode(repeatMode1);
    boolean b3 = simpleTrackProvider0.isEmpty();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.audio.queue.AudioTrackContext audioTrackContext5 = simpleTrackProvider0.getTrack(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + repeatMode1 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode1.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand17 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = reshuffleCommand17.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand17.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    java.lang.String str1 = weatherSystemOpenWeather0.getCountry();
    weatherSystemOpenWeather0.setSunrise((int)(byte)0);
    weatherSystemOpenWeather0.setCountry(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherSystemOpenWeather0.setCountry("en_US");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand7 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.util.AvatarCommand avatarCommand8 = new fredboat.command.util.AvatarCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.util.BrainfuckCommand brainfuckCommand11 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand12 = new fredboat.command.maintenance.GetIdCommand("\uD83D\uDEAA", str_array7);
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
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array14);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather0, "\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str2 = weatherError1.getDataProviderIcon();
    java.lang.String str3 = weatherError1.getFormattedDate();
    java.lang.String str4 = weatherError1.getThumbnailUrl();
    java.lang.String str5 = weatherError1.getLocation();
    java.lang.String str6 = weatherError1.getLocation();
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

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("DJ", str_array10);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = enableCommandsCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand8 = new fredboat.command.music.control.LeaveCommand("hi!", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("hi!", str_array6);
    fredboat.command.music.control.PauseCommand pauseCommand10 = new fredboat.command.music.control.PauseCommand("hi!", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = pauseCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext6 = simpleTrackProvider0.getTracksInRange((int)(byte)10, 10000);
    fredboat.audio.queue.AudioTrackContext audioTrackContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.add(audioTrackContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext6);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext6 = simpleTrackProvider0.getTracksInRange((int)(byte)10, 10000);
    fredboat.audio.queue.AudioTrackContext audioTrackContext7 = simpleTrackProvider0.peek();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.audio.queue.AudioTrackContext audioTrackContext9 = simpleTrackProvider0.getTrack(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext7);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", (int)(byte)0, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.music.seeking.RestartCommand restartCommand9 = new fredboat.command.music.seeking.RestartCommand("", str_array6);
    fredboat.command.music.control.JoinCommand joinCommand10 = new fredboat.command.music.control.JoinCommand("https://i.imgur.com/YqZuqEB.jpg", str_array6);
    fredboat.command.maintenance.NodesCommand nodesCommand11 = new fredboat.command.maintenance.NodesCommand("fredboat.util.BrainfuckException: ", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = nodesCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("en_US", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = configCommand17.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel19 = configCommand17.getMinimumPerms();
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = configCommand17.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    fredboat.util.GitRepoState gitRepoState1 = new fredboat.util.GitRepoState("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...");

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = leaveCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = leaveCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand12.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand13 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = disableCommandsCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = disableCommandsCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = disableCommandsCommand13.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array7);
    fredboat.command.util.BrainfuckCommand brainfuckCommand12 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = brainfuckCommand12.process("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", context14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("en_US", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("fredboat.util.BrainfuckException: ", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand11 = new fredboat.command.moderation.DisableCommandsCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = evalCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand12.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.DestroyCommand destroyCommand2 = new fredboat.command.music.control.DestroyCommand("Provided by OpenWeatherMap.org", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand17 = new fredboat.command.music.seeking.RestartCommand("Bot Admin", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("Provided by OpenWeatherMap.org", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(100L);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array9);
    fredboat.command.util.CommandsCommand commandsCommand15 = new fredboat.command.util.CommandsCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.util.MathCommand mathCommand7 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand8 = new fredboat.command.music.control.UnpauseCommand("", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = unpauseCommand8.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand8.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("\uD83D\uDEAA", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = joinCommand16.getMinimumPerms();
    int i18 = permissionLevel17.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.USER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    java.lang.String[] str_array8 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand9 = new fredboat.command.fun.HugCommand("", "\u274C", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand10 = new fredboat.command.admin.ReviveCommand("Bot Admin", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = hugCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("", str_array4);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array4);
    fredboat.messaging.internal.Context context7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = nodeAdminCommand6.help(context7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.moderation.LanguageCommand languageCommand11 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand12 = new fredboat.command.music.control.JoinCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
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
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.admin.UpdateCommand updateCommand6 = new fredboat.command.admin.UpdateCommand("", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel9 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel11 = updateCommand6.getMinimumPerms();
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = updateCommand6.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    java.lang.String str1 = weatherOpenWeather0.getDescription();
    java.lang.String str2 = weatherOpenWeather0.getMain();
    weatherOpenWeather0.setMain("Bot Owner");
    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather5 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather5.setDescription("");
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand19 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array18);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array18);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand22 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array18);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array18);
    fredboat.command.music.seeking.RestartCommand restartCommand24 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array18);
    fredboat.command.admin.EvalCommand evalCommand25 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array18);
    fredboat.command.moderation.LanguageCommand languageCommand26 = new fredboat.command.moderation.LanguageCommand("hi!", str_array18);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand27 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather5, languageCommand26);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand28 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather0, languageCommand26);
    weatherOpenWeather0.setMain("https://i.imgur.com/YqZuqEB.jpg");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    java.lang.String[] str_array7 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand8 = new fredboat.command.fun.HugCommand("", "\u274C", str_array7);
    java.lang.String str9 = hugCommand8.getRandomImageUrl();
    java.io.File file10 = hugCommand8.getRandomFile();
    java.io.File file11 = hugCommand8.getRandomFile();
    java.io.File file12 = hugCommand8.getRandomFile();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = hugCommand8.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str9.equals("http://i.imgur.com/NqyOqnj.gif"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file12);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.level = (short)10;
    int i4 = blacklistEntry1.rateLimitReached;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.StopCommand stopCommand2 = new fredboat.command.music.control.StopCommand("qua, 31 dez 1969, 09:00 PM", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("Bot Admin", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("Provided by OpenWeatherMap.org", str_array9);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = nodeAdminCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    int i4 = openWeatherCurrent0.getId();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    java.lang.String str6 = openWeatherCurrent0.getLocation();
    java.lang.String str7 = openWeatherCurrent0.getDataProviderIcon();
    int i8 = openWeatherCurrent0.getDatetime();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather9 = openWeatherCurrent0.getWeather();
    
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
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "https://i.imgur.com/YqZuqEB.jpg"+ "'", str7.equals("https://i.imgur.com/YqZuqEB.jpg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_weatherOpenWeather9);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("qua, 31 dez 1969, 09:00 PM");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.startNow((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("", str_array10);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand16 = new fredboat.command.util.CommandsCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array6);
    textCommand9.msg = "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...";
    java.lang.String str12 = textCommand9.msg;
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = textCommand9.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..."+ "'", str12.equals("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..."));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("");
    java.lang.String str2 = guildConfig1.getLang();
    boolean b3 = guildConfig1.isAutoResume();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "en_US"+ "'", str2.equals("en_US"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    java.lang.String str4 = uConfig0.getRefresh();
    fredboat.db.entity.UConfig uConfig6 = uConfig0.setRefresh("Provided by OpenWeatherMap.org");
    long long7 = uConfig0.getBearerExpiration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.getId();
    blacklistEntry1.rateLimitReachedTimestamp = (-1L);
    blacklistEntry1.level = (byte)0;
    int i10 = blacklistEntry1.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    java.lang.String str1 = weatherOpenWeather0.getDescription();
    java.lang.String str2 = weatherOpenWeather0.getMain();
    weatherOpenWeather0.setMain("Bot Owner");
    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather5 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather5.setDescription("");
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand19 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array18);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("hi!", str_array18);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array18);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand22 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array18);
    fredboat.command.util.BrainfuckCommand brainfuckCommand23 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array18);
    fredboat.command.music.seeking.RestartCommand restartCommand24 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array18);
    fredboat.command.admin.EvalCommand evalCommand25 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array18);
    fredboat.command.moderation.LanguageCommand languageCommand26 = new fredboat.command.moderation.LanguageCommand("hi!", str_array18);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand27 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather5, languageCommand26);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand28 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather0, languageCommand26);
    weatherOpenWeather0.setId((int)(byte)1);
    int i31 = weatherOpenWeather0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand("fredboat.util.BrainfuckException: \u2705", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.lang.Long[] long_array7 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long8);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider12 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext13 = simpleTrackProvider12.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext14 = null;
    simpleTrackProvider12.setLastTrack(audioTrackContext14);
    java.lang.Long[] long_array19 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long20 = new java.util.ArrayList<java.lang.Long>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long20, long_array19);
    simpleTrackProvider12.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long20);
    boolean b23 = simpleTrackProvider0.isUserTrackOwner(10L, (java.util.Collection<java.lang.Long>)arraylist_long20);
    boolean b24 = simpleTrackProvider0.isShuffle();
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
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand10 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.fun.FacedeskCommand facedeskCommand11 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array7);
    java.io.File file12 = facedeskCommand11.getRandomFile();
    java.lang.String str13 = facedeskCommand11.getRandomImageUrl();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = facedeskCommand11.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str13.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    int i4 = blacklistEntry1.getRateLimitReached();
    int i5 = blacklistEntry1.level;
    long long6 = blacklistEntry1.blacklistedTimestamp;
    blacklistEntry1.id = (short)100;
    long long9 = blacklistEntry1.blacklistedTimestamp;
    blacklistEntry1.level = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1531609987953L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1531609987953L);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    blacklistEntry1.setBlacklistedTimestamp((long)(short)-1);
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    int i7 = blacklistEntry1.getLevel();
    blacklistEntry1.setLevel(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = shuffleCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = shuffleCommand6.getMinimumPerms();
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = shuffleCommand6.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand8 = new fredboat.command.maintenance.PingCommand("\u274C", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand9 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array6);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand11 = new fredboat.command.moderation.DisableCommandsCommand("Bot Owner", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array15);
    fredboat.command.admin.BotRestartCommand botRestartCommand17 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array15);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand21 = new fredboat.command.util.WeatherCommand(weather1, "\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array15);
    fredboat.command.music.seeking.RewindCommand rewindCommand22 = new fredboat.command.music.seeking.RewindCommand("DJ", str_array15);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = rewindCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand10 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.fun.FacedeskCommand facedeskCommand11 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array7);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = facedeskCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand7 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand8 = new fredboat.command.moderation.EnableCommandsCommand("", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.ExitCommand exitCommand2 = new fredboat.command.admin.ExitCommand("https://i.imgur.com/YqZuqEB.jpg", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    fredboat.util.rest.APILimitException aPILimitException2 = new fredboat.util.rest.APILimitException("en_US");
    fredboat.commandmeta.MessagingException messagingException3 = new fredboat.commandmeta.MessagingException("hi!", (java.lang.Throwable)aPILimitException2);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException4 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)messagingException3);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.BotRestartCommand botRestartCommand15 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.admin.ReviveCommand reviveCommand16 = new fredboat.command.admin.ReviveCommand("", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand17 = new fredboat.command.fun.FacedeskCommand("\u2757", "DJ", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = facedeskCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    fredboat.db.entity.UConfig uConfig5 = uConfig3.setRefresh("\uD83D\uDEAA");
    java.lang.String str6 = uConfig3.getBearer();
    java.lang.String str7 = uConfig3.getUserId();
    fredboat.db.entity.UConfig uConfig9 = uConfig3.setRefresh("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\u2705"+ "'", str6.equals("\u2705"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig9);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.maintenance.PingCommand pingCommand7 = new fredboat.command.maintenance.PingCommand("\u274C", str_array5);
    fredboat.command.music.control.DestroyCommand destroyCommand8 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array5);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    java.lang.String str5 = openWeatherCurrent0.getThumbnailUrl();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str2.equals("Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str4.equals("qua, 31 dez 1969, 09:00 PM"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.util.BrainfuckCommand brainfuckCommand9 = new fredboat.command.util.BrainfuckCommand("", str_array5);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = brainfuckCommand9.process("fredboat.util.BrainfuckException: ", context11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    java.lang.String str1 = weatherOpenWeather0.getDescription();
    weatherOpenWeather0.setDescription(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherOpenWeather0.setIcon("");
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand17 = new fredboat.command.fun.CatgirlCommand("hi!", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand18 = new fredboat.command.moderation.LanguageCommand("en_US", str_array13);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand19 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather0, languageCommand18);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider20 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext21 = null;
    simpleTrackProvider20.setLastTrack(audioTrackContext21);
    fredboat.audio.queue.AudioTrackContext audioTrackContext23 = null;
    simpleTrackProvider20.setLastTrack(audioTrackContext23);
    boolean b25 = simpleTrackProvider20.isEmpty();
    fredboat.audio.queue.RepeatMode repeatMode26 = simpleTrackProvider20.getRepeatMode();
    int i27 = simpleTrackProvider20.size();
    fredboat.util.Tuple2<fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>,fredboat.audio.queue.ITrackProvider> tuple2_tuple2_weatherOpenWeather_languageCommand_iTrackProvider28 = new fredboat.util.Tuple2<fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>,fredboat.audio.queue.ITrackProvider>(tuple2_weatherOpenWeather_languageCommand19, (fredboat.audio.queue.ITrackProvider)simpleTrackProvider20);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.audio.queue.AudioTrackContext audioTrackContext30 = simpleTrackProvider20.getTrack((int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    org.junit.Assert.assertTrue("'" + repeatMode26 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode26.equals(fredboat.audio.queue.RepeatMode.OFF));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.seeking.RestartCommand restartCommand8 = new fredboat.command.music.seeking.RestartCommand("", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "https://i.imgur.com/YqZuqEB.jpg", "https://i.imgur.com/YqZuqEB.jpg", "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand("\u274C", str_array5);
    fredboat.command.music.seeking.RewindCommand rewindCommand7 = new fredboat.command.music.seeking.RewindCommand("\uD83D\uDCDD", str_array5);
    java.lang.String[] str_array17 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array17);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array17);
    fredboat.command.fun.TextCommand textCommand20 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array17);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand21 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array17);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand22 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array17);
    fredboat.command.util.CommandsCommand commandsCommand23 = new fredboat.command.util.CommandsCommand("https://i.imgur.com/YqZuqEB.jpg", str_array17);
    fredboat.util.Tuple2<fredboat.command.music.seeking.RewindCommand,fredboat.commandmeta.abs.IUtilCommand> tuple2_rewindCommand_iUtilCommand24 = new fredboat.util.Tuple2<fredboat.command.music.seeking.RewindCommand,fredboat.commandmeta.abs.IUtilCommand>(rewindCommand7, (fredboat.commandmeta.abs.IUtilCommand)commandsCommand23);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = commandsCommand23.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array13);
    fredboat.command.fun.HugCommand hugCommand20 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array13);
    fredboat.command.admin.EvalCommand evalCommand21 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array13);
    fredboat.command.util.CommandsCommand commandsCommand22 = new fredboat.command.util.CommandsCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    remoteFileCommand9.url = "\u274C";
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = remoteFileCommand9.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.UnpauseCommand unpauseCommand2 = new fredboat.command.music.control.UnpauseCommand("Bot Owner", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand11 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.fun.FacedeskCommand facedeskCommand12 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array9);
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand("DJ", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = shuffleCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.admin.UpdateCommand updateCommand9 = new fredboat.command.admin.UpdateCommand("", str_array7);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand10 = new fredboat.command.moderation.DisableCommandsCommand("en_US", str_array7);
    fredboat.command.music.seeking.RewindCommand rewindCommand11 = new fredboat.command.music.seeking.RewindCommand("fredboat.util.BrainfuckException: ", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("hi!", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array9);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.RewindCommand rewindCommand12 = new fredboat.command.music.seeking.RewindCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = rewindCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = rewindCommand12.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.StopCommand stopCommand10 = new fredboat.command.music.control.StopCommand("hi!", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = enableCommandsCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    remoteFileCommand9.url = "en_US";
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand9.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\u274C"+ "'", str10.equals("\u274C"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("Bot Admin", str_array11);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params16 = fredboat.util.rest.Http.Params.of(str_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand11 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.perms.PermissionLevel permissionLevel12 = botRestartCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = botRestartCommand11.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = botRestartCommand11.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.command.music.seeking.RewindCommand rewindCommand11 = new fredboat.command.music.seeking.RewindCommand("\u2705", str_array6);
    fredboat.perms.PermissionLevel permissionLevel12 = rewindCommand11.getMinimumPerms();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = rewindCommand11.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand18 = new fredboat.command.fun.RemoteFileCommand("https://i.imgur.com/YqZuqEB.jpg", "\u2705", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\u2705", str_array9);
    java.io.File file16 = rollCommand15.getRandomFile();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file16);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand14 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    fredboat.audio.queue.PlaylistInfo.Source source4 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo5 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source4);
    fredboat.audio.queue.PlaylistInfo playlistInfo6 = new fredboat.audio.queue.PlaylistInfo(0, "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", source4);
    playlistInfo6.setTotalTracks((int)(byte)100);
    playlistInfo6.setName("DJ");
    playlistInfo6.setTotalTracks(0);
    org.junit.Assert.assertTrue("'" + source4 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source4.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.perms.PermissionLevel permissionLevel16 = playSplitCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("");
    guildConfig1.setAutoResume(false);
    boolean b4 = guildConfig1.isAutoResume();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.lang.Long[] long_array7 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long8);
    fredboat.audio.queue.AudioTrackContext audioTrackContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.add(audioTrackContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array16 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array16);
    fredboat.command.admin.BotRestartCommand botRestartCommand18 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand19 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array16);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand20 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array16);
    fredboat.command.util.WeatherCommand weatherCommand22 = new fredboat.command.util.WeatherCommand(weather2, "\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array16);
    fredboat.command.music.seeking.RewindCommand rewindCommand23 = new fredboat.command.music.seeking.RewindCommand("DJ", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array16);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = disableCommandsCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand17 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand20 = new fredboat.command.maintenance.AudioDebugCommand("\uD83D\uDCDD", str_array11);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = audioDebugCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand3 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array2);
    fredboat.commandmeta.abs.CommandContext commandContext4 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand3.onInvoke(commandContext4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand19 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array12);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("Bot Owner", str_array12);
    fredboat.command.util.WeatherCommand weatherCommand21 = new fredboat.command.util.WeatherCommand(weather0, "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    remoteFileCommand9.url = "hi!";
    java.lang.String str12 = remoteFileCommand9.url;
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = remoteFileCommand9.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand12 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand13 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array9);
    fredboat.command.fun.HugCommand hugCommand14 = new fredboat.command.fun.HugCommand("Bot Owner", "Bot Admin", str_array9);
    java.io.File file15 = hugCommand14.getRandomFile();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = hugCommand14.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file15);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("qua, 31 dez 1969, 09:00 PM", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = destroyCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.RepeatMode repeatMode2 = fredboat.audio.queue.RepeatMode.OFF;
    simpleTrackProvider0.setRepeatMode(repeatMode2);
    simpleTrackProvider0.setShuffle(false);
    fredboat.audio.queue.AudioTrackContext audioTrackContext6 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.add(audioTrackContext6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    org.junit.Assert.assertTrue("'" + repeatMode2 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode2.equals(fredboat.audio.queue.RepeatMode.OFF));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

    fredboat.util.rest.APILimitException aPILimitException1 = new fredboat.util.rest.APILimitException("DJ");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException2 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)aPILimitException1);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.control.DestroyCommand destroyCommand7 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array4);
    fredboat.perms.PermissionLevel permissionLevel8 = destroyCommand7.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel9 = destroyCommand7.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = destroyCommand7.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand7.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("en_US", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("en_US", str_array10);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = brainfuckCommand18.process("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", context20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("", str_array4);
    fredboat.command.music.control.LeaveCommand leaveCommand6 = new fredboat.command.music.control.LeaveCommand("hi!", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand6.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = leaveCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = leaveCommand12.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand8 = new fredboat.command.music.control.LeaveCommand("hi!", str_array6);
    fredboat.command.moderation.LanguageCommand languageCommand9 = new fredboat.command.moderation.LanguageCommand("DJ", str_array6);
    fredboat.command.admin.BotRestartCommand botRestartCommand10 = new fredboat.command.admin.BotRestartCommand("en_US", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather0 = new fredboat.util.rest.models.weather.CloudsOpenWeather();
    cloudsOpenWeather0.setAll((int)(short)0);
    cloudsOpenWeather0.setAll((int)(short)1);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("hi!");
    guildConfig1.setLang("\u2757");
    boolean b4 = guildConfig1.isTrackAnnounce();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    fredboat.audio.queue.PlaylistInfo.Source source6 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo7 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source6);
    fredboat.audio.queue.PlaylistInfo playlistInfo8 = new fredboat.audio.queue.PlaylistInfo(0, "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", source6);
    fredboat.audio.queue.PlaylistInfo playlistInfo9 = new fredboat.audio.queue.PlaylistInfo((int)(byte)100, "Provided by OpenWeatherMap.org", source6);
    playlistInfo9.setName("Bot Admin");
    fredboat.audio.queue.PlaylistInfo.Source source16 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo17 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source16);
    fredboat.audio.queue.PlaylistInfo playlistInfo18 = new fredboat.audio.queue.PlaylistInfo(0, "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", source16);
    int i19 = playlistInfo18.getTotalTracks();
    playlistInfo18.setTotalTracks((int)(short)1);
    playlistInfo18.setTotalTracks(97);
    fredboat.audio.queue.PlaylistInfo.Source source24 = playlistInfo18.getSource();
    playlistInfo9.setSource(source24);
    org.junit.Assert.assertTrue("'" + source6 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source6.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    org.junit.Assert.assertTrue("'" + source16 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source16.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    org.junit.Assert.assertTrue("'" + source24 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source24.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand10 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.util.BrainfuckCommand brainfuckCommand11 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand12 = new fredboat.command.maintenance.GetIdCommand("\uD83D\uDEAA", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = getIdCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array3);
    fredboat.command.moderation.LanguageCommand languageCommand5 = new fredboat.command.moderation.LanguageCommand("", str_array3);
    fredboat.messaging.internal.Context context6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = languageCommand5.help(context6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("en_US", str_array10);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("");
    fredboat.db.entity.UConfig uConfig3 = uConfig1.setBearerExpiration((-1L));
    java.lang.String str4 = uConfig1.getBearer();
    fredboat.db.entity.UConfig uConfig6 = uConfig1.setUserId("qua, 31 dez 1969, 09:00 PM");
    fredboat.db.entity.UConfig uConfig8 = uConfig1.setBearerExpiration(1531609948276L);
    long long9 = uConfig8.getBearerExpiration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1531609948276L);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array16 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array16);
    fredboat.command.admin.BotRestartCommand botRestartCommand18 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand19 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array16);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand20 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array16);
    fredboat.command.util.WeatherCommand weatherCommand22 = new fredboat.command.util.WeatherCommand(weather2, "\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array16);
    fredboat.command.music.seeking.RewindCommand rewindCommand23 = new fredboat.command.music.seeking.RewindCommand("DJ", str_array16);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand24 = new fredboat.command.moderation.DisableCommandsCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array16);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

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
    java.util.List<java.lang.String> list_str18 = guildPermissions0.getDjList();
    fredboat.perms.PermissionLevel permissionLevel19 = null;
    fredboat.db.entity.GuildPermissions guildPermissions20 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions21 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str22 = guildPermissions21.getDjList();
    guildPermissions20.setUserList(list_str22);
    fredboat.db.entity.GuildPermissions guildPermissions24 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions25 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str26 = guildPermissions25.getDjList();
    guildPermissions24.setUserList(list_str26);
    java.lang.String[] str_array32 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand33 = new fredboat.command.music.control.RepeatCommand("", str_array32);
    fredboat.command.music.control.LeaveCommand leaveCommand34 = new fredboat.command.music.control.LeaveCommand("hi!", str_array32);
    fredboat.perms.PermissionLevel permissionLevel35 = leaveCommand34.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel36 = leaveCommand34.getMinimumPerms();
    java.util.List<java.lang.String> list_str37 = guildPermissions24.getFromEnum(permissionLevel36);
    java.util.List<java.lang.String> list_str38 = guildPermissions24.getAdminList();
    guildPermissions20.setDjList(list_str38);
    // The following exception was thrown during execution in test generation
    try {
    guildPermissions0.setFromEnum(permissionLevel19, list_str38);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    org.junit.Assert.assertTrue("'" + permissionLevel35 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel35.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel36 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel36.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.admin.ExitCommand exitCommand7 = new fredboat.command.admin.ExitCommand("hi!", str_array5);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = setAvatarCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = setAvatarCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel11 = setAvatarCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = setAvatarCommand8.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand8.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand14 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel15 = restartCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand20 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array13);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("Bot Owner", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("qua, 31 dez 1969, 09:00 PM", str_array13);
    fredboat.command.admin.UpdateCommand updateCommand23 = new fredboat.command.admin.UpdateCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array13);
    fredboat.command.admin.BotRestartCommand botRestartCommand24 = new fredboat.command.admin.BotRestartCommand("\u2757", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("Bot Admin", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = testCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand10.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand10 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("", str_array7);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("Bot Admin", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = exitCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    remoteFileCommand9.url = "\u274C";
    java.lang.String str12 = remoteFileCommand9.url;
    java.lang.String str13 = remoteFileCommand9.url;
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand9.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\u274C"+ "'", str12.equals("\u274C"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\u274C"+ "'", str13.equals("\u274C"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand20 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array13);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("Bot Owner", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("qua, 31 dez 1969, 09:00 PM", str_array13);
    fredboat.command.admin.UpdateCommand updateCommand23 = new fredboat.command.admin.UpdateCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array13);
    fredboat.command.admin.BotRestartCommand botRestartCommand24 = new fredboat.command.admin.BotRestartCommand("\u2757", str_array13);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = botRestartCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand12 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand14 = new fredboat.command.util.CommandsCommand("hi!", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = commandsCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand12 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand14 = new fredboat.command.maintenance.AudioDebugCommand("en_US", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    fredboat.db.entity.GuildPermissions guildPermissions0 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions1 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str2 = guildPermissions1.getDjList();
    guildPermissions0.setUserList(list_str2);
    fredboat.db.entity.GuildPermissions guildPermissions4 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions5 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str6 = guildPermissions5.getDjList();
    guildPermissions4.setUserList(list_str6);
    java.lang.String[] str_array12 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand13 = new fredboat.command.music.control.RepeatCommand("", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("hi!", str_array12);
    fredboat.perms.PermissionLevel permissionLevel15 = leaveCommand14.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel16 = leaveCommand14.getMinimumPerms();
    java.util.List<java.lang.String> list_str17 = guildPermissions4.getFromEnum(permissionLevel16);
    java.util.List<java.lang.String> list_str18 = guildPermissions4.getAdminList();
    guildPermissions0.setDjList(list_str18);
    java.util.List<java.lang.String> list_str20 = guildPermissions0.getAdminList();
    java.lang.String[] str_array29 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand30 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array29);
    fredboat.command.music.control.ShuffleCommand shuffleCommand31 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array29);
    fredboat.command.fun.TextCommand textCommand32 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array29);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand33 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array29);
    fredboat.command.admin.ReviveCommand reviveCommand34 = new fredboat.command.admin.ReviveCommand("", str_array29);
    fredboat.perms.PermissionLevel permissionLevel35 = reviveCommand34.getMinimumPerms();
    java.lang.String str36 = permissionLevel35.getName();
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str37 = guildPermissions0.getFromEnum(permissionLevel35);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    org.junit.Assert.assertTrue("'" + permissionLevel35 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel35.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Bot Admin"+ "'", str36.equals("Bot Admin"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.admin.UpdateCommand updateCommand8 = new fredboat.command.admin.UpdateCommand("", str_array6);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand9 = new fredboat.command.moderation.DisableCommandsCommand("en_US", str_array6);
    fredboat.command.music.seeking.RewindCommand rewindCommand10 = new fredboat.command.music.seeking.RewindCommand("fredboat.util.BrainfuckException: ", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = rewindCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.RepeatMode repeatMode2 = fredboat.audio.queue.RepeatMode.OFF;
    simpleTrackProvider0.setRepeatMode(repeatMode2);
    fredboat.audio.queue.AudioTrackContext audioTrackContext4 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext4);
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.reshuffle();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    org.junit.Assert.assertTrue("'" + repeatMode2 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode2.equals(fredboat.audio.queue.RepeatMode.OFF));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.getId();
    blacklistEntry1.setLevel(0);
    blacklistEntry1.setRateLimitReached((int)(byte)100);
    long long10 = blacklistEntry1.id;
    blacklistEntry1.id = 5;
    blacklistEntry1.blacklistedTimestamp = 'a';
    int i15 = blacklistEntry1.level;
    long long16 = blacklistEntry1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 5L);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array10);
    fredboat.command.util.WeatherCommand weatherCommand14 = new fredboat.command.util.WeatherCommand(weather2, "Bot Admin", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("\u2757", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = setAvatarCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    simpleTrackProvider0.skipped();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext2 = simpleTrackProvider0.getAsListOrdered();
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.reshuffle();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext2);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("", str_array4);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand6.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("en_US", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = pauseCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

    fredboat.util.rest.APILimitException aPILimitException1 = new fredboat.util.rest.APILimitException("fredboat.util.BrainfuckException: \uD83D\uDEAA");

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array3);
    fredboat.command.music.info.ListCommand listCommand5 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array3);
    fredboat.commandmeta.abs.CommandContext commandContext6 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand5.onInvoke(commandContext6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = rewindCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = rewindCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = rewindCommand13.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "\uD83D\uDEAA", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand14 = new fredboat.command.music.control.JoinCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = joinCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "fredboat.util.BrainfuckException: \u2705", str_array6);
    textCommand10.msg = "en_US";
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand10.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.info.ListCommand listCommand6 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array4);
    fredboat.command.admin.TestCommand testCommand7 = new fredboat.command.admin.TestCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.perms.PermissionLevel permissionLevel8 = testCommand7.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand7.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("en_US");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.start((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand11 = new fredboat.command.music.seeking.RestartCommand("", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand14 = new fredboat.command.util.CommandsCommand("Bot Owner", str_array8);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\u2757", str_array8);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = listCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand13 = new fredboat.command.admin.ReviveCommand("fredboat.util.BrainfuckException: \u2705", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = reviveCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("DJ", "hi!", str_array9);
    java.lang.String str16 = hugCommand15.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str16.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }

    fredboat.audio.queue.PlaylistInfo.Source source2 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo3 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source2);
    playlistInfo3.setName("hi!");
    playlistInfo3.setTotalTracks((int)(short)1);
    org.junit.Assert.assertTrue("'" + source2 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source2.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand14 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.rateLimitReached = 10;
    blacklistEntry1.rateLimitReachedTimestamp = 1531609944902L;
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    long long7 = blacklistEntry1.getRateLimitReachedTimestamp();
    blacklistEntry1.rateLimitReachedTimestamp = 35;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1531609998631L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1531609944902L);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand10 = new fredboat.command.music.seeking.RestartCommand("", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array7);
    fredboat.command.fun.PatCommand patCommand12 = new fredboat.command.fun.PatCommand("hi!", "hi!", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    int i4 = blacklistEntry1.getRateLimitReached();
    blacklistEntry1.setRateLimitReachedTimestamp(1531609954368L);
    // The following exception was thrown during execution in test generation
    try {
    blacklistEntry1.setId(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    simpleTrackProvider0.setShuffle(true);
    simpleTrackProvider0.skipped();
    long long5 = simpleTrackProvider0.getDurationMillis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("Bot Admin", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand12 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array7);
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
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand2 = new fredboat.command.moderation.EnableCommandsCommand("en_US", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.admin.UpdateCommand updateCommand6 = new fredboat.command.admin.UpdateCommand("", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = updateCommand6.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand6.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    fredboat.util.rest.models.weather.WeatherError weatherError2 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str3 = weatherError2.getTemperature();
    boolean b4 = weatherError2.isError();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand11 = new fredboat.command.moderation.DisableCommandsCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    int i3 = openWeatherCurrent0.getVisibility();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather4 = openWeatherCurrent0.getMain();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather4);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("en_US", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("fredboat.util.BrainfuckException: ", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = reshuffleCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }

    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException4 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException3);
    fredboat.commandmeta.MessagingException messagingException5 = new fredboat.commandmeta.MessagingException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException3);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException6 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)brainfuckException3);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }

    fredboat.util.rest.Weather weather3 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array14);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand17 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array14);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand19 = new fredboat.command.music.control.ShuffleCommand("DJ", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather3, "\uD83D\uDEAA", str_array14);
    fredboat.command.music.control.LeaveCommand leaveCommand21 = new fredboat.command.music.control.LeaveCommand("qua, 31 dez 1969, 09:00 PM", str_array14);
    fredboat.command.fun.FacedeskCommand facedeskCommand22 = new fredboat.command.fun.FacedeskCommand("\u2757", "\u2705", str_array14);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = facedeskCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.admin.TestCommand testCommand16 = new fredboat.command.admin.TestCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand17 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = nodesCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.startNow((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }

    java.lang.Throwable throwable0 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException1 = new fredboat.db.DatabaseNotReadyException(throwable0);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    java.lang.String str4 = uConfig0.getUserId();
    fredboat.db.entity.UConfig uConfig6 = uConfig0.setUserId("\u2705");
    java.lang.String str7 = uConfig6.getRefresh();
    
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

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand12 = new fredboat.command.music.control.JoinCommand("\u2705", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = joinCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = joinCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand12.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand14 = new fredboat.command.admin.ReviveCommand("", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = reviveCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("en_US");
    uConfig1.setId("http://i.imgur.com/NqyOqnj.gif");

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.info.ListCommand listCommand6 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array4);
    fredboat.command.music.seeking.RestartCommand restartCommand7 = new fredboat.command.music.seeking.RestartCommand("Bot Admin", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand("fredboat.util.BrainfuckException: ", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = forwardCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand12.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand12 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand14 = new fredboat.command.util.CommandsCommand("hi!", str_array8);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params15 = fredboat.util.rest.Http.Params.of(str_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }

    java.lang.String[] str_array7 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand8 = new fredboat.command.fun.HugCommand("", "\u274C", str_array7);
    java.lang.String str9 = hugCommand8.getRandomImageUrl();
    java.io.File file10 = hugCommand8.getRandomFile();
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = hugCommand8.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str9.equals("http://i.imgur.com/NqyOqnj.gif"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file10);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    int i1 = weatherOpenWeather0.getId();
    weatherOpenWeather0.setId((int)(byte)100);
    weatherOpenWeather0.setMain("hi!");
    weatherOpenWeather0.setIcon("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand11 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.fun.FacedeskCommand facedeskCommand12 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = setAvatarCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    // The following exception was thrown during execution in test generation
    try {
    blacklistEntry1.setId("Bot Admin");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext6 = simpleTrackProvider0.getTracksInRange((int)(byte)10, 10000);
    fredboat.audio.queue.AudioTrackContext audioTrackContext7 = simpleTrackProvider0.peek();
    boolean b8 = simpleTrackProvider0.isEmpty();
    fredboat.audio.queue.AudioTrackContext audioTrackContext9 = simpleTrackProvider0.peek();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.audio.queue.AudioTrackContext audioTrackContext11 = simpleTrackProvider0.getTrack(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.rateLimitReached = 10;
    blacklistEntry1.level = '#';
    int i6 = blacklistEntry1.level;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand16 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("Provided by OpenWeatherMap.org", str_array11);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("hi!", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "https://i.imgur.com/YqZuqEB.jpg", "https://i.imgur.com/YqZuqEB.jpg", "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand("\u274C", str_array7);
    fredboat.command.music.seeking.RewindCommand rewindCommand9 = new fredboat.command.music.seeking.RewindCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.seeking.RewindCommand rewindCommand10 = new fredboat.command.music.seeking.RewindCommand("fredboat.util.BrainfuckException: ", str_array7);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand11 = new fredboat.command.fun.DanceCommand("https://i.imgur.com/YqZuqEB.jpg", str_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = botRestartCommand16.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand16.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }

    fredboat.util.rest.APILimitException aPILimitException1 = new fredboat.util.rest.APILimitException("qua, 31 dez 1969, 09:00 PM");
    fredboat.util.BrainfuckException brainfuckException4 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    fredboat.util.BrainfuckException brainfuckException5 = new fredboat.util.BrainfuckException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException4);
    aPILimitException1.addSuppressed((java.lang.Throwable)brainfuckException4);
    java.lang.String str7 = brainfuckException4.toString();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException8 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)brainfuckException4);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org"+ "'", str7.equals("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.util.MathCommand mathCommand7 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand8 = new fredboat.command.music.control.UnpauseCommand("", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = unpauseCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = unpauseCommand8.getMinimumPerms();
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = unpauseCommand8.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("en_US", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = pauseCommand16.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand16.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand14 = new fredboat.command.admin.ReviveCommand("Bot Admin", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = reviveCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("en_US", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("Provided by OpenWeatherMap.org", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.SeekCommand seekCommand13 = new fredboat.command.music.seeking.SeekCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = shuffleCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = shuffleCommand6.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand6.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand7 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = serverInfoCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }

    fredboat.util.BrainfuckException brainfuckException2 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException2);
    java.lang.Throwable[] throwable_array4 = brainfuckException3.getSuppressed();
    fredboat.util.BrainfuckException brainfuckException6 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array7 = brainfuckException6.getSuppressed();
    brainfuckException3.addSuppressed((java.lang.Throwable)brainfuckException6);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException9 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)brainfuckException3);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array7);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    boolean b1 = openWeatherCurrent0.isError();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather2 = openWeatherCurrent0.getMain();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather2);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.maintenance.PingCommand pingCommand11 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array7);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand("https://i.imgur.com/YqZuqEB.jpg", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = shuffleCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = shuffleCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel9 = shuffleCommand6.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand6.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.setBlacklistedTimestamp(1L);
    // The following exception was thrown during execution in test generation
    try {
    blacklistEntry1.setId("\uD83D\uDCDD");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand11 = new fredboat.command.moderation.DisableCommandsCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = evalCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = evalCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand12.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand19 = new fredboat.command.music.control.PauseCommand("en_US", str_array12);
    fredboat.command.music.seeking.SeekCommand seekCommand20 = new fredboat.command.music.seeking.SeekCommand("", str_array12);
    fredboat.command.fun.FacedeskCommand facedeskCommand21 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: \u2705", "Bot Owner", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("\u274C", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = versionCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.command.music.seeking.RestartCommand restartCommand7 = new fredboat.command.music.seeking.RestartCommand("", str_array4);
    java.util.List<java.lang.String> list_str8 = restartCommand7.aliases;
    fredboat.perms.PermissionLevel permissionLevel9 = restartCommand7.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = restartCommand7.getMinimumPerms();
    java.lang.String str11 = permissionLevel10.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "DJ"+ "'", str11.equals("DJ"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    int i5 = openWeatherCurrent0.getDatetime();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather6 = openWeatherCurrent0.getSys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str2.equals("Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str4.equals("qua, 31 dez 1969, 09:00 PM"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather6);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }

    java.lang.String[] str_array9 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand10 = new fredboat.command.fun.HugCommand("", "\u274C", str_array9);
    fredboat.command.admin.ReviveCommand reviveCommand11 = new fredboat.command.admin.ReviveCommand("Bot Admin", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("\uD83D\uDCDD", str_array9);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = leaveCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand9 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = playSplitCommand9.getMinimumPerms();
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = playSplitCommand9.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather0.setDescription("");
    java.lang.String str3 = weatherOpenWeather0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "Bot Admin", str_array9);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = stopCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = weatherError1.errorType();
    java.lang.String str3 = weatherError1.getWeatherDescription();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));
    org.junit.Assert.assertTrue("'" + errorCode2 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode2.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand19 = new fredboat.command.maintenance.VersionCommand("en_US", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("en_US", str_array12);
    fredboat.command.util.WeatherCommand weatherCommand21 = new fredboat.command.util.WeatherCommand(weather0, "\u274C", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = weatherCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    remoteFileCommand9.url = "\u274C";
    java.lang.String str12 = remoteFileCommand9.url;
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand9.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\u274C"+ "'", str12.equals("\u274C"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (-1), timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.StopCommand stopCommand10 = new fredboat.command.music.control.StopCommand("hi!", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }

    java.lang.String[] str_array2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.RemoteFileCommand remoteFileCommand3 = new fredboat.command.fun.RemoteFileCommand("http://i.imgur.com/NqyOqnj.gif", "fredboat.util.BrainfuckException: ", str_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.util.MathCommand mathCommand15 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("", str_array13);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand18 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand20 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand22 = new fredboat.command.util.WeatherCommand(weather0, "", str_array13);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = weatherCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.getId();
    blacklistEntry1.rateLimitReachedTimestamp = (-1L);
    long long8 = blacklistEntry1.id;
    long long9 = blacklistEntry1.rateLimitReachedTimestamp;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.NodesCommand nodesCommand9 = new fredboat.command.maintenance.NodesCommand("", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand10 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("Bot Owner", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = unblacklistCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand15 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("\uD83D\uDCDD", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand("Base", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = brainfuckCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(10L);
    blacklistEntry1.setRateLimitReachedTimestamp(1531609939130L);
    blacklistEntry1.setRateLimitReachedTimestamp((long)(short)0);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather0.setMain(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherOpenWeather0.setDescription("http://i.imgur.com/NqyOqnj.gif");
    weatherOpenWeather0.setId(35);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("Bot Admin");

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }

    fredboat.util.GitRepoState gitRepoState0 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str1 = gitRepoState0.commitMessageShort;
    java.lang.String str2 = gitRepoState0.commitUserName;
    java.lang.String str3 = gitRepoState0.commitMessageFull;
    java.lang.String str4 = gitRepoState0.commitTime;
    java.lang.String str5 = gitRepoState0.branch;
    java.lang.String str6 = gitRepoState0.commitTime;
    java.lang.String str7 = gitRepoState0.branch;
    java.lang.String str8 = gitRepoState0.commitId;
    
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

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("\u2705");
    statsAgent1.run();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.start((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand12 = new fredboat.command.music.control.JoinCommand("\u2705", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = joinCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("en_US", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("en_US", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = serverInfoCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.LeaveCommand leaveCommand2 = new fredboat.command.music.control.LeaveCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.maintenance.NodesCommand nodesCommand8 = new fredboat.command.maintenance.NodesCommand("", str_array5);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand9 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.SeekCommand seekCommand13 = new fredboat.command.music.seeking.SeekCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = seekCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.util.AvatarCommand avatarCommand2 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    int i4 = blacklistEntry1.getRateLimitReached();
    int i5 = blacklistEntry1.level;
    long long6 = blacklistEntry1.blacklistedTimestamp;
    long long7 = blacklistEntry1.getRateLimitReachedTimestamp();
    blacklistEntry1.setLevel((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1531610008191L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 100L);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("\u274C", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather1, "https://i.imgur.com/YqZuqEB.jpg", str_array11);
    fredboat.command.admin.UpdateCommand updateCommand19 = new fredboat.command.admin.UpdateCommand("Provided by OpenWeatherMap.org", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array10);
    fredboat.command.admin.UpdateCommand updateCommand16 = new fredboat.command.admin.UpdateCommand("\uD83D\uDCDD", str_array10);
    fredboat.command.admin.UpdateCommand updateCommand17 = new fredboat.command.admin.UpdateCommand("\uD83D\uDEAA", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = updateCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand19 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array12);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("Bot Owner", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("qua, 31 dez 1969, 09:00 PM", str_array12);
    fredboat.command.admin.UpdateCommand updateCommand22 = new fredboat.command.admin.UpdateCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = updateCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("\u274C", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("\u2757", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.level = (short)10;
    long long4 = blacklistEntry1.blacklistedTimestamp;
    long long5 = blacklistEntry1.rateLimitReachedTimestamp;
    blacklistEntry1.id = 1531609969962L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1531610008386L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.admin.UpdateCommand updateCommand10 = new fredboat.command.admin.UpdateCommand("", str_array8);
    fredboat.command.fun.FacedeskCommand facedeskCommand11 = new fredboat.command.fun.FacedeskCommand("Bot Admin", "qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand13 = new fredboat.command.music.control.PlaySplitCommand("\u274C", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = playSplitCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand13.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = shuffleCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = shuffleCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel9 = shuffleCommand6.getMinimumPerms();
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = shuffleCommand6.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }

    java.lang.String[] str_array8 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand9 = new fredboat.command.fun.HugCommand("", "\u274C", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand10 = new fredboat.command.admin.ReviveCommand("Bot Admin", str_array8);
    fredboat.perms.PermissionLevel permissionLevel11 = reviveCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand10.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("en_US", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("en_US", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = brainfuckCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = commandsCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2705", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = serverInfoCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand10 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("Bot Admin", str_array6);
    fredboat.perms.PermissionLevel permissionLevel12 = destroyCommand11.getMinimumPerms();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = destroyCommand11.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getCode();
    int i4 = openWeatherCurrent0.getDatetime();
    java.lang.String str5 = openWeatherCurrent0.getDataProviderString();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather6 = openWeatherCurrent0.getWeather();
    java.lang.String str7 = openWeatherCurrent0.getThumbnailUrl();
    int i8 = openWeatherCurrent0.getVisibility();
    java.lang.String str9 = openWeatherCurrent0.getThumbnailUrl();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str2.equals("Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str5.equals("Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_weatherOpenWeather6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("Bot Admin", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("https://i.imgur.com/YqZuqEB.jpg", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.maintenance.GetIdCommand getIdCommand9 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand10 = new fredboat.command.maintenance.GitInfoCommand("", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand("", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand14 = new fredboat.command.maintenance.PingCommand("Bot Admin", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = pingCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand17 = new fredboat.command.fun.CatgirlCommand("", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand18 = new fredboat.command.maintenance.AudioDebugCommand("\u2757", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = audioDebugCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand("fredboat.util.BrainfuckException: \u2705", str_array6);
    fredboat.command.music.info.HistoryCommand historyCommand11 = new fredboat.command.music.info.HistoryCommand("https://i.imgur.com/YqZuqEB.jpg", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = historyCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext6 = simpleTrackProvider0.getTracksInRange((int)(byte)10, 10000);
    simpleTrackProvider0.clear();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider8 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext9 = simpleTrackProvider8.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext10 = null;
    simpleTrackProvider8.setLastTrack(audioTrackContext10);
    java.lang.Long[] long_array15 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long16 = new java.util.ArrayList<java.lang.Long>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long16, long_array15);
    simpleTrackProvider8.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long16);
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand24 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array23);
    fredboat.command.admin.ExitCommand exitCommand25 = new fredboat.command.admin.ExitCommand("hi!", str_array23);
    java.util.List<java.lang.String> list_str26 = exitCommand25.aliases;
    fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand> tuple2_arraylist_long_exitCommand27 = new fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand>(arraylist_long16, exitCommand25);
    java.util.ArrayList<java.lang.Long> arraylist_long28 = tuple2_arraylist_long_exitCommand27.a;
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long28);
    fredboat.audio.queue.AudioTrackContext audioTrackContext30 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext30);
    fredboat.audio.queue.AudioTrackContext audioTrackContext32 = simpleTrackProvider0.provideAudioTrack();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.audio.queue.AudioTrackContext audioTrackContext34 = simpleTrackProvider0.getTrack((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext32);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather4 = openWeatherCurrent0.getWeather();
    int i5 = openWeatherCurrent0.getId();
    openWeatherCurrent0.setId(2);
    java.lang.String str8 = openWeatherCurrent0.getName();
    
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
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand13 = new fredboat.command.moderation.DisableCommandsCommand("Bot Admin", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = disableCommandsCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand13.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("hi!", str_array8);
    fredboat.command.fun.RandomImageCommand randomImageCommand13 = new fredboat.command.fun.RandomImageCommand("\u274C", "\uD83D\uDCDD", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.perms.PermissionLevel permissionLevel15 = nodeAdminCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    java.lang.String str11 = remoteFileCommand9.url;
    remoteFileCommand9.url = "Bot Owner";
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = remoteFileCommand9.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\u274C"+ "'", str10.equals("\u274C"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\u274C"+ "'", str11.equals("\u274C"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }

    fredboat.util.rest.Weather weather5 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand17 = new fredboat.command.util.WeatherCommand(weather5, "Bot Admin", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("\u2757", str_array13);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: ", str_array13);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("https://i.imgur.com/YqZuqEB.jpg", "", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("\u274C", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("\u2757", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = pingCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("");
    fredboat.db.entity.UConfig uConfig3 = uConfig1.setBearerExpiration((-1L));
    java.lang.String str4 = uConfig1.getBearer();
    fredboat.db.entity.UConfig uConfig6 = uConfig1.setUserId("qua, 31 dez 1969, 09:00 PM");
    java.lang.String str7 = uConfig6.getRefresh();
    java.lang.String str8 = uConfig6.getBearer();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.info.ListCommand listCommand6 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array4);
    fredboat.command.music.seeking.RestartCommand restartCommand7 = new fredboat.command.music.seeking.RestartCommand("Bot Admin", str_array4);
    fredboat.perms.PermissionLevel permissionLevel8 = restartCommand7.getMinimumPerms();
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = restartCommand7.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.maintenance.PingCommand pingCommand9 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array5);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = pingCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.lang.Long[] long_array7 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long8);
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array15);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("hi!", str_array15);
    java.util.List<java.lang.String> list_str18 = exitCommand17.aliases;
    fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand> tuple2_arraylist_long_exitCommand19 = new fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand>(arraylist_long8, exitCommand17);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = exitCommand17.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str18);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand16 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array11);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array11);
    java.io.File file19 = hugCommand18.getRandomFile();
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand18.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file19);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand12 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("https://i.imgur.com/YqZuqEB.jpg", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("Bot Owner", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.maintenance.GetIdCommand getIdCommand2 = new fredboat.command.maintenance.GetIdCommand("en_US", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand10 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("", str_array7);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("en_US", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.RepeatMode repeatMode2 = fredboat.audio.queue.RepeatMode.OFF;
    simpleTrackProvider0.setRepeatMode(repeatMode2);
    simpleTrackProvider0.setShuffle(false);
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.reshuffle();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    org.junit.Assert.assertTrue("'" + repeatMode2 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode2.equals(fredboat.audio.queue.RepeatMode.OFF));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array10);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array10);
    java.lang.String str13 = textCommand12.msg;
    java.lang.String str14 = textCommand12.msg;
    java.lang.String str15 = textCommand12.msg;
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = textCommand12.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str13.equals("qua, 31 dez 1969, 09:00 PM"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str14.equals("qua, 31 dez 1969, 09:00 PM"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str15.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = leaveCommand12.getMinimumPerms();
    java.lang.String str14 = permissionLevel13.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "DJ"+ "'", str14.equals("DJ"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("en_US", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("fredboat.util.BrainfuckException: ", str_array11);
    fredboat.perms.PermissionLevel permissionLevel20 = reshuffleCommand19.getMinimumPerms();
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = reshuffleCommand19.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.info.ListCommand listCommand6 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array4);
    fredboat.command.music.seeking.RestartCommand restartCommand7 = new fredboat.command.music.seeking.RestartCommand("Bot Admin", str_array4);
    fredboat.perms.PermissionLevel permissionLevel8 = restartCommand7.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand7.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand20 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array13);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("Bot Owner", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("qua, 31 dez 1969, 09:00 PM", str_array13);
    fredboat.command.fun.TextCommand textCommand23 = new fredboat.command.fun.TextCommand("Bot Admin", "Bot Admin", str_array13);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = textCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand2 = new fredboat.command.fun.DanceCommand("\u2757", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.id;
    blacklistEntry1.setBlacklistedTimestamp((long)(short)-1);
    long long8 = blacklistEntry1.getRateLimitReachedTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 100L);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("Bot Admin", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = historyCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.info.HistoryCommand historyCommand7 = new fredboat.command.music.info.HistoryCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = historyCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.level = (short)10;
    long long4 = blacklistEntry1.blacklistedTimestamp;
    long long5 = blacklistEntry1.getId();
    int i6 = blacklistEntry1.level;
    // The following exception was thrown during execution in test generation
    try {
    blacklistEntry1.setId("Bot Owner");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1531610018129L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("Bot Admin", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("https://i.imgur.com/YqZuqEB.jpg", str_array10);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params18 = fredboat.util.rest.Http.Params.of(str_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)");

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand("en_US", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = versionCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = configCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = configCommand15.getMinimumPerms();
    int i18 = permissionLevel17.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BASE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand11 = new fredboat.command.util.BrainfuckCommand("\uD83D\uDCDD", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = brainfuckCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand11 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand12 = new fredboat.command.maintenance.GetIdCommand("DJ", str_array7);
    fredboat.command.admin.TestCommand testCommand13 = new fredboat.command.admin.TestCommand("Base", str_array7);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = testCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    remoteFileCommand9.url = "\u274C";
    java.lang.String str12 = remoteFileCommand9.url;
    java.lang.String str13 = remoteFileCommand9.url;
    java.lang.String str14 = remoteFileCommand9.url;
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = remoteFileCommand9.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "\u274C"+ "'", str12.equals("\u274C"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "\u274C"+ "'", str13.equals("\u274C"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\u274C"+ "'", str14.equals("\u274C"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }

    fredboat.db.entity.GuildConfig guildConfig0 = new fredboat.db.entity.GuildConfig();
    java.lang.String str1 = guildConfig0.getGuildId();
    boolean b2 = guildConfig0.isTrackAnnounce();
    java.lang.String str3 = guildConfig0.getLang();
    java.lang.String str4 = guildConfig0.getLang();
    guildConfig0.setAutoResume(false);
    
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
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("\u2705");

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }

    // The following exception was thrown during execution in test generation
    try {
    java.io.File file1 = fredboat.util.rest.CacheUtil.getImageFromURL("en_US");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array8);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("en_US", str_array8);
    fredboat.perms.PermissionLevel permissionLevel15 = exitCommand14.getMinimumPerms();
    java.lang.String str16 = permissionLevel15.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Bot Admin"+ "'", str16.equals("Bot Admin"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    java.lang.String str1 = weatherOpenWeather0.getDescription();
    java.lang.String str2 = weatherOpenWeather0.getMain();
    weatherOpenWeather0.setMain("Bot Owner");
    weatherOpenWeather0.setIcon(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherOpenWeather0.setIcon("fredboat.util.BrainfuckException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }

    fredboat.util.GitRepoState gitRepoState0 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str1 = gitRepoState0.commitId;
    java.lang.String str2 = gitRepoState0.commitTime;
    java.lang.String str3 = gitRepoState0.branch;
    java.lang.String str4 = gitRepoState0.commitIdAbbrev;
    java.lang.String str5 = gitRepoState0.commitTime;
    
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

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("");
    fredboat.db.entity.UConfig uConfig3 = uConfig1.setBearerExpiration((-1L));
    java.lang.String str4 = uConfig1.getBearer();
    fredboat.db.entity.UConfig uConfig6 = uConfig1.setRefresh("fredboat.util.BrainfuckException: ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = playSplitCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setTempMax((double)0);
    double d5 = weatherMainOpenWeather0.getTempMax();
    double d6 = weatherMainOpenWeather0.getTemp();
    weatherMainOpenWeather0.setHumidity((int)(short)-1);
    int i9 = weatherMainOpenWeather0.getHumidity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array11);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("Bot Owner", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand20 = new fredboat.command.music.control.JoinCommand("qua, 31 dez 1969, 09:00 PM", str_array11);
    fredboat.perms.PermissionLevel permissionLevel21 = joinCommand20.getMinimumPerms();
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = joinCommand20.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = rewindCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand13.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand4 = new fredboat.command.music.control.RepeatCommand("", str_array3);
    fredboat.commandmeta.abs.CommandContext commandContext5 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand4.onInvoke(commandContext5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    boolean b1 = openWeatherCurrent0.isError();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderIcon();
    java.lang.String str3 = openWeatherCurrent0.getDataProviderIcon();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "https://i.imgur.com/YqZuqEB.jpg"+ "'", str2.equals("https://i.imgur.com/YqZuqEB.jpg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "https://i.imgur.com/YqZuqEB.jpg"+ "'", str3.equals("https://i.imgur.com/YqZuqEB.jpg"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.music.seeking.RestartCommand restartCommand9 = new fredboat.command.music.seeking.RestartCommand("", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.getId();
    blacklistEntry1.setLevel(0);
    blacklistEntry1.setRateLimitReached((int)(byte)100);
    long long10 = blacklistEntry1.id;
    blacklistEntry1.id = 5;
    long long13 = blacklistEntry1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 5L);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.maintenance.NodesCommand nodesCommand10 = new fredboat.command.maintenance.NodesCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("DJ", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand13 = new fredboat.command.music.control.RepeatCommand("fredboat.util.BrainfuckException: \u2705", str_array7);
    fredboat.perms.PermissionLevel permissionLevel14 = repeatCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand13.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.RewindCommand rewindCommand12 = new fredboat.command.music.seeking.RewindCommand("", str_array7);
    java.lang.String[] str_array17 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array17);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array17);
    fredboat.command.util.CommandsCommand commandsCommand20 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array17);
    fredboat.util.Tuple2<fredboat.command.music.seeking.RewindCommand,fredboat.commandmeta.abs.IUtilCommand> tuple2_rewindCommand_iUtilCommand21 = new fredboat.util.Tuple2<fredboat.command.music.seeking.RewindCommand,fredboat.commandmeta.abs.IUtilCommand>(rewindCommand12, (fredboat.commandmeta.abs.IUtilCommand)commandsCommand20);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand12.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = configCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = configCommand15.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand10 = new fredboat.command.music.seeking.RestartCommand("", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand13 = new fredboat.command.util.CommandsCommand("Bot Owner", str_array7);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = commandsCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.getId();
    blacklistEntry1.setLevel(0);
    blacklistEntry1.setRateLimitReached((int)(byte)100);
    long long10 = blacklistEntry1.getId();
    int i11 = blacklistEntry1.getRateLimitReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(10L);
    blacklistEntry1.setRateLimitReachedTimestamp(1531609939130L);
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    blacklistEntry1.setRateLimitReached(3000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1531609939130L);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    java.lang.String str4 = uConfig0.getUserId();
    fredboat.db.entity.UConfig uConfig6 = uConfig0.setUserId("\u2705");
    fredboat.db.entity.UConfig uConfig8 = uConfig6.setUserId("Provided by OpenWeatherMap.org");
    fredboat.db.entity.UConfig uConfig10 = uConfig6.setBearerExpiration((long)10);
    long long11 = uConfig10.getBearerExpiration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 10L);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array7);
    fredboat.command.admin.BotRestartCommand botRestartCommand12 = new fredboat.command.admin.BotRestartCommand("", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = botRestartCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array9);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand15 = new fredboat.command.maintenance.AudioDebugCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "DJ", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = textCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array10);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = brainfuckCommand18.process("fredboat.util.BrainfuckException: \u2705", context20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("\u274C", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = exitCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    remoteFileCommand9.url = "\u274C";
    remoteFileCommand9.url = "fredboat.util.BrainfuckException: ";
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand9.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("Bot Admin", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand17 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = languageCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    fredboat.db.entity.UConfig uConfig5 = uConfig0.setBearerExpiration((long)(short)10);
    long long6 = uConfig0.getBearerExpiration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 10L);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("");
    guildConfig1.setAutoResume(false);
    guildConfig1.setTrackAnnounce(false);
    boolean b6 = guildConfig1.isTrackAnnounce();
    java.lang.String str7 = guildConfig1.getLang();
    boolean b8 = guildConfig1.isAutoResume();
    guildConfig1.setId("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "en_US"+ "'", str7.equals("en_US"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("en_US", str_array12);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "Bot Admin", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = nodeAdminCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array7);
    fredboat.command.music.seeking.SeekCommand seekCommand12 = new fredboat.command.music.seeking.SeekCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.admin.UpdateCommand updateCommand11 = new fredboat.command.admin.UpdateCommand("", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand12 = new fredboat.command.fun.CatgirlCommand("Bot Admin", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand("\u2705", str_array9);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("\u2757", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.perms.PermissionLevel permissionLevel16 = playSplitCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = playSplitCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = playSplitCommand15.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = unblacklistCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand10 = new fredboat.command.music.seeking.RestartCommand("", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array7);
    fredboat.command.fun.PatCommand patCommand12 = new fredboat.command.fun.PatCommand("hi!", "hi!", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = patCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("\u2757", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand21 = new fredboat.command.music.control.JoinCommand("fredboat.util.BrainfuckException: \u2705", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand22 = new fredboat.command.maintenance.VersionCommand("Bot Owner", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("en_US", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("https://i.imgur.com/YqZuqEB.jpg", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand19 = new fredboat.command.util.WeatherCommand(weather0, "\uD83D\uDCDD", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = weatherCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }

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
    java.lang.String[] str_array31 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand32 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array31);
    fredboat.command.music.control.ShuffleCommand shuffleCommand33 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array31);
    fredboat.perms.PermissionLevel permissionLevel34 = shuffleCommand33.getMinimumPerms();
    java.util.List<java.lang.String> list_str35 = guildPermissions0.getFromEnum(permissionLevel34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    org.junit.Assert.assertTrue("'" + permissionLevel34 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel34.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    int i2 = blacklistEntry1.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array3);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand5 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDEAA", str_array3);
    fredboat.commandmeta.abs.CommandContext commandContext6 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand5.onInvoke(commandContext6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array11);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("Bot Admin", str_array11);
    fredboat.perms.PermissionLevel permissionLevel16 = seekCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = seekCommand15.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    int i5 = blacklistEntry1.getLevel();
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    int i7 = blacklistEntry1.level;
    int i8 = blacklistEntry1.getRateLimitReached();
    blacklistEntry1.setBlacklistedTimestamp(1531609991976L);
    blacklistEntry1.rateLimitReached = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1531610025946L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand11 = new fredboat.command.music.seeking.RestartCommand("", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array8);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand14 = new fredboat.command.maintenance.AudioDebugCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("\u2705", str_array8);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = languageCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand14 = new fredboat.command.admin.ReviveCommand("Bot Admin", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.music.control.LeaveCommand leaveCommand9 = new fredboat.command.music.control.LeaveCommand("https://i.imgur.com/YqZuqEB.jpg", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str2 = weatherError1.getDataProviderIcon();
    java.lang.String str3 = weatherError1.getFormattedDate();
    java.lang.String str4 = weatherError1.getThumbnailUrl();
    java.lang.String str5 = weatherError1.getDataProviderString();
    boolean b6 = weatherError1.isError();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode7 = weatherError1.errorType();
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
    org.junit.Assert.assertTrue(b6 == true);
    org.junit.Assert.assertTrue("'" + errorCode7 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode7.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand13 = new fredboat.command.fun.CatgirlCommand("hi!", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("en_US", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("https://i.imgur.com/YqZuqEB.jpg", "fredboat.util.BrainfuckException: ", str_array9);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params16 = fredboat.util.rest.Http.Params.of(str_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }

    fredboat.util.BrainfuckException brainfuckException2 = new fredboat.util.BrainfuckException("qua, 31 dez 1969, 09:00 PM");
    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("en_US", (java.lang.Throwable)brainfuckException2);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }

    fredboat.db.entity.GuildConfig guildConfig0 = new fredboat.db.entity.GuildConfig();
    java.lang.String str1 = guildConfig0.getGuildId();
    boolean b2 = guildConfig0.isAutoResume();
    boolean b3 = guildConfig0.isAutoResume();
    java.lang.String str4 = guildConfig0.getLang();
    guildConfig0.setAutoResume(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "en_US"+ "'", str4.equals("en_US"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }

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
    fredboat.db.entity.UConfig uConfig16 = tuple2_uConfig_gitRepoState14.a;
    fredboat.util.GitRepoState gitRepoState17 = tuple2_uConfig_gitRepoState14.b;
    fredboat.db.entity.UConfig uConfig18 = tuple2_uConfig_gitRepoState14.a;
    
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
    org.junit.Assert.assertNotNull(uConfig16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gitRepoState17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig18);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand10 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.seeking.RestartCommand restartCommand11 = new fredboat.command.music.seeking.RestartCommand("Bot Admin", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand6 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand7 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand17 = new fredboat.command.fun.CatgirlCommand("", str_array10);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("\uD83D\uDEAA", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = listCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "Bot Admin", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = nodeAdminCommand14.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel16 = nodeAdminCommand14.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = nodeAdminCommand14.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = nodeAdminCommand14.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel19 = nodeAdminCommand14.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand16 = new fredboat.command.fun.CatgirlCommand("", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = catgirlCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("Provided by OpenWeatherMap.org", str_array9);
    java.util.List<java.lang.String> list_str12 = nodeAdminCommand11.aliases;
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand11.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.StopCommand stopCommand2 = new fredboat.command.music.control.StopCommand("\u274C", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand7 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.util.AvatarCommand avatarCommand8 = new fredboat.command.util.AvatarCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = avatarCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array10);
    fredboat.command.admin.BotRestartCommand botRestartCommand18 = new fredboat.command.admin.BotRestartCommand("\uD83D\uDEAA", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("", str_array11);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand("en_US", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("en_US", str_array11);
    fredboat.command.admin.ExitCommand exitCommand20 = new fredboat.command.admin.ExitCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather0.setMain(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherOpenWeather0.setMain("Provided by OpenWeatherMap.org");
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array11);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand16 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather0, languageCommand15);
    fredboat.command.moderation.LanguageCommand languageCommand17 = tuple2_weatherOpenWeather_languageCommand16.b;
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = languageCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(languageCommand17);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array9);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("en_US", str_array9);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand16 = new fredboat.command.music.control.ReshuffleCommand("\u274C", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = reshuffleCommand16.getMinimumPerms();
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = reshuffleCommand16.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }

    java.lang.String[] str_array9 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand10 = new fredboat.command.fun.HugCommand("", "\u274C", str_array9);
    fredboat.command.admin.ReviveCommand reviveCommand11 = new fredboat.command.admin.ReviveCommand("Bot Admin", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("\uD83D\uDCDD", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.util.AvatarCommand avatarCommand2 = new fredboat.command.util.AvatarCommand("\u274C", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand17 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand19 = new fredboat.command.maintenance.AudioDebugCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = audioDebugCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.level = (byte)10;
    blacklistEntry1.id = 1531609958429L;

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    java.lang.String str1 = weatherOpenWeather0.getDescription();
    weatherOpenWeather0.setDescription(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherOpenWeather0.setIcon("");
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand16 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array13);
    fredboat.command.fun.CatgirlCommand catgirlCommand17 = new fredboat.command.fun.CatgirlCommand("hi!", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand18 = new fredboat.command.moderation.LanguageCommand("en_US", str_array13);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand19 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather0, languageCommand18);
    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather20 = tuple2_weatherOpenWeather_languageCommand19.a;
    weatherOpenWeather20.setDescription("Provided by OpenWeatherMap.org");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weatherOpenWeather20);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getUserId();
    java.lang.String str2 = uConfig0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    java.lang.String str4 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig6 = uConfig0.setRefresh("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org");
    fredboat.util.GitRepoState gitRepoState7 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str8 = gitRepoState7.commitMessageShort;
    java.lang.String str9 = gitRepoState7.commitUserName;
    fredboat.util.Tuple2<fredboat.db.entity.UConfig,fredboat.util.GitRepoState> tuple2_uConfig_gitRepoState10 = new fredboat.util.Tuple2<fredboat.db.entity.UConfig,fredboat.util.GitRepoState>(uConfig6, gitRepoState7);
    fredboat.db.entity.UConfig uConfig11 = tuple2_uConfig_gitRepoState10.a;
    
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
    org.junit.Assert.assertNotNull(uConfig11);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("https://i.imgur.com/YqZuqEB.jpg", str_array11);
    fredboat.perms.PermissionLevel permissionLevel20 = joinCommand19.getMinimumPerms();
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = joinCommand19.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand6 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.fun.CatgirlCommand catgirlCommand7 = new fredboat.command.fun.CatgirlCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    java.lang.String str8 = catgirlCommand7.name;
    java.lang.String[] str_array13 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.util.CommandsCommand commandsCommand16 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array13);
    fredboat.util.Tuple2<fredboat.command.fun.CatgirlCommand,fredboat.command.util.CommandsCommand> tuple2_catgirlCommand_commandsCommand17 = new fredboat.util.Tuple2<fredboat.command.fun.CatgirlCommand,fredboat.command.util.CommandsCommand>(catgirlCommand7, commandsCommand16);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = commandsCommand16.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..."+ "'", str8.equals("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("\uD83D\uDCDD", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.PauseCommand pauseCommand10 = new fredboat.command.music.control.PauseCommand("", str_array6);
    fredboat.command.admin.EvalCommand evalCommand11 = new fredboat.command.admin.EvalCommand("hi!", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = evalCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("Base", (int)(byte)10, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("Bot Admin", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand12 = new fredboat.command.maintenance.GetIdCommand("hi!", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = getIdCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array12);
    fredboat.command.admin.BotRestartCommand botRestartCommand14 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand16 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.util.MathCommand mathCommand17 = new fredboat.command.util.MathCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    mathCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = configCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = configCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = configCommand15.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.util.BrainfuckCommand brainfuckCommand9 = new fredboat.command.util.BrainfuckCommand("", str_array5);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = brainfuckCommand9.process("en_US", context11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand20 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array13);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("Bot Owner", str_array13);
    fredboat.command.music.control.JoinCommand joinCommand22 = new fredboat.command.music.control.JoinCommand("qua, 31 dez 1969, 09:00 PM", str_array13);
    fredboat.command.admin.UpdateCommand updateCommand23 = new fredboat.command.admin.UpdateCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array13);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand24 = new fredboat.command.admin.SetAvatarCommand("https://i.imgur.com/YqZuqEB.jpg", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand16 = new fredboat.command.fun.CatgirlCommand("", str_array9);
    java.lang.String[] str_array30 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand31 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array30);
    fredboat.command.music.control.ShuffleCommand shuffleCommand32 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array30);
    fredboat.command.fun.TextCommand textCommand33 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array30);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand34 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array30);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand35 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array30);
    fredboat.command.moderation.ConfigCommand configCommand36 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array30);
    fredboat.command.fun.HugCommand hugCommand37 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array30);
    fredboat.command.admin.EvalCommand evalCommand38 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array30);
    fredboat.command.util.CommandsCommand commandsCommand39 = new fredboat.command.util.CommandsCommand("", str_array30);
    fredboat.util.Tuple2<fredboat.command.fun.CatgirlCommand,fredboat.command.util.CommandsCommand> tuple2_catgirlCommand_commandsCommand40 = new fredboat.util.Tuple2<fredboat.command.fun.CatgirlCommand,fredboat.command.util.CommandsCommand>(catgirlCommand16, commandsCommand39);
    fredboat.messaging.internal.Context context41 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str42 = commandsCommand39.help(context41);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    long long1 = simpleTrackProvider0.getDurationMillis();
    int i2 = simpleTrackProvider0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array10);
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("DJ", str_array10);
    fredboat.command.util.MathCommand mathCommand16 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    mathCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.NodesCommand nodesCommand9 = new fredboat.command.maintenance.NodesCommand("", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand10 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array6);
    fredboat.perms.PermissionLevel permissionLevel12 = setAvatarCommand11.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand11.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    int i4 = blacklistEntry1.getRateLimitReached();
    long long5 = blacklistEntry1.getRateLimitReachedTimestamp();
    long long6 = blacklistEntry1.blacklistedTimestamp;
    // The following exception was thrown during execution in test generation
    try {
    blacklistEntry1.setId("\u2757");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1531610034317L);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand11 = new fredboat.command.util.BrainfuckCommand("\uD83D\uDCDD", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.NodesCommand nodesCommand9 = new fredboat.command.maintenance.NodesCommand("", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand10 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather0.setMain(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    java.lang.String str3 = weatherOpenWeather0.getIcon();
    int i4 = weatherOpenWeather0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("Provided by OpenWeatherMap.org", str_array9);
    java.util.List<java.lang.String> list_str12 = nodeAdminCommand11.aliases;
    fredboat.perms.PermissionLevel permissionLevel13 = nodeAdminCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = nodeAdminCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = nodeAdminCommand11.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = nodeAdminCommand11.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }

    fredboat.util.rest.APILimitException aPILimitException2 = new fredboat.util.rest.APILimitException("en_US");
    fredboat.commandmeta.MessagingException messagingException3 = new fredboat.commandmeta.MessagingException("\uD83D\uDEAA", (java.lang.Throwable)aPILimitException2);
    java.lang.String str4 = aPILimitException2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "fredboat.util.rest.APILimitException: en_US"+ "'", str4.equals("fredboat.util.rest.APILimitException: en_US"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.admin.UpdateCommand updateCommand6 = new fredboat.command.admin.UpdateCommand("", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = updateCommand6.getMinimumPerms();
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = updateCommand6.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("en_US", str_array11);
    fredboat.command.fun.RollCommand rollCommand19 = new fredboat.command.fun.RollCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = rollCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.EvalCommand evalCommand2 = new fredboat.command.admin.EvalCommand("en_US", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext1);
    fredboat.audio.queue.AudioTrackContext audioTrackContext3 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext3);
    boolean b5 = simpleTrackProvider0.isEmpty();
    fredboat.audio.queue.AudioTrackContext audioTrackContext6 = simpleTrackProvider0.peek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext6);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(10L);
    blacklistEntry1.setRateLimitReachedTimestamp(1531609939130L);
    blacklistEntry1.rateLimitReachedTimestamp = 1531609940426L;

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("hi!");
    boolean b2 = guildConfig1.isAutoResume();
    boolean b3 = guildConfig1.isTrackAnnounce();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.music.control.DestroyCommand destroyCommand18 = new fredboat.command.music.control.DestroyCommand("qua, 31 dez 1969, 09:00 PM", str_array11);
    fredboat.command.admin.UpdateCommand updateCommand19 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    java.lang.String str20 = updateCommand19.name;
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand19.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str20.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.admin.UpdateCommand updateCommand7 = new fredboat.command.admin.UpdateCommand("", str_array5);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand8 = new fredboat.command.moderation.DisableCommandsCommand("en_US", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = disableCommandsCommand8.getMinimumPerms();
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = disableCommandsCommand8.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }

    fredboat.db.DatabaseManager databaseManager0 = null;
    fredboat.agent.DBConnectionWatchdogAgent dBConnectionWatchdogAgent1 = new fredboat.agent.DBConnectionWatchdogAgent(databaseManager0);
    dBConnectionWatchdogAgent1.doRun();
    dBConnectionWatchdogAgent1.doRun();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.start((fredboat.agent.FredBoatAgent)dBConnectionWatchdogAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.admin.UpdateCommand updateCommand8 = new fredboat.command.admin.UpdateCommand("", str_array6);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand9 = new fredboat.command.moderation.DisableCommandsCommand("en_US", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("DJ", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = unpauseCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }

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
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.reshuffle();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
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

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand8 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.command.music.seeking.ForwardCommand forwardCommand10 = new fredboat.command.music.seeking.ForwardCommand("fredboat.util.BrainfuckException: \u2705", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = forwardCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand10.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand16 = new fredboat.command.fun.CatgirlCommand("", str_array9);
    java.lang.String[] str_array30 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand31 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array30);
    fredboat.command.music.control.ShuffleCommand shuffleCommand32 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array30);
    fredboat.command.fun.TextCommand textCommand33 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array30);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand34 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array30);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand35 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array30);
    fredboat.command.moderation.ConfigCommand configCommand36 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array30);
    fredboat.command.fun.HugCommand hugCommand37 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array30);
    fredboat.command.admin.EvalCommand evalCommand38 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array30);
    fredboat.command.util.CommandsCommand commandsCommand39 = new fredboat.command.util.CommandsCommand("", str_array30);
    fredboat.util.Tuple2<fredboat.command.fun.CatgirlCommand,fredboat.command.util.CommandsCommand> tuple2_catgirlCommand_commandsCommand40 = new fredboat.util.Tuple2<fredboat.command.fun.CatgirlCommand,fredboat.command.util.CommandsCommand>(catgirlCommand16, commandsCommand39);
    fredboat.command.util.CommandsCommand commandsCommand41 = tuple2_catgirlCommand_commandsCommand40.b;
    fredboat.command.util.CommandsCommand commandsCommand42 = tuple2_catgirlCommand_commandsCommand40.b;
    fredboat.messaging.internal.Context context43 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str44 = commandsCommand42.help(context43);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(commandsCommand41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(commandsCommand42);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("Bot Admin", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }

    fredboat.util.GitRepoState gitRepoState1 = new fredboat.util.GitRepoState("fredboat.util.BrainfuckException: \u2705");
    java.lang.String str2 = gitRepoState1.commitIdAbbrev;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }

    fredboat.util.rest.APILimitException aPILimitException1 = new fredboat.util.rest.APILimitException(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.admin.UpdateCommand updateCommand8 = new fredboat.command.admin.UpdateCommand("", str_array6);
    fredboat.command.fun.FacedeskCommand facedeskCommand9 = new fredboat.command.fun.FacedeskCommand("Bot Admin", "qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.seeking.RestartCommand restartCommand8 = new fredboat.command.music.seeking.RestartCommand("", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = shuffleCommand9.getMinimumPerms();
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = shuffleCommand9.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand16 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array11);
    fredboat.command.admin.UpdateCommand updateCommand17 = new fredboat.command.admin.UpdateCommand("\uD83D\uDCDD", str_array11);
    fredboat.command.admin.UpdateCommand updateCommand18 = new fredboat.command.admin.UpdateCommand("\uD83D\uDEAA", str_array11);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand19 = new fredboat.command.fun.DanceCommand("", str_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("");
    fredboat.db.entity.UConfig uConfig3 = uConfig1.setBearerExpiration((-1L));
    java.lang.String str4 = uConfig1.getBearer();
    fredboat.db.entity.UConfig uConfig6 = uConfig1.setBearerExpiration(1531609958568L);
    uConfig6.setId("\uD83D\uDCDD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand12 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("https://i.imgur.com/YqZuqEB.jpg", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand15 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = commandsCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.music.control.StopCommand stopCommand11 = new fredboat.command.music.control.StopCommand("hi!", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.seeking.SeekCommand seekCommand13 = new fredboat.command.music.seeking.SeekCommand("fredboat.util.BrainfuckException: \u2705", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("Bot Admin", str_array9);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params16 = fredboat.util.rest.Http.Params.of(str_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    java.lang.String str11 = remoteFileCommand9.url;
    remoteFileCommand9.url = "Bot Owner";
    remoteFileCommand9.url = "Bot Admin";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\u274C"+ "'", str10.equals("\u274C"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\u274C"+ "'", str11.equals("\u274C"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand16 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array11);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array11);
    java.io.File file19 = hugCommand18.getRandomFile();
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand18.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file19);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand17 = new fredboat.command.fun.CatgirlCommand("", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand18 = new fredboat.command.maintenance.AudioDebugCommand("\u2757", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array10);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array10);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("en_US", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = disableCommandsCommand18.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand18.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand13 = new fredboat.command.music.seeking.RestartCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = restartCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    java.lang.String str1 = weatherOpenWeather0.getDescription();
    weatherOpenWeather0.setDescription(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    int i4 = weatherOpenWeather0.getId();
    java.lang.String str5 = weatherOpenWeather0.getMain();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("hi!", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.seeking.SeekCommand seekCommand14 = new fredboat.command.music.seeking.SeekCommand("fredboat.util.BrainfuckException: \u2705", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.fun.FacedeskCommand facedeskCommand13 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand8 = new fredboat.command.maintenance.PingCommand("\u274C", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand9 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array6);
    fredboat.command.admin.UpdateCommand updateCommand11 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.perms.PermissionLevel permissionLevel12 = updateCommand11.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand11.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.admin.UpdateCommand updateCommand10 = new fredboat.command.admin.UpdateCommand("", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand11 = new fredboat.command.moderation.DisableCommandsCommand("en_US", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand12 = new fredboat.command.music.seeking.RewindCommand("fredboat.util.BrainfuckException: ", str_array8);
    fredboat.command.admin.EvalCommand evalCommand13 = new fredboat.command.admin.EvalCommand("hi!", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("DJ", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = getIdCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.music.control.JoinCommand joinCommand15 = new fredboat.command.music.control.JoinCommand("\u2705", str_array10);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("", "qua, 31 dez 1969, 09:00 PM", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand("Base", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("Bot Admin", str_array7);
    fredboat.command.admin.UpdateCommand updateCommand12 = new fredboat.command.admin.UpdateCommand("fredboat.util.BrainfuckException: hi!", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = updateCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }

    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException4 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException3);
    fredboat.commandmeta.MessagingException messagingException5 = new fredboat.commandmeta.MessagingException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException3);
    fredboat.util.BrainfuckException brainfuckException9 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException10 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException9);
    fredboat.util.BrainfuckException brainfuckException11 = new fredboat.util.BrainfuckException(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", (java.lang.Throwable)brainfuckException9);
    brainfuckException3.addSuppressed((java.lang.Throwable)brainfuckException11);
    fredboat.util.BrainfuckException brainfuckException14 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array15 = brainfuckException14.getSuppressed();
    brainfuckException11.addSuppressed((java.lang.Throwable)brainfuckException14);
    fredboat.util.BrainfuckException brainfuckException20 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException21 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException20);
    fredboat.commandmeta.MessagingException messagingException22 = new fredboat.commandmeta.MessagingException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException20);
    fredboat.util.BrainfuckException brainfuckException26 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException27 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException26);
    fredboat.util.BrainfuckException brainfuckException28 = new fredboat.util.BrainfuckException(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", (java.lang.Throwable)brainfuckException26);
    brainfuckException20.addSuppressed((java.lang.Throwable)brainfuckException28);
    brainfuckException11.addSuppressed((java.lang.Throwable)brainfuckException20);
    fredboat.util.rest.APILimitException aPILimitException33 = new fredboat.util.rest.APILimitException("en_US");
    fredboat.commandmeta.MessagingException messagingException34 = new fredboat.commandmeta.MessagingException("hi!", (java.lang.Throwable)aPILimitException33);
    brainfuckException20.addSuppressed((java.lang.Throwable)aPILimitException33);
    java.lang.Throwable throwable36 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckException20.addSuppressed(throwable36);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array15);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand17 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand18 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.music.control.StopCommand stopCommand19 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand20 = new fredboat.command.maintenance.AudioDebugCommand("\uD83D\uDCDD", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    java.lang.String str11 = remoteFileCommand9.url;
    remoteFileCommand9.url = "Bot Owner";
    remoteFileCommand9.url = "\u2705";
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand9.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\u274C"+ "'", str10.equals("\u274C"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\u274C"+ "'", str11.equals("\u274C"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "Bot Admin", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = nodeAdminCommand14.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel16 = nodeAdminCommand14.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = nodeAdminCommand14.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = nodeAdminCommand14.getMinimumPerms();
    int i19 = permissionLevel18.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 4);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(10L);
    blacklistEntry1.setRateLimitReachedTimestamp(1531609939130L);
    long long4 = blacklistEntry1.blacklistedTimestamp;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1531610041156L);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    simpleTrackProvider0.skipped();
    fredboat.audio.queue.RepeatMode repeatMode5 = simpleTrackProvider0.getRepeatMode();
    fredboat.audio.queue.AudioTrackContext audioTrackContext6 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext6);
    fredboat.audio.queue.AudioTrackContext audioTrackContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.add(audioTrackContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    org.junit.Assert.assertTrue("'" + repeatMode5 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode5.equals(fredboat.audio.queue.RepeatMode.OFF));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    java.lang.String str4 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig6 = uConfig0.setRefresh("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org");
    fredboat.util.GitRepoState gitRepoState7 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str8 = gitRepoState7.commitMessageShort;
    java.lang.String str9 = gitRepoState7.commitUserName;
    fredboat.util.Tuple2<fredboat.db.entity.UConfig,fredboat.util.GitRepoState> tuple2_uConfig_gitRepoState10 = new fredboat.util.Tuple2<fredboat.db.entity.UConfig,fredboat.util.GitRepoState>(uConfig6, gitRepoState7);
    java.lang.String str11 = gitRepoState7.commitId;
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand("fredboat.util.BrainfuckException: ", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = forwardCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = forwardCommand12.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.admin.UpdateCommand updateCommand9 = new fredboat.command.admin.UpdateCommand("", str_array7);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand10 = new fredboat.command.moderation.DisableCommandsCommand("en_US", str_array7);
    fredboat.command.music.seeking.RewindCommand rewindCommand11 = new fredboat.command.music.seeking.RewindCommand("fredboat.util.BrainfuckException: ", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("hi!", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = evalCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = evalCommand12.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    fredboat.db.entity.UConfig uConfig5 = uConfig0.setBearer("");
    fredboat.db.entity.UConfig uConfig7 = uConfig0.setBearer("Provided by OpenWeatherMap.org");
    java.lang.String str8 = uConfig0.getBearer();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str8.equals("Provided by OpenWeatherMap.org"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand10 = new fredboat.command.music.seeking.RestartCommand("", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array7);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand13 = new fredboat.command.maintenance.AudioDebugCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = audioDebugCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }

    fredboat.audio.queue.PlaylistInfo.Source source4 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo5 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source4);
    fredboat.audio.queue.PlaylistInfo playlistInfo6 = new fredboat.audio.queue.PlaylistInfo(0, "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", source4);
    fredboat.audio.queue.PlaylistInfo.Source source7 = playlistInfo6.getSource();
    playlistInfo6.setTotalTracks(0);
    playlistInfo6.setTotalTracks(5);
    org.junit.Assert.assertTrue("'" + source4 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source4.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    org.junit.Assert.assertTrue("'" + source7 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source7.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array7);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand10 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array7);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("qua, 31 dez 1969, 09:00 PM", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = configCommand18.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand18.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.music.control.PauseCommand pauseCommand11 = new fredboat.command.music.control.PauseCommand("", str_array7);
    fredboat.command.admin.ReviveCommand reviveCommand12 = new fredboat.command.admin.ReviveCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.fun.CatgirlCommand catgirlCommand13 = new fredboat.command.fun.CatgirlCommand("fredboat.util.BrainfuckException: \uD83D\uDEAA", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }

    fredboat.db.entity.GuildConfig guildConfig0 = new fredboat.db.entity.GuildConfig();
    java.lang.String str1 = guildConfig0.getGuildId();
    boolean b2 = guildConfig0.isTrackAnnounce();
    boolean b3 = guildConfig0.isAutoResume();
    java.lang.String str4 = guildConfig0.getLang();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "en_US"+ "'", str4.equals("en_US"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.admin.UpdateCommand updateCommand6 = new fredboat.command.admin.UpdateCommand("", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel9 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = updateCommand6.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand6.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }

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
    fredboat.audio.queue.ITrackProvider iTrackProvider30 = tuple2_tuple2_weatherOpenWeather_languageCommand_iTrackProvider29.b;
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand31 = tuple2_tuple2_weatherOpenWeather_languageCommand_iTrackProvider29.a;
    
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
    org.junit.Assert.assertNotNull(iTrackProvider30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tuple2_weatherOpenWeather_languageCommand31);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand17 = new fredboat.command.fun.CatgirlCommand("", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand18 = new fredboat.command.admin.SetAvatarCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.SetAvatarCommand setAvatarCommand2 = new fredboat.command.admin.SetAvatarCommand("Bot Owner", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.RewindCommand rewindCommand12 = new fredboat.command.music.seeking.RewindCommand("", str_array7);
    java.lang.String[] str_array17 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array17);
    fredboat.command.music.control.RepeatCommand repeatCommand19 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array17);
    fredboat.command.util.CommandsCommand commandsCommand20 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array17);
    fredboat.util.Tuple2<fredboat.command.music.seeking.RewindCommand,fredboat.commandmeta.abs.IUtilCommand> tuple2_rewindCommand_iUtilCommand21 = new fredboat.util.Tuple2<fredboat.command.music.seeking.RewindCommand,fredboat.commandmeta.abs.IUtilCommand>(rewindCommand12, (fredboat.commandmeta.abs.IUtilCommand)commandsCommand20);
    fredboat.commandmeta.abs.IUtilCommand iUtilCommand22 = tuple2_rewindCommand_iUtilCommand21.b;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iUtilCommand22);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.util.CommandsCommand commandsCommand12 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand13 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.command.util.CommandsCommand commandsCommand16 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("Provided by OpenWeatherMap.org", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", 97, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.util.AvatarCommand avatarCommand8 = new fredboat.command.util.AvatarCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    avatarCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("\u274C", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array8);
    fredboat.command.util.WeatherCommand weatherCommand12 = new fredboat.command.util.WeatherCommand(weather2, ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("\u2757", str_array8);
    fredboat.command.moderation.ConfigCommand configCommand14 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = configCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\u2705", str_array9);
    fredboat.command.util.MathCommand mathCommand16 = new fredboat.command.util.MathCommand("", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = mathCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }

    // The following exception was thrown during execution in test generation
    try {
    java.io.File file1 = fredboat.util.rest.CacheUtil.getImageFromURL("Bot Admin");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand11 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.fun.FacedeskCommand facedeskCommand12 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array8);
    fredboat.command.moderation.ConfigCommand configCommand13 = new fredboat.command.moderation.ConfigCommand("Base", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = configCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getCode();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode4 = openWeatherCurrent0.errorType();
    fredboat.util.rest.models.weather.WeatherError weatherError5 = new fredboat.util.rest.models.weather.WeatherError(errorCode4);
    java.lang.String str6 = weatherError5.getTemperature();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    org.junit.Assert.assertTrue("'" + errorCode2 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode2.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    org.junit.Assert.assertTrue("'" + errorCode4 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode4.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }

    fredboat.commandmeta.MessagingException messagingException2 = new fredboat.commandmeta.MessagingException("hi!");
    fredboat.commandmeta.MessagingException messagingException3 = new fredboat.commandmeta.MessagingException("fredboat.util.BrainfuckException: ", (java.lang.Throwable)messagingException2);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    java.lang.String str1 = openWeatherCurrent0.getLocation();
    java.lang.String str2 = openWeatherCurrent0.getName();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather3 = openWeatherCurrent0.getMain();
    java.lang.String str4 = openWeatherCurrent0.getWeatherDescription();
    java.lang.String str5 = openWeatherCurrent0.getFormattedDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str5.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.maintenance.NodesCommand nodesCommand2 = new fredboat.command.maintenance.NodesCommand("Bot Admin", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand9 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = playSplitCommand9.getMinimumPerms();
    java.lang.String str11 = permissionLevel10.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.USER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "User"+ "'", str11.equals("User"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getDataProviderString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    org.junit.Assert.assertTrue("'" + errorCode2 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode2.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str4.equals("Provided by OpenWeatherMap.org"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "fredboat.util.BrainfuckException: \u2705", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand12 = new fredboat.command.music.control.JoinCommand("\uD83D\uDCDD", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = joinCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand14 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand15 = new fredboat.command.fun.RandomImageCommand("Bot Owner", "Base", str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    fredboat.agent.StatsAgent.Action action2 = null;
    statsAgent1.addAction(action2);
    fredboat.agent.StatsAgent.Action action4 = null;
    statsAgent1.addAction(action4);
    fredboat.agent.StatsAgent.Action action6 = null;
    statsAgent1.addAction(action6);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.startNow((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.info.ListCommand listCommand6 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.start((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }

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
    boolean b10 = simpleTrackProvider0.isShuffle();
    fredboat.audio.queue.AudioTrackContext audioTrackContext11 = null;
    boolean b12 = simpleTrackProvider0.remove(audioTrackContext11);
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
    org.junit.Assert.assertNull(audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand2 = new fredboat.command.fun.DanceCommand("Provided by OpenWeatherMap.org", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand17 = new fredboat.command.admin.ReviveCommand("", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("\u2757", "DJ", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand19 = new fredboat.command.fun.CatgirlCommand("fredboat.util.BrainfuckException: ", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = catgirlCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand13 = new fredboat.command.moderation.DisableCommandsCommand("Bot Admin", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = disableCommandsCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }

    fredboat.util.GitRepoState gitRepoState0 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str1 = gitRepoState0.commitMessageShort;
    java.lang.String str2 = gitRepoState0.commitUserName;
    java.lang.String str3 = gitRepoState0.commitMessageFull;
    java.lang.String str4 = gitRepoState0.commitTime;
    java.lang.String str5 = gitRepoState0.commitIdAbbrev;
    java.lang.String str6 = gitRepoState0.branch;
    java.lang.String str7 = gitRepoState0.commitUserName;
    java.lang.String str8 = gitRepoState0.commitUserEmail;
    
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

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.command.music.seeking.RestartCommand restartCommand7 = new fredboat.command.music.seeking.RestartCommand("", str_array4);
    java.util.List<java.lang.String> list_str8 = restartCommand7.aliases;
    fredboat.perms.PermissionLevel permissionLevel9 = restartCommand7.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand7.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array10);
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("DJ", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand16 = new fredboat.command.maintenance.AudioDebugCommand("Base", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = audioDebugCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }

    java.lang.String[] str_array7 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand8 = new fredboat.command.fun.HugCommand("", "\u274C", str_array7);
    java.lang.String str9 = hugCommand8.getRandomImageUrl();
    java.io.File file10 = hugCommand8.getRandomFile();
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand8.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str9.equals("http://i.imgur.com/NqyOqnj.gif"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file10);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    boolean b3 = simpleTrackProvider0.remove(audioTrackContext2);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext4 = simpleTrackProvider0.getAsListOrdered();
    fredboat.audio.queue.RepeatMode repeatMode5 = simpleTrackProvider0.getRepeatMode();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.audio.queue.AudioTrackContext audioTrackContext7 = simpleTrackProvider0.getTrack(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext4);
    org.junit.Assert.assertTrue("'" + repeatMode5 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode5.equals(fredboat.audio.queue.RepeatMode.OFF));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array14);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.command.music.info.ListCommand listCommand17 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand18 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array14);
    fredboat.command.fun.PatCommand patCommand19 = new fredboat.command.fun.PatCommand("", "", str_array14);
    fredboat.command.util.BrainfuckCommand brainfuckCommand20 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("\uD83D\uDCDD", str_array14);
    fredboat.command.fun.RandomImageCommand randomImageCommand22 = new fredboat.command.fun.RandomImageCommand("fredboat.util.BrainfuckException: \u2705", "\uD83D\uDEAA", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand23 = new fredboat.command.util.WeatherCommand(weather0, "\u274C", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand8 = new fredboat.command.music.control.LeaveCommand("hi!", str_array6);
    fredboat.command.moderation.LanguageCommand languageCommand9 = new fredboat.command.moderation.LanguageCommand("DJ", str_array6);
    fredboat.command.admin.BotRestartCommand botRestartCommand10 = new fredboat.command.admin.BotRestartCommand("en_US", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = botRestartCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "\uD83D\uDEAA", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }

    // The following exception was thrown during execution in test generation
    try {
    java.io.File file1 = fredboat.util.rest.CacheUtil.getImageFromURL("Bot Owner");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }

    fredboat.util.rest.Weather weather5 = null;
    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array13);
    fredboat.command.util.WeatherCommand weatherCommand17 = new fredboat.command.util.WeatherCommand(weather5, "Bot Admin", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand19 = new fredboat.command.admin.SetAvatarCommand("\u2757", str_array13);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: ", str_array13);
    fredboat.command.fun.PatCommand patCommand21 = new fredboat.command.fun.PatCommand("https://i.imgur.com/YqZuqEB.jpg", "", str_array13);
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
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand12 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand14 = new fredboat.command.maintenance.AudioDebugCommand("en_US", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("", str_array8);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = historyCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array10);
    fredboat.command.fun.RandomImageCommand randomImageCommand16 = new fredboat.command.fun.RandomImageCommand("qua, 31 dez 1969, 09:00 PM", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = randomImageCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.music.seeking.RestartCommand restartCommand18 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("DJ", "\u274C", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = rollCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand10 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = brainfuckCommand10.process("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", context12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }

    fredboat.util.BrainfuckException brainfuckException2 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array3 = brainfuckException2.getSuppressed();
    java.lang.String str4 = brainfuckException2.toString();
    fredboat.util.BrainfuckException brainfuckException5 = new fredboat.util.BrainfuckException("https://i.imgur.com/YqZuqEB.jpg", (java.lang.Throwable)brainfuckException2);
    fredboat.util.BrainfuckException brainfuckException8 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException9 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException8);
    java.lang.Throwable[] throwable_array10 = brainfuckException9.getSuppressed();
    fredboat.util.BrainfuckException brainfuckException12 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array13 = brainfuckException12.getSuppressed();
    brainfuckException9.addSuppressed((java.lang.Throwable)brainfuckException12);
    brainfuckException5.addSuppressed((java.lang.Throwable)brainfuckException9);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException16 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)brainfuckException9);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org"+ "'", str4.equals("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array13);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = weatherError1.errorType();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    org.junit.Assert.assertTrue("'" + errorCode2 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode2.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand6 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.fun.CatgirlCommand catgirlCommand7 = new fredboat.command.fun.CatgirlCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    java.lang.String str8 = catgirlCommand7.name;
    java.lang.String[] str_array13 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array13);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.util.CommandsCommand commandsCommand16 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array13);
    fredboat.util.Tuple2<fredboat.command.fun.CatgirlCommand,fredboat.command.util.CommandsCommand> tuple2_catgirlCommand_commandsCommand17 = new fredboat.util.Tuple2<fredboat.command.fun.CatgirlCommand,fredboat.command.util.CommandsCommand>(catgirlCommand7, commandsCommand16);
    fredboat.command.fun.CatgirlCommand catgirlCommand18 = tuple2_catgirlCommand_commandsCommand17.a;
    fredboat.command.util.CommandsCommand commandsCommand19 = tuple2_catgirlCommand_commandsCommand17.b;
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..."+ "'", str8.equals("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..."));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(catgirlCommand18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(commandsCommand19);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand12 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("\u2705", "\u274C", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = remoteFileCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "https://i.imgur.com/YqZuqEB.jpg", "https://i.imgur.com/YqZuqEB.jpg", "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand("\u274C", str_array5);
    fredboat.command.music.seeking.RewindCommand rewindCommand7 = new fredboat.command.music.seeking.RewindCommand("\uD83D\uDCDD", str_array5);
    fredboat.perms.PermissionLevel permissionLevel8 = rewindCommand7.getMinimumPerms();
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = rewindCommand7.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }

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
    fredboat.util.GitRepoState gitRepoState16 = tuple2_uConfig_gitRepoState14.b;
    java.lang.String str17 = gitRepoState16.commitUserName;
    
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
    org.junit.Assert.assertNotNull(gitRepoState16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    int i1 = weatherSystemOpenWeather0.getType();
    weatherSystemOpenWeather0.setType((int)(byte)10);
    int i4 = weatherSystemOpenWeather0.getSunrise();
    weatherSystemOpenWeather0.setSunrise(35);
    weatherSystemOpenWeather0.setCountry("DJ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setTempMax((double)0);
    weatherMainOpenWeather0.setTemp((double)1531609934537L);
    weatherMainOpenWeather0.setHumidity(2);
    weatherMainOpenWeather0.setPressure((int)(short)0);
    weatherMainOpenWeather0.setTempMin((double)'#');
    double d13 = weatherMainOpenWeather0.getTempMax();
    weatherMainOpenWeather0.setPressure(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand10 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.maintenance.GetIdCommand getIdCommand11 = new fredboat.command.maintenance.GetIdCommand("DJ", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    long long1 = uConfig0.getBearerExpiration();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setUserId("\uD83D\uDCDD");
    fredboat.db.entity.UConfig uConfig5 = uConfig0.setBearer("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)");
    long long6 = uConfig5.getBearerExpiration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand8 = new fredboat.command.music.control.LeaveCommand("hi!", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("hi!", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("Bot Admin", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand11 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.perms.PermissionLevel permissionLevel12 = botRestartCommand11.getMinimumPerms();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = botRestartCommand11.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand11 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }

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
    fredboat.db.entity.UConfig uConfig16 = tuple2_uConfig_gitRepoState14.a;
    fredboat.util.GitRepoState gitRepoState17 = tuple2_uConfig_gitRepoState14.b;
    java.lang.String str18 = gitRepoState17.branch;
    java.lang.String str19 = gitRepoState17.commitUserEmail;
    
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
    org.junit.Assert.assertNotNull(uConfig16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gitRepoState17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand12 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand14 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array8);
    fredboat.perms.PermissionLevel permissionLevel15 = restartCommand14.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = restartCommand14.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand11 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.perms.PermissionLevel permissionLevel12 = botRestartCommand11.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand11.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.NodesCommand nodesCommand9 = new fredboat.command.maintenance.NodesCommand("", str_array6);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand10 = new fredboat.command.maintenance.GitInfoCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.fun.CatgirlCommand catgirlCommand11 = new fredboat.command.fun.CatgirlCommand("hi!", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = catgirlCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = enableCommandsCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = enableCommandsCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand12.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }

    java.lang.String[] str_array2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.RemoteFileCommand remoteFileCommand3 = new fredboat.command.fun.RemoteFileCommand("DJ", "fredboat.util.rest.APILimitException: en_US", str_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("en_US", str_array10);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = exitCommand18.getMinimumPerms();
    int i20 = permissionLevel19.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 4);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }

    fredboat.util.BrainfuckException brainfuckException1 = new fredboat.util.BrainfuckException("");
    fredboat.util.rest.APILimitException aPILimitException3 = new fredboat.util.rest.APILimitException("hi!");
    brainfuckException1.addSuppressed((java.lang.Throwable)aPILimitException3);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext6 = simpleTrackProvider0.getTracksInRange((int)(byte)10, 10000);
    fredboat.audio.queue.AudioTrackContext audioTrackContext7 = simpleTrackProvider0.peek();
    simpleTrackProvider0.skipped();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider9 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider10 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext11 = simpleTrackProvider10.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext12 = null;
    simpleTrackProvider10.setLastTrack(audioTrackContext12);
    simpleTrackProvider10.skipped();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider15 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext16 = simpleTrackProvider15.provideAudioTrack();
    int i17 = simpleTrackProvider15.size();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext18 = simpleTrackProvider15.getAsListOrdered();
    simpleTrackProvider10.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext18);
    simpleTrackProvider9.addAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext18);
    simpleTrackProvider0.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext18);
    java.util.Collection<fredboat.audio.queue.AudioTrackContext> collection_audioTrackContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.addAll(collection_audioTrackContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext18);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("Base", "", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = rollCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array15);
    fredboat.command.util.MathCommand mathCommand17 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array15);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("", str_array15);
    fredboat.command.admin.ExitCommand exitCommand19 = new fredboat.command.admin.ExitCommand("hi!", str_array15);
    fredboat.command.admin.BotRestartCommand botRestartCommand20 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array15);
    fredboat.command.admin.ReviveCommand reviveCommand21 = new fredboat.command.admin.ReviveCommand("", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand22 = new fredboat.command.fun.FacedeskCommand("\u2757", "DJ", str_array15);
    fredboat.command.fun.CatgirlCommand catgirlCommand23 = new fredboat.command.fun.CatgirlCommand("fredboat.util.BrainfuckException: ", str_array15);
    fredboat.command.fun.HugCommand hugCommand24 = new fredboat.command.fun.HugCommand("http://i.imgur.com/NqyOqnj.gif", "\u2705", str_array15);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand25 = new fredboat.command.fun.RemoteFileCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array15);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = remoteFileCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.util.BrainfuckCommand brainfuckCommand9 = new fredboat.command.util.BrainfuckCommand("", str_array5);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = brainfuckCommand9.process("", context11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand12 = new fredboat.command.moderation.DisableCommandsCommand("", str_array8);
    fredboat.command.admin.EvalCommand evalCommand13 = new fredboat.command.admin.EvalCommand("", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand14 = new fredboat.command.util.CommandsCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

}
