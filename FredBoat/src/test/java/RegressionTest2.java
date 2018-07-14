
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }

    java.lang.String[] str_array9 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand10 = new fredboat.command.fun.HugCommand("", "\u274C", str_array9);
    fredboat.command.admin.ReviveCommand reviveCommand11 = new fredboat.command.admin.ReviveCommand("Bot Admin", str_array9);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("en_US", str_array9);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = exitCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand20 = new fredboat.command.moderation.LanguageCommand("\uD83D\uDCDD", str_array13);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("fredboat.util.BrainfuckException: \u2705", "\uD83D\uDEAA", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("Bot Admin", str_array13);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = configCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand8 = new fredboat.command.maintenance.PingCommand("\u274C", str_array6);
    fredboat.command.music.info.HistoryCommand historyCommand9 = new fredboat.command.music.info.HistoryCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.moderation.LanguageCommand languageCommand10 = new fredboat.command.moderation.LanguageCommand("hi!", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand11 = new fredboat.command.music.control.ReshuffleCommand("DJ", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = reshuffleCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.control.StopCommand stopCommand7 = new fredboat.command.music.control.StopCommand("\u274C", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array10);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand18 = new fredboat.command.music.control.PauseCommand("qua, 31 dez 1969, 09:00 PM", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("\u2705", str_array10);
    fredboat.command.admin.ReviveCommand reviveCommand17 = new fredboat.command.admin.ReviveCommand("\u274C", str_array10);
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
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand2 = new fredboat.command.fun.DanceCommand("\u2705", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("en_US", str_array10);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = seekCommand18.getMinimumPerms();
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = seekCommand18.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    java.lang.String str3 = openWeatherCurrent0.getName();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode4 = openWeatherCurrent0.errorType();
    openWeatherCurrent0.setId((-1));
    java.lang.String str7 = openWeatherCurrent0.getDataProviderString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertTrue("'" + errorCode4 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode4.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str7.equals("Provided by OpenWeatherMap.org"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("DJ");
    uConfig1.setId("\u274C");
    fredboat.db.entity.UConfig uConfig5 = uConfig1.setBearerExpiration(1531610008191L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig5);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.rateLimitReached = 10;
    blacklistEntry1.rateLimitReachedTimestamp = 1531609944902L;
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    int i7 = blacklistEntry1.level;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1531610051424L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("\u274C", str_array11);
    fredboat.command.maintenance.PingCommand pingCommand18 = new fredboat.command.maintenance.PingCommand("\u2757", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand19 = new fredboat.command.util.WeatherCommand(weather0, "\u274C", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }

    fredboat.util.rest.APILimitException aPILimitException2 = new fredboat.util.rest.APILimitException("en_US");
    fredboat.commandmeta.MessagingException messagingException3 = new fredboat.commandmeta.MessagingException("hi!", (java.lang.Throwable)aPILimitException2);
    java.lang.String str4 = aPILimitException2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "fredboat.util.rest.APILimitException: en_US"+ "'", str4.equals("fredboat.util.rest.APILimitException: en_US"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext6 = simpleTrackProvider0.getTracksInRange((int)(byte)10, 10000);
    fredboat.audio.queue.AudioTrackContext audioTrackContext7 = simpleTrackProvider0.peek();
    boolean b8 = simpleTrackProvider0.isEmpty();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider9 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext10 = null;
    simpleTrackProvider9.setLastTrack(audioTrackContext10);
    fredboat.audio.queue.AudioTrackContext audioTrackContext12 = null;
    simpleTrackProvider9.setLastTrack(audioTrackContext12);
    boolean b14 = simpleTrackProvider9.isEmpty();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider15 = new fredboat.audio.queue.SimpleTrackProvider();
    simpleTrackProvider15.skipped();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext17 = simpleTrackProvider15.getAsListOrdered();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext18 = simpleTrackProvider15.getAsList();
    simpleTrackProvider9.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext18);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext20 = simpleTrackProvider9.getAsListOrdered();
    simpleTrackProvider0.addAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext20);
    simpleTrackProvider0.setShuffle(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext20);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("Bot Admin");
    java.lang.String str2 = guildConfig1.getGuildId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Bot Admin"+ "'", str2.equals("Bot Admin"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    int i1 = weatherSystemOpenWeather0.getId();
    weatherSystemOpenWeather0.setType((int)'a');
    int i4 = weatherSystemOpenWeather0.getSunset();
    int i5 = weatherSystemOpenWeather0.getSunset();
    weatherSystemOpenWeather0.setSunset(3000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("Bot Admin", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = enableCommandsCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.PauseCommand pauseCommand9 = new fredboat.command.music.control.PauseCommand("", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = pauseCommand9.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel11 = pauseCommand9.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = pauseCommand9.getMinimumPerms();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = pauseCommand9.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand12 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand13 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.admin.ReviveCommand reviveCommand15 = new fredboat.command.admin.ReviveCommand("\uD83D\uDEAA", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array15);
    fredboat.command.admin.BotRestartCommand botRestartCommand17 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array15);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array15);
    fredboat.command.admin.ReviveCommand reviveCommand21 = new fredboat.command.admin.ReviveCommand("fredboat.util.BrainfuckException: \u2705", str_array15);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand22 = new fredboat.command.admin.UnblacklistCommand("Bot Admin", str_array15);
    fredboat.command.admin.ExitCommand exitCommand23 = new fredboat.command.admin.ExitCommand("qua, 31 dez 1969, 09:00 PM", str_array15);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = exitCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand16 = new fredboat.command.util.CommandsCommand("https://i.imgur.com/YqZuqEB.jpg", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("\u2757", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = enableCommandsCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "https://i.imgur.com/YqZuqEB.jpg", "https://i.imgur.com/YqZuqEB.jpg", "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.ShuffleCommand shuffleCommand7 = new fredboat.command.music.control.ShuffleCommand("\u274C", str_array6);
    fredboat.command.music.seeking.RewindCommand rewindCommand8 = new fredboat.command.music.seeking.RewindCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.seeking.RewindCommand rewindCommand9 = new fredboat.command.music.seeking.RewindCommand("fredboat.util.BrainfuckException: ", str_array6);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = rewindCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str2 = weatherError1.getFormattedDate();
    java.lang.String str3 = weatherError1.getFormattedDate();
    java.lang.String str4 = weatherError1.getLocation();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode5 = weatherError1.errorType();
    java.lang.String str6 = weatherError1.getDataProviderString();
    java.lang.String str7 = weatherError1.getDataProviderString();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    org.junit.Assert.assertTrue("'" + errorCode5 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode5.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }

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
    java.lang.String str21 = brainfuckCommand18.process("\uD83D\uDEAA", context20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.util.MathCommand mathCommand7 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand8 = new fredboat.command.music.control.UnpauseCommand("", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = unpauseCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = unpauseCommand8.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand8.onInvoke(commandContext11);
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
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand14 = new fredboat.command.music.control.JoinCommand("\u2705", str_array9);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("Base", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }

    fredboat.commandmeta.MessagingException messagingException1 = new fredboat.commandmeta.MessagingException("http://i.imgur.com/NqyOqnj.gif");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException2 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)messagingException1);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    java.lang.String str3 = openWeatherCurrent0.getWeatherDescription();
    int i4 = openWeatherCurrent0.getVisibility();
    int i5 = openWeatherCurrent0.getCode();
    java.lang.String str6 = openWeatherCurrent0.getFormattedDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str2.equals("Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str6.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.getId();
    blacklistEntry1.setLevel(0);
    blacklistEntry1.setRateLimitReached((int)(byte)100);
    long long10 = blacklistEntry1.id;
    blacklistEntry1.id = 5;
    blacklistEntry1.blacklistedTimestamp = 'a';
    long long15 = blacklistEntry1.id;
    blacklistEntry1.level = (byte)0;
    blacklistEntry1.rateLimitReached = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 5L);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    weatherSystemOpenWeather0.setId((int)(short)100);
    int i3 = weatherSystemOpenWeather0.getType();
    int i4 = weatherSystemOpenWeather0.getType();
    int i5 = weatherSystemOpenWeather0.getSunset();
    java.lang.String str6 = weatherSystemOpenWeather0.getCountry();
    weatherSystemOpenWeather0.setCountry("Bot Owner");
    java.lang.String str9 = weatherSystemOpenWeather0.getCountry();
    weatherSystemOpenWeather0.setId((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Bot Owner"+ "'", str9.equals("Bot Owner"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    java.lang.String str3 = openWeatherCurrent0.getName();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather4 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather5 = openWeatherCurrent0.getClouds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloudsOpenWeather4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloudsOpenWeather5);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("\u274C", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array8);
    fredboat.command.util.WeatherCommand weatherCommand12 = new fredboat.command.util.WeatherCommand(weather2, ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("\u2757", str_array8);
    fredboat.command.moderation.ConfigCommand configCommand14 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array8 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array8);
    fredboat.command.util.WeatherCommand weatherCommand12 = new fredboat.command.util.WeatherCommand(weather0, "\uD83D\uDEAA", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("qua, 31 dez 1969, 09:00 PM");
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
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand14 = new fredboat.command.admin.ReviveCommand("", str_array8);
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
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str2 = weatherError1.getDataProviderIcon();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode3 = weatherError1.errorType();
    java.lang.String str4 = weatherError1.getWeatherDescription();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    org.junit.Assert.assertTrue("'" + errorCode3 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode3.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array10);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("https://i.imgur.com/YqZuqEB.jpg", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand18 = new fredboat.command.moderation.LanguageCommand("\u2705", str_array10);
    java.util.List<java.lang.String> list_str19 = languageCommand18.aliases;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str19);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }

    fredboat.util.GitRepoState gitRepoState0 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str1 = gitRepoState0.commitMessageShort;
    java.lang.String str2 = gitRepoState0.commitUserName;
    java.lang.String str3 = gitRepoState0.commitMessageFull;
    java.lang.String str4 = gitRepoState0.commitTime;
    java.lang.String str5 = gitRepoState0.commitIdAbbrev;
    java.lang.String str6 = gitRepoState0.commitUserName;
    java.lang.String str7 = gitRepoState0.commitUserName;
    java.lang.String str8 = gitRepoState0.commitId;
    java.lang.String str9 = gitRepoState0.commitMessageFull;
    java.lang.String str10 = gitRepoState0.commitTime;
    java.lang.String str11 = gitRepoState0.commitIdAbbrev;
    java.lang.String str12 = gitRepoState0.commitUserEmail;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.maintenance.PingCommand pingCommand7 = new fredboat.command.maintenance.PingCommand("\u274C", str_array5);
    fredboat.command.music.control.StopCommand stopCommand8 = new fredboat.command.music.control.StopCommand("\u274C", str_array5);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("\uD83D\uDEAA", str_array5);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params10 = fredboat.util.rest.Http.Params.of(str_array5);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather3 = openWeatherCurrent0.getWeather();
    java.lang.String str4 = openWeatherCurrent0.getWeatherDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    org.junit.Assert.assertTrue("'" + errorCode2 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode2.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_weatherOpenWeather3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    weatherSystemOpenWeather0.setId((int)(short)100);
    int i3 = weatherSystemOpenWeather0.getType();
    int i4 = weatherSystemOpenWeather0.getId();
    weatherSystemOpenWeather0.setSunrise(1);
    weatherSystemOpenWeather0.setSunset(5);
    weatherSystemOpenWeather0.setId(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = listCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("\u274C");
    fredboat.db.entity.UConfig uConfig3 = uConfig1.setBearerExpiration(0L);
    long long4 = uConfig1.getBearerExpiration();
    fredboat.db.entity.UConfig uConfig6 = uConfig1.setRefresh("\u2705");
    uConfig6.setId("fredboat.util.BrainfuckException: \uD83D\uDEAA");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand20 = new fredboat.command.music.control.JoinCommand("https://i.imgur.com/YqZuqEB.jpg", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand21 = new fredboat.command.music.control.PauseCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = pauseCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("\u274C", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array8);
    fredboat.command.admin.UpdateCommand updateCommand13 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand14 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("", str_array8);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = shuffleCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.id;
    blacklistEntry1.setBlacklistedTimestamp((long)(short)-1);
    long long8 = blacklistEntry1.rateLimitReachedTimestamp;
    long long9 = blacklistEntry1.rateLimitReachedTimestamp;
    blacklistEntry1.setRateLimitReachedTimestamp(1531609962820L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 100L);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand10 = new fredboat.command.music.seeking.RestartCommand("", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand11 = new fredboat.command.music.control.JoinCommand("https://i.imgur.com/YqZuqEB.jpg", str_array7);
    fredboat.command.maintenance.NodesCommand nodesCommand12 = new fredboat.command.maintenance.NodesCommand("fredboat.util.BrainfuckException: ", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand13 = new fredboat.command.music.control.JoinCommand("qua, 31 dez 1969, 09:00 PM", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = historyCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    fredboat.util.rest.models.weather.WeatherError weatherError2 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str3 = weatherError2.getFormattedDate();
    java.lang.String str4 = weatherError2.getDataProviderString();
    java.lang.String str5 = weatherError2.getThumbnailUrl();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("en_US", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }

    fredboat.util.BrainfuckException brainfuckException4 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException5 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException4);
    fredboat.commandmeta.MessagingException messagingException6 = new fredboat.commandmeta.MessagingException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException4);
    fredboat.util.BrainfuckException brainfuckException10 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException11 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException10);
    fredboat.util.BrainfuckException brainfuckException12 = new fredboat.util.BrainfuckException(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", (java.lang.Throwable)brainfuckException10);
    brainfuckException4.addSuppressed((java.lang.Throwable)brainfuckException12);
    fredboat.util.BrainfuckException brainfuckException15 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array16 = brainfuckException15.getSuppressed();
    brainfuckException12.addSuppressed((java.lang.Throwable)brainfuckException15);
    fredboat.util.BrainfuckException brainfuckException21 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException22 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException21);
    fredboat.commandmeta.MessagingException messagingException23 = new fredboat.commandmeta.MessagingException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException21);
    fredboat.util.BrainfuckException brainfuckException27 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException28 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException27);
    fredboat.util.BrainfuckException brainfuckException29 = new fredboat.util.BrainfuckException(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", (java.lang.Throwable)brainfuckException27);
    brainfuckException21.addSuppressed((java.lang.Throwable)brainfuckException29);
    brainfuckException12.addSuppressed((java.lang.Throwable)brainfuckException21);
    java.lang.String str32 = brainfuckException21.toString();
    fredboat.util.BrainfuckException brainfuckException36 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException37 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException36);
    fredboat.commandmeta.MessagingException messagingException38 = new fredboat.commandmeta.MessagingException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException36);
    fredboat.util.BrainfuckException brainfuckException42 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException43 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException42);
    fredboat.util.BrainfuckException brainfuckException44 = new fredboat.util.BrainfuckException(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", (java.lang.Throwable)brainfuckException42);
    brainfuckException36.addSuppressed((java.lang.Throwable)brainfuckException44);
    fredboat.util.BrainfuckException brainfuckException47 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array48 = brainfuckException47.getSuppressed();
    brainfuckException44.addSuppressed((java.lang.Throwable)brainfuckException47);
    fredboat.util.BrainfuckException brainfuckException53 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException54 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException53);
    fredboat.commandmeta.MessagingException messagingException55 = new fredboat.commandmeta.MessagingException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException53);
    fredboat.util.BrainfuckException brainfuckException59 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException60 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException59);
    fredboat.util.BrainfuckException brainfuckException61 = new fredboat.util.BrainfuckException(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", (java.lang.Throwable)brainfuckException59);
    brainfuckException53.addSuppressed((java.lang.Throwable)brainfuckException61);
    brainfuckException44.addSuppressed((java.lang.Throwable)brainfuckException53);
    fredboat.util.rest.APILimitException aPILimitException66 = new fredboat.util.rest.APILimitException("en_US");
    fredboat.commandmeta.MessagingException messagingException67 = new fredboat.commandmeta.MessagingException("hi!", (java.lang.Throwable)aPILimitException66);
    brainfuckException53.addSuppressed((java.lang.Throwable)aPILimitException66);
    brainfuckException21.addSuppressed((java.lang.Throwable)aPILimitException66);
    fredboat.util.BrainfuckException brainfuckException70 = new fredboat.util.BrainfuckException("\u2757", (java.lang.Throwable)aPILimitException66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "fredboat.util.BrainfuckException: hi!"+ "'", str32.equals("fredboat.util.BrainfuckException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array48);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }

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
    fredboat.perms.PermissionLevel permissionLevel22 = joinCommand20.getMinimumPerms();
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = joinCommand20.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.USER));
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.music.seeking.ForwardCommand forwardCommand10 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.moderation.ConfigCommand configCommand11 = new fredboat.command.moderation.ConfigCommand("\u2757", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = configCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("fredboat.util.BrainfuckException: \uD83D\uDEAA");
    boolean b2 = guildConfig1.isTrackAnnounce();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }

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
    java.lang.String str19 = catgirlCommand7.help(context18);
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
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode1 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider0.setRepeatMode(repeatMode1);
    boolean b3 = simpleTrackProvider0.isEmpty();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext6 = simpleTrackProvider0.getTracksInRange(3000, (int)(short)1);
    fredboat.audio.queue.AudioTrackContext audioTrackContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.add(audioTrackContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + repeatMode1 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode1.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext6);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("Provided by OpenWeatherMap.org", str_array8);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params14 = fredboat.util.rest.Http.Params.of(str_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand7 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.maintenance.GetIdCommand getIdCommand9 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand8 = new fredboat.command.music.control.LeaveCommand("hi!", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("hi!", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand17 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = reshuffleCommand17.getMinimumPerms();
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = reshuffleCommand17.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand18.onInvoke(commandContext19);
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

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }

    fredboat.commandmeta.MessagingException messagingException1 = new fredboat.commandmeta.MessagingException("\uD83D\uDEAA");

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand17 = new fredboat.command.music.seeking.RestartCommand("Bot Admin", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("Provided by OpenWeatherMap.org", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = rewindCommand18.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel20 = rewindCommand18.getMinimumPerms();
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = rewindCommand18.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array9);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("en_US", str_array9);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand16 = new fredboat.command.music.control.ReshuffleCommand("\u274C", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = reshuffleCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.StopCommand stopCommand2 = new fredboat.command.music.control.StopCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.maintenance.PingCommand pingCommand7 = new fredboat.command.maintenance.PingCommand("\u274C", str_array5);
    fredboat.command.music.control.DestroyCommand destroyCommand8 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array5);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = avatarCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand2 = new fredboat.command.moderation.DisableCommandsCommand("https://i.imgur.com/YqZuqEB.jpg", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("en_US", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("fredboat.util.BrainfuckException: ", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = unblacklistCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand14 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.LeaveCommand leaveCommand15 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand16 = new fredboat.command.music.control.DestroyCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("\u2757", str_array10);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand18 = new fredboat.command.fun.DanceCommand("qua, 31 dez 1969, 09:00 PM", str_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.fun.FacedeskCommand facedeskCommand10 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = unpauseCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = rewindCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = rewindCommand13.getMinimumPerms();
    java.lang.String str16 = permissionLevel15.getName();
    int i17 = permissionLevel15.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "DJ"+ "'", str16.equals("DJ"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("Bot Admin", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = testCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = testCommand10.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }

    fredboat.util.BrainfuckException brainfuckException2 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException5 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    fredboat.util.BrainfuckException brainfuckException6 = new fredboat.util.BrainfuckException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException5);
    brainfuckException2.addSuppressed((java.lang.Throwable)brainfuckException5);
    fredboat.commandmeta.MessagingException messagingException8 = new fredboat.commandmeta.MessagingException("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", (java.lang.Throwable)brainfuckException5);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider2 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode3 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider2.setRepeatMode(repeatMode3);
    boolean b5 = simpleTrackProvider2.isEmpty();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext8 = simpleTrackProvider2.getTracksInRange(5, (int)' ');
    simpleTrackProvider0.addAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext8);
    simpleTrackProvider0.skipped();
    fredboat.audio.queue.RepeatMode repeatMode11 = fredboat.audio.queue.RepeatMode.ALL;
    simpleTrackProvider0.setRepeatMode(repeatMode11);
    simpleTrackProvider0.setShuffle(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    org.junit.Assert.assertTrue("'" + repeatMode3 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode3.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext8);
    org.junit.Assert.assertTrue("'" + repeatMode11 + "' != '" + fredboat.audio.queue.RepeatMode.ALL + "'", repeatMode11.equals(fredboat.audio.queue.RepeatMode.ALL));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }

    fredboat.util.rest.Weather weather6 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather6, "Bot Admin", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand20 = new fredboat.command.admin.SetAvatarCommand("\u2757", str_array14);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: ", str_array14);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("https://i.imgur.com/YqZuqEB.jpg", "", str_array14);
    fredboat.command.admin.ExitCommand exitCommand23 = new fredboat.command.admin.ExitCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = exitCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.music.seeking.ForwardCommand forwardCommand9 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = forwardCommand9.getMinimumPerms();
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = forwardCommand9.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand13 = new fredboat.command.music.seeking.RestartCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand14 = new fredboat.command.music.seeking.RestartCommand("Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("DJ", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = gitInfoCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    int i1 = weatherSystemOpenWeather0.getType();
    int i2 = weatherSystemOpenWeather0.getSunrise();
    int i3 = weatherSystemOpenWeather0.getSunrise();
    int i4 = weatherSystemOpenWeather0.getId();
    weatherSystemOpenWeather0.setSunset((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("hi!", "fredboat.util.BrainfuckException: \u2705", str_array7);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand("\u2705", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = mathCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.music.control.PauseCommand pauseCommand11 = new fredboat.command.music.control.PauseCommand("", str_array7);
    fredboat.command.admin.ReviveCommand reviveCommand12 = new fredboat.command.admin.ReviveCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.fun.CatgirlCommand catgirlCommand13 = new fredboat.command.fun.CatgirlCommand("fredboat.util.BrainfuckException: \uD83D\uDEAA", str_array7);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = catgirlCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.ReviveCommand reviveCommand2 = new fredboat.command.admin.ReviveCommand("fredboat.util.rest.APILimitException: en_US", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }

    fredboat.audio.queue.PlaylistInfo.Source source4 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo5 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source4);
    fredboat.audio.queue.PlaylistInfo playlistInfo6 = new fredboat.audio.queue.PlaylistInfo(1, ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", source4);
    playlistInfo6.setTotalTracks((int)'a');
    org.junit.Assert.assertTrue("'" + source4 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source4.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array9);
    fredboat.command.admin.ReviveCommand reviveCommand14 = new fredboat.command.admin.ReviveCommand("fredboat.util.BrainfuckException: \u2705", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = shuffleCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    blacklistEntry1.setBlacklistedTimestamp((long)(short)-1);
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    int i7 = blacklistEntry1.getLevel();
    long long8 = blacklistEntry1.getRateLimitReachedTimestamp();
    blacklistEntry1.id = 1531610038586L;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 100L);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand11 = new fredboat.command.maintenance.PingCommand("\u274C", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand13 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array9);
    fredboat.command.admin.UpdateCommand updateCommand14 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand15 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("en_US", "\u2757", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext1);
    fredboat.audio.queue.AudioTrackContext audioTrackContext3 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext3);
    boolean b5 = simpleTrackProvider0.isEmpty();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider6 = new fredboat.audio.queue.SimpleTrackProvider();
    simpleTrackProvider6.skipped();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext8 = simpleTrackProvider6.getAsListOrdered();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext9 = simpleTrackProvider6.getAsList();
    simpleTrackProvider0.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext9);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext11 = simpleTrackProvider0.getAsListOrdered();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider12 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext13 = simpleTrackProvider12.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext14 = null;
    simpleTrackProvider12.setLastTrack(audioTrackContext14);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext18 = simpleTrackProvider12.getTracksInRange((int)(byte)10, 10000);
    fredboat.audio.queue.AudioTrackContext audioTrackContext19 = simpleTrackProvider12.peek();
    boolean b20 = simpleTrackProvider12.isEmpty();
    fredboat.audio.queue.AudioTrackContext audioTrackContext21 = simpleTrackProvider12.peek();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext22 = simpleTrackProvider12.getAsListOrdered();
    simpleTrackProvider0.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext22);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.audio.queue.AudioTrackContext audioTrackContext25 = simpleTrackProvider0.getTrack(10000);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext22);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand13 = new fredboat.command.music.control.JoinCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("fredboat.util.BrainfuckException: ", str_array9);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("fredboat.util.BrainfuckException: \u2705", "", str_array9);
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
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array6);
    textCommand9.msg = "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...";
    textCommand9.msg = "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...";
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand9.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setTempMax((double)0);
    weatherMainOpenWeather0.setTemp((double)0L);
    double d7 = weatherMainOpenWeather0.getTempMax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    int i5 = blacklistEntry1.getLevel();
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    int i7 = blacklistEntry1.level;
    int i8 = blacklistEntry1.getRateLimitReached();
    blacklistEntry1.setBlacklistedTimestamp(1531609991976L);
    blacklistEntry1.setBlacklistedTimestamp((long)(byte)10);
    long long13 = blacklistEntry1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1531610060471L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 10L);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array14);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.admin.ReviveCommand reviveCommand20 = new fredboat.command.admin.ReviveCommand("fredboat.util.BrainfuckException: \u2705", str_array14);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("Bot Admin", str_array14);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = unblacklistCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand11 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("Bot Admin", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
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
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }

    fredboat.audio.queue.PlaylistInfo.Source source2 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo3 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source2);
    fredboat.audio.queue.PlaylistInfo.Source source6 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo7 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source6);
    playlistInfo7.setTotalTracks((int)(short)0);
    fredboat.audio.queue.PlaylistInfo.Source source14 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo15 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source14);
    fredboat.audio.queue.PlaylistInfo playlistInfo16 = new fredboat.audio.queue.PlaylistInfo(1, ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", source14);
    playlistInfo7.setSource(source14);
    playlistInfo3.setSource(source14);
    fredboat.audio.queue.PlaylistInfo.Source source23 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo24 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source23);
    fredboat.audio.queue.PlaylistInfo playlistInfo25 = new fredboat.audio.queue.PlaylistInfo(1, ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", source23);
    playlistInfo3.setSource(source23);
    org.junit.Assert.assertTrue("'" + source2 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source2.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    org.junit.Assert.assertTrue("'" + source6 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source6.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    org.junit.Assert.assertTrue("'" + source14 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source14.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    org.junit.Assert.assertTrue("'" + source23 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source23.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }

    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException4 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException3);
    java.lang.Throwable[] throwable_array5 = brainfuckException4.getSuppressed();
    fredboat.util.BrainfuckException brainfuckException7 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array8 = brainfuckException7.getSuppressed();
    brainfuckException4.addSuppressed((java.lang.Throwable)brainfuckException7);
    fredboat.util.BrainfuckException brainfuckException14 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException15 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException14);
    fredboat.util.BrainfuckException brainfuckException16 = new fredboat.util.BrainfuckException("\uD83D\uDEAA", (java.lang.Throwable)brainfuckException14);
    fredboat.commandmeta.MessagingException messagingException17 = new fredboat.commandmeta.MessagingException("", (java.lang.Throwable)brainfuckException16);
    brainfuckException4.addSuppressed((java.lang.Throwable)brainfuckException16);
    fredboat.util.BrainfuckException brainfuckException19 = new fredboat.util.BrainfuckException("fredboat.util.BrainfuckException: ", (java.lang.Throwable)brainfuckException16);
    java.lang.Throwable[] throwable_array20 = brainfuckException16.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array20);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("", str_array4);
    fredboat.command.music.info.ListCommand listCommand6 = new fredboat.command.music.info.ListCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand6.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.util.MathCommand mathCommand8 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("", str_array6);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = exitCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = exitCommand10.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array8);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand14 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.admin.UpdateCommand updateCommand11 = new fredboat.command.admin.UpdateCommand("", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand12 = new fredboat.command.fun.CatgirlCommand("Bot Admin", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand("\u2705", str_array9);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array9);
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
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("fredboat.util.BrainfuckException: ");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("qua, 31 dez 1969, 09:00 PM");
    statsAgent1.run();
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
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    int i5 = blacklistEntry1.getLevel();
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    blacklistEntry1.setLevel((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    blacklistEntry1.setId("");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1531610061377L);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    java.lang.String str3 = openWeatherCurrent0.getName();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode4 = openWeatherCurrent0.errorType();
    openWeatherCurrent0.setId((-1));
    boolean b7 = openWeatherCurrent0.isError();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertTrue("'" + errorCode4 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode4.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("en_US", str_array12);
    fredboat.command.fun.PatCommand patCommand20 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = patCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array11);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand15 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.perms.PermissionLevel permissionLevel16 = playSplitCommand15.getMinimumPerms();
    int i17 = permissionLevel16.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.USER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand8 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.JoinCommand joinCommand9 = new fredboat.command.music.control.JoinCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand10 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDCDD", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand8 = new fredboat.command.maintenance.PingCommand("\u274C", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand9 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array6);
    fredboat.command.admin.UpdateCommand updateCommand11 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = updateCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    fredboat.db.entity.UConfig uConfig5 = uConfig0.setBearerExpiration((long)(short)10);
    fredboat.db.entity.UConfig uConfig7 = uConfig5.setBearerExpiration(1531609994016L);
    long long8 = uConfig5.getBearerExpiration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1531609994016L);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("Base", (int)'#', timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand11 = new fredboat.command.fun.DanceCommand("Base", str_array6);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.fun.RollCommand rollCommand7 = new fredboat.command.fun.RollCommand("hi!", "DJ", str_array5);
    java.io.File file8 = rollCommand7.getRandomFile();
    java.io.File file9 = rollCommand7.getRandomFile();
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = rollCommand7.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file9);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }

    fredboat.util.BrainfuckException brainfuckException2 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException2);
    java.lang.String str4 = brainfuckException2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "fredboat.util.BrainfuckException: hi!"+ "'", str4.equals("fredboat.util.BrainfuckException: hi!"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.AvatarCommand avatarCommand12 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand13 = new fredboat.command.fun.CatgirlCommand("hi!", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("en_US", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("https://i.imgur.com/YqZuqEB.jpg", "fredboat.util.BrainfuckException: ", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    remoteFileCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.music.control.UnpauseCommand unpauseCommand15 = new fredboat.command.music.control.UnpauseCommand("", str_array12);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand19 = new fredboat.command.music.control.PauseCommand("en_US", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand20 = new fredboat.command.maintenance.AudioDebugCommand("DJ", str_array12);
    fredboat.command.fun.RandomImageCommand randomImageCommand21 = new fredboat.command.fun.RandomImageCommand("fredboat.util.BrainfuckException: \u2705", "", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    randomImageCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }

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
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = updateCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand19 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("\uD83D\uDCDD", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand23 = new fredboat.command.maintenance.GitInfoCommand("", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand24 = new fredboat.command.moderation.ConfigCommand("hi!", str_array13);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = configCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("en_US", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand18 = new fredboat.command.maintenance.NodesCommand("en_US", str_array10);
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
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.maintenance.PingCommand pingCommand11 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array7);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand("https://i.imgur.com/YqZuqEB.jpg", str_array7);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = versionCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = repeatCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand12 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand13 = new fredboat.command.util.CommandsCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.HugCommand hugCommand14 = new fredboat.command.fun.HugCommand("", "\u2705", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = hugCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getCode();
    int i4 = openWeatherCurrent0.getDatetime();
    java.lang.String str5 = openWeatherCurrent0.getWeatherDescription();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather6 = openWeatherCurrent0.getClouds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str2.equals("Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloudsOpenWeather6);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather0.setId(0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }

    java.lang.String[] str_array2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.RandomImageCommand randomImageCommand3 = new fredboat.command.fun.RandomImageCommand("User", "Base", str_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    int i1 = weatherSystemOpenWeather0.getType();
    int i2 = weatherSystemOpenWeather0.getSunrise();
    weatherSystemOpenWeather0.setId((int)(short)100);
    java.lang.String str5 = weatherSystemOpenWeather0.getCountry();
    weatherSystemOpenWeather0.setCountry("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("hi!");
    guildConfig1.setLang("\u2757");
    guildConfig1.setLang("\uD83D\uDCDD");
    guildConfig1.setId("http://i.imgur.com/NqyOqnj.gif");

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.music.info.HistoryCommand historyCommand19 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("\u274C", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand21 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand22 = new fredboat.command.music.info.ListCommand("User", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("\uD83D\uDCDD", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    java.lang.String str1 = openWeatherCurrent0.getLocation();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather2 = openWeatherCurrent0.getClouds();
    java.lang.String str3 = openWeatherCurrent0.getName();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloudsOpenWeather2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str4.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand8 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.fun.CatgirlCommand catgirlCommand9 = new fredboat.command.fun.CatgirlCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.fun.PatCommand patCommand10 = new fredboat.command.fun.PatCommand("", "fredboat.util.BrainfuckException: \uD83D\uDEAA", str_array7);
    java.lang.String str11 = patCommand10.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand10.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str11.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.fun.FacedeskCommand facedeskCommand10 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.perms.PermissionLevel permissionLevel12 = unpauseCommand11.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand11.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.admin.UpdateCommand updateCommand11 = new fredboat.command.admin.UpdateCommand("", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand12 = new fredboat.command.fun.CatgirlCommand("Bot Admin", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand("\u2705", str_array9);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array9);
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
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    simpleTrackProvider0.skipped();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext4 = simpleTrackProvider0.getTracksInRange(3000, 10);
    fredboat.audio.queue.AudioTrackContext audioTrackContext5 = simpleTrackProvider0.provideAudioTrack();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext6 = simpleTrackProvider0.getAsList();
    fredboat.audio.queue.AudioTrackContext audioTrackContext7 = simpleTrackProvider0.provideAudioTrack();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext8 = simpleTrackProvider0.getAsList();
    int i9 = simpleTrackProvider0.streamsCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }

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
    fredboat.perms.PermissionLevel permissionLevel21 = exitCommand20.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand20.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand("\u2757", str_array9);
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
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    long long1 = simpleTrackProvider0.getDurationMillis();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider2 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext3 = simpleTrackProvider2.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext4 = null;
    simpleTrackProvider2.setLastTrack(audioTrackContext4);
    java.lang.Long[] long_array9 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long10 = new java.util.ArrayList<java.lang.Long>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long10, long_array9);
    simpleTrackProvider2.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long10);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider13 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext14 = simpleTrackProvider13.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext15 = null;
    simpleTrackProvider13.setLastTrack(audioTrackContext15);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext17 = simpleTrackProvider13.getAsListOrdered();
    simpleTrackProvider2.addAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext17);
    simpleTrackProvider0.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext17);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext20 = simpleTrackProvider0.getAsListOrdered();
    simpleTrackProvider0.skipped();
    simpleTrackProvider0.setShuffle(true);
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.reshuffle();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext20);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext1);
    int i3 = simpleTrackProvider0.size();
    fredboat.audio.queue.AudioTrackContext audioTrackContext4 = simpleTrackProvider0.peek();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider5 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext6 = simpleTrackProvider5.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext7 = null;
    simpleTrackProvider5.setLastTrack(audioTrackContext7);
    java.lang.Long[] long_array12 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    simpleTrackProvider5.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long13);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long13);
    simpleTrackProvider0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.PauseCommand pauseCommand10 = new fredboat.command.music.control.PauseCommand("", str_array6);
    fredboat.command.admin.ReviveCommand reviveCommand11 = new fredboat.command.admin.ReviveCommand("\uD83D\uDCDD", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }

    fredboat.db.entity.GuildConfig guildConfig0 = new fredboat.db.entity.GuildConfig();
    java.lang.String str1 = guildConfig0.getGuildId();
    boolean b2 = guildConfig0.isTrackAnnounce();
    boolean b3 = guildConfig0.isAutoResume();
    guildConfig0.setLang("DJ");
    guildConfig0.setLang("http://i.imgur.com/NqyOqnj.gif");
    guildConfig0.setAutoResume(false);
    guildConfig0.setId("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand("fredboat.util.BrainfuckException: \u2705", str_array5);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = shuffleCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand8 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand9 = new fredboat.command.moderation.EnableCommandsCommand("", str_array6);
    fredboat.command.admin.TestCommand testCommand10 = new fredboat.command.admin.TestCommand("fredboat.util.BrainfuckException: ", str_array6);
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
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.level = (short)10;
    long long4 = blacklistEntry1.blacklistedTimestamp;
    long long5 = blacklistEntry1.rateLimitReachedTimestamp;
    int i6 = blacklistEntry1.level;
    blacklistEntry1.rateLimitReachedTimestamp = (byte)-1;
    blacklistEntry1.setLevel(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1531610067664L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand12 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand13 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.admin.ReviveCommand reviveCommand15 = new fredboat.command.admin.ReviveCommand("\uD83D\uDEAA", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = reviveCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = enableCommandsCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = enableCommandsCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = enableCommandsCommand12.help(context15);
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
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }

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
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = enableCommandsCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand13.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand18 = new fredboat.command.admin.ReviveCommand("hi!", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand19 = new fredboat.command.util.WeatherCommand(weather0, "DJ", str_array11);
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
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array9);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("en_US", str_array9);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand16 = new fredboat.command.music.control.ReshuffleCommand("\u274C", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = reshuffleCommand16.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand16.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand10 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("Bot Admin", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = destroyCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }

    fredboat.util.GitRepoState gitRepoState0 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str1 = gitRepoState0.commitMessageShort;
    java.lang.String str2 = gitRepoState0.commitUserName;
    java.lang.String str3 = gitRepoState0.commitMessageFull;
    java.lang.String str4 = gitRepoState0.commitTime;
    java.lang.String str5 = gitRepoState0.commitUserName;
    java.lang.String str6 = gitRepoState0.commitUserEmail;
    java.lang.String str7 = gitRepoState0.commitUserEmail;
    java.lang.String str8 = gitRepoState0.commitMessageShort;
    
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
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array10);
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("DJ", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("\uD83D\uDCDD", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = configCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = configCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = configCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = configCommand15.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand17 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array11);
    fredboat.command.admin.EvalCommand evalCommand18 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand19 = new fredboat.command.moderation.LanguageCommand("hi!", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand20 = new fredboat.command.moderation.EnableCommandsCommand("Bot Admin", str_array11);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = enableCommandsCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    int i1 = weatherSystemOpenWeather0.getType();
    weatherSystemOpenWeather0.setType((int)(byte)10);
    int i4 = weatherSystemOpenWeather0.getSunrise();
    int i5 = weatherSystemOpenWeather0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("https://i.imgur.com/YqZuqEB.jpg", 3000, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str2 = weatherError1.getDataProviderIcon();
    java.lang.String str3 = weatherError1.getFormattedDate();
    java.lang.String str4 = weatherError1.getFormattedDate();
    java.lang.String str5 = weatherError1.getDataProviderString();
    boolean b6 = weatherError1.isError();
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

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array12);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array12);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = rewindCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = rewindCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand13.onInvoke(commandContext16);
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
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand12 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "fredboat.util.BrainfuckException: \u2705", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand15 = new fredboat.command.music.control.JoinCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
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
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.PlaySplitCommand playSplitCommand2 = new fredboat.command.music.control.PlaySplitCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("\u274C", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather1, "https://i.imgur.com/YqZuqEB.jpg", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("Bot Admin", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = getIdCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand12 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("hi!", "fredboat.util.BrainfuckException: \u2705", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand14 = new fredboat.command.music.info.HistoryCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand15 = new fredboat.command.music.control.JoinCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand16 = new fredboat.command.maintenance.PingCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
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
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setUserId("fredboat.util.BrainfuckException: \u2705");
    uConfig3.setId("DJ");
    java.lang.String str6 = uConfig3.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array9);
    fredboat.command.admin.ReviveCommand reviveCommand14 = new fredboat.command.admin.ReviveCommand("fredboat.util.BrainfuckException: \u2705", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = shuffleCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = shuffleCommand15.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    simpleTrackProvider0.skipped();
    fredboat.audio.queue.RepeatMode repeatMode5 = simpleTrackProvider0.getRepeatMode();
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
    org.junit.Assert.assertTrue("'" + repeatMode5 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode5.equals(fredboat.audio.queue.RepeatMode.OFF));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = leaveCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = leaveCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = leaveCommand12.help(context15);
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
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.getId();
    blacklistEntry1.rateLimitReachedTimestamp = (-1L);
    long long8 = blacklistEntry1.id;
    long long9 = blacklistEntry1.id;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 10L);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.NodesCommand nodesCommand9 = new fredboat.command.maintenance.NodesCommand("", str_array6);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand10 = new fredboat.command.maintenance.GitInfoCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.fun.CatgirlCommand catgirlCommand11 = new fredboat.command.fun.CatgirlCommand("hi!", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setTempMax((double)0);
    double d5 = weatherMainOpenWeather0.getTempMax();
    int i6 = weatherMainOpenWeather0.getHumidity();
    weatherMainOpenWeather0.setTemp((double)0);
    weatherMainOpenWeather0.setPressure((int)(short)-1);
    double d11 = weatherMainOpenWeather0.getTempMax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }

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
    java.lang.String str11 = openWeatherCurrent0.getDataProviderString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str2.equals("Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloudsOpenWeather7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str11.equals("Provided by OpenWeatherMap.org"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.util.MathCommand mathCommand8 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = setAvatarCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.fun.HugCommand hugCommand15 = new fredboat.command.fun.HugCommand("DJ", "hi!", str_array9);
    java.lang.String str16 = hugCommand15.getRandomImageUrl();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = hugCommand15.help(context17);
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
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }

    fredboat.db.entity.GuildConfig guildConfig0 = new fredboat.db.entity.GuildConfig();
    java.lang.String str1 = guildConfig0.getGuildId();
    boolean b2 = guildConfig0.isTrackAnnounce();
    boolean b3 = guildConfig0.isAutoResume();
    guildConfig0.setLang("DJ");
    guildConfig0.setLang("http://i.imgur.com/NqyOqnj.gif");
    java.lang.String str8 = guildConfig0.getLang();
    guildConfig0.setLang(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    guildConfig0.setAutoResume(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str8.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.lang.Long[] long_array7 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long8);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider11 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext12 = simpleTrackProvider11.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext13 = null;
    simpleTrackProvider11.setLastTrack(audioTrackContext13);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext15 = simpleTrackProvider11.getAsListOrdered();
    simpleTrackProvider0.addAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext15);
    int i17 = simpleTrackProvider0.size();
    int i18 = simpleTrackProvider0.streamsCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand8 = new fredboat.command.maintenance.PingCommand("\u274C", str_array6);
    fredboat.command.music.control.StopCommand stopCommand9 = new fredboat.command.music.control.StopCommand("\u274C", str_array6);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("\uD83D\uDEAA", str_array6);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand11 = new fredboat.command.fun.DanceCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "\uD83D\uDEAA", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand14 = new fredboat.command.music.control.JoinCommand("", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = joinCommand14.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = joinCommand14.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }

    fredboat.util.BrainfuckException brainfuckException4 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    fredboat.util.BrainfuckException brainfuckException5 = new fredboat.util.BrainfuckException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException4);
    fredboat.util.BrainfuckException brainfuckException6 = new fredboat.util.BrainfuckException("\u2705", (java.lang.Throwable)brainfuckException5);
    fredboat.commandmeta.MessagingException messagingException7 = new fredboat.commandmeta.MessagingException("fredboat.util.BrainfuckException: \uD83D\uDEAA", (java.lang.Throwable)brainfuckException5);
    java.lang.Throwable[] throwable_array8 = brainfuckException5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array8);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.fun.FacedeskCommand facedeskCommand12 = new fredboat.command.fun.FacedeskCommand("\uD83D\uDEAA", "\u274C", str_array8);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = facedeskCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand12 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("https://i.imgur.com/YqZuqEB.jpg", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand15 = new fredboat.command.util.CommandsCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.util.MathCommand mathCommand8 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("Bot Owner", str_array6);
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
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand11 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    java.util.List<java.lang.String> list_str12 = botRestartCommand11.aliases;
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand("en_US", str_array9);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params17 = fredboat.util.rest.Http.Params.of(str_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }

    fredboat.util.GitRepoState gitRepoState1 = new fredboat.util.GitRepoState("Provided by OpenWeatherMap.org");
    java.lang.String str2 = gitRepoState1.commitIdAbbrev;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand20 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array13);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("Bot Owner", str_array13);
    fredboat.command.fun.TextCommand textCommand22 = new fredboat.command.fun.TextCommand("\uD83D\uDCDD", "hi!", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand23 = new fredboat.command.music.seeking.RestartCommand("", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext24 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand23.onInvoke(commandContext24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.rateLimitReached = 10;
    blacklistEntry1.rateLimitReachedTimestamp = 1531609944902L;
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    long long7 = blacklistEntry1.getRateLimitReachedTimestamp();
    int i8 = blacklistEntry1.getRateLimitReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1531610072494L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1531609944902L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(10L);
    blacklistEntry1.setRateLimitReachedTimestamp(1531609939130L);
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    blacklistEntry1.id = 'a';
    blacklistEntry1.rateLimitReachedTimestamp = 0L;
    int i9 = blacklistEntry1.level;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 1531609939130L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("fredboat.util.BrainfuckException: \u2705", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    fredboat.agent.StatsAgent.Action action2 = null;
    statsAgent1.addAction(action2);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.start((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand10 = new fredboat.command.music.control.JoinCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand11 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = gitInfoCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand17 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = reshuffleCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("en_US", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("en_US", str_array10);
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
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array10);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.maintenance.NodesCommand nodesCommand13 = new fredboat.command.maintenance.NodesCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand16 = new fredboat.command.admin.SetAvatarCommand("Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.music.seeking.SeekCommand seekCommand17 = new fredboat.command.music.seeking.SeekCommand("fredboat.util.BrainfuckException: \uD83D\uDEAA", str_array10);
    fredboat.command.fun.RollCommand rollCommand18 = new fredboat.command.fun.RollCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", "Bot Admin", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = rollCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array15 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array15);
    fredboat.command.admin.BotRestartCommand botRestartCommand17 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand18 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array15);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand19 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array15);
    fredboat.command.util.WeatherCommand weatherCommand21 = new fredboat.command.util.WeatherCommand(weather1, "\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array15);
    fredboat.command.music.seeking.RewindCommand rewindCommand22 = new fredboat.command.music.seeking.RewindCommand("DJ", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand7 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.fun.PatCommand patCommand8 = new fredboat.command.fun.PatCommand("fredboat.util.BrainfuckException: \uD83D\uDEAA", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = patCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    int i1 = weatherSystemOpenWeather0.getSunset();
    weatherSystemOpenWeather0.setSunset((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    remoteFileCommand9.url = "";
    remoteFileCommand9.url = "https://i.imgur.com/YqZuqEB.jpg";
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
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand12 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("DJ", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str2 = weatherError1.getDataProviderIcon();
    boolean b3 = weatherError1.isError();
    java.lang.String str4 = weatherError1.getTemperature();
    java.lang.String str5 = weatherError1.getThumbnailUrl();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.PauseCommand pauseCommand9 = new fredboat.command.music.control.PauseCommand("", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = pauseCommand9.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand9.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }

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
    guildPermissions0.setId("\u2757");
    guildPermissions0.setId("Bot Owner");
    
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

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand19 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array13);
    fredboat.command.maintenance.GetIdCommand getIdCommand20 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.fun.RollCommand rollCommand22 = new fredboat.command.fun.RollCommand("DJ", "\u274C", str_array13);
    fredboat.command.music.seeking.ForwardCommand forwardCommand23 = new fredboat.command.music.seeking.ForwardCommand("\u2757", str_array13);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = forwardCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("Base");

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("en_US", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand18 = new fredboat.command.maintenance.AudioDebugCommand("DJ", str_array10);
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
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.moderation.LanguageCommand languageCommand8 = new fredboat.command.moderation.LanguageCommand("", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("Bot Admin", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = unpauseCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand7 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = shuffleCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = shuffleCommand8.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand8.onInvoke(commandContext11);
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
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand19 = new fredboat.command.music.seeking.ForwardCommand("\u274C", str_array12);
    fredboat.command.music.seeking.ForwardCommand forwardCommand20 = new fredboat.command.music.seeking.ForwardCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand21 = new fredboat.command.music.info.ListCommand("User", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = listCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }

    fredboat.util.rest.APILimitException aPILimitException2 = new fredboat.util.rest.APILimitException("en_US");
    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("en_US", (java.lang.Throwable)aPILimitException2);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand8 = new fredboat.command.maintenance.PingCommand("\u274C", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand9 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array6);
    fredboat.command.util.WeatherCommand weatherCommand10 = new fredboat.command.util.WeatherCommand(weather0, ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = getIdCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    java.lang.String str3 = openWeatherCurrent0.getName();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode4 = openWeatherCurrent0.errorType();
    int i5 = openWeatherCurrent0.getVisibility();
    java.lang.String str6 = openWeatherCurrent0.getFormattedDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    org.junit.Assert.assertTrue("'" + errorCode4 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode4.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str6.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.JoinCommand joinCommand14 = new fredboat.command.music.control.JoinCommand("fredboat.util.BrainfuckException: ", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }

    fredboat.util.BrainfuckException brainfuckException1 = new fredboat.util.BrainfuckException("fredboat.util.BrainfuckException: hi!");

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand10 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("Bot Admin", str_array6);
    fredboat.perms.PermissionLevel permissionLevel12 = destroyCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = destroyCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = destroyCommand11.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand11.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.ReviveCommand reviveCommand2 = new fredboat.command.admin.ReviveCommand("\u2705", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }

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
    fredboat.db.entity.GuildPermissions guildPermissions20 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions21 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str22 = guildPermissions21.getDjList();
    guildPermissions20.setUserList(list_str22);
    java.lang.String[] str_array28 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand29 = new fredboat.command.music.control.RepeatCommand("", str_array28);
    fredboat.command.music.control.LeaveCommand leaveCommand30 = new fredboat.command.music.control.LeaveCommand("hi!", str_array28);
    fredboat.perms.PermissionLevel permissionLevel31 = leaveCommand30.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel32 = leaveCommand30.getMinimumPerms();
    java.util.List<java.lang.String> list_str33 = guildPermissions20.getFromEnum(permissionLevel32);
    java.util.List<java.lang.String> list_str34 = guildPermissions20.getAdminList();
    fredboat.db.entity.GuildPermissions guildPermissions35 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions36 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str37 = guildPermissions36.getDjList();
    guildPermissions35.setUserList(list_str37);
    java.lang.String[] str_array43 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand44 = new fredboat.command.music.control.RepeatCommand("", str_array43);
    fredboat.command.music.control.LeaveCommand leaveCommand45 = new fredboat.command.music.control.LeaveCommand("hi!", str_array43);
    fredboat.perms.PermissionLevel permissionLevel46 = leaveCommand45.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel47 = leaveCommand45.getMinimumPerms();
    java.util.List<java.lang.String> list_str48 = guildPermissions35.getFromEnum(permissionLevel47);
    java.util.List<java.lang.String> list_str49 = guildPermissions35.getAdminList();
    guildPermissions20.setDjList(list_str49);
    fredboat.db.entity.GuildPermissions guildPermissions51 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions52 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str53 = guildPermissions52.getDjList();
    guildPermissions51.setUserList(list_str53);
    fredboat.db.entity.GuildPermissions guildPermissions55 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions56 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str57 = guildPermissions56.getDjList();
    guildPermissions55.setUserList(list_str57);
    java.lang.String[] str_array63 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand64 = new fredboat.command.music.control.RepeatCommand("", str_array63);
    fredboat.command.music.control.LeaveCommand leaveCommand65 = new fredboat.command.music.control.LeaveCommand("hi!", str_array63);
    fredboat.perms.PermissionLevel permissionLevel66 = leaveCommand65.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel67 = leaveCommand65.getMinimumPerms();
    java.util.List<java.lang.String> list_str68 = guildPermissions55.getFromEnum(permissionLevel67);
    java.util.List<java.lang.String> list_str69 = guildPermissions55.getAdminList();
    guildPermissions51.setDjList(list_str69);
    java.lang.String[] str_array80 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand81 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array80);
    fredboat.command.music.control.ShuffleCommand shuffleCommand82 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array80);
    fredboat.command.fun.TextCommand textCommand83 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array80);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand84 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array80);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand85 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array80);
    fredboat.command.music.control.UnpauseCommand unpauseCommand86 = new fredboat.command.music.control.UnpauseCommand("\uD83D\uDCDD", str_array80);
    fredboat.perms.PermissionLevel permissionLevel87 = unpauseCommand86.getMinimumPerms();
    java.util.List<java.lang.String> list_str88 = guildPermissions51.getFromEnum(permissionLevel87);
    guildPermissions20.setUserList(list_str88);
    guildPermissions0.setAdminList(list_str88);
    
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
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    org.junit.Assert.assertTrue("'" + permissionLevel31 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel31.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel32 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel32.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    org.junit.Assert.assertTrue("'" + permissionLevel46 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel46.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel47 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel47.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    org.junit.Assert.assertTrue("'" + permissionLevel66 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel66.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel67 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel67.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array80);
    org.junit.Assert.assertTrue("'" + permissionLevel87 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel87.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str88);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.AvatarCommand avatarCommand13 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand16 = new fredboat.command.fun.FacedeskCommand("\u2757", "fredboat.util.BrainfuckException: \uD83D\uDEAA", str_array10);
    fredboat.command.util.CommandsCommand commandsCommand17 = new fredboat.command.util.CommandsCommand("\uD83D\uDEAA", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = commandsCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }

    fredboat.audio.queue.PlaylistInfo.Source source4 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo5 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source4);
    fredboat.audio.queue.PlaylistInfo playlistInfo6 = new fredboat.audio.queue.PlaylistInfo(0, "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", source4);
    playlistInfo6.setTotalTracks((int)(byte)100);
    playlistInfo6.setTotalTracks(0);
    int i11 = playlistInfo6.getTotalTracks();
    org.junit.Assert.assertTrue("'" + source4 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source4.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = enableCommandsCommand13.getMinimumPerms();
    int i15 = permissionLevel14.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("\u274C", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("\u2757", str_array12);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather1, "\u274C", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array12);
    fredboat.perms.PermissionLevel permissionLevel22 = playSplitCommand21.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand21.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getCode();
    int i4 = openWeatherCurrent0.getDatetime();
    java.lang.String str5 = openWeatherCurrent0.getDataProviderString();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather6 = openWeatherCurrent0.getWeather();
    java.lang.String str7 = openWeatherCurrent0.getThumbnailUrl();
    java.lang.String str8 = openWeatherCurrent0.getLocation();
    java.lang.String str9 = openWeatherCurrent0.getFormattedDate();
    
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
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str9.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.maintenance.GetIdCommand getIdCommand9 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand("DJ", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = versionCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode1 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider0.setRepeatMode(repeatMode1);
    boolean b3 = simpleTrackProvider0.isEmpty();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext6 = simpleTrackProvider0.getTracksInRange((int)(byte)10, 10000);
    long long7 = simpleTrackProvider0.getDurationMillis();
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.reshuffle();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + repeatMode1 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode1.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 0L);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("Provided by OpenWeatherMap.org", str_array9);
    java.util.List<java.lang.String> list_str12 = nodeAdminCommand11.aliases;
    fredboat.perms.PermissionLevel permissionLevel13 = nodeAdminCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = nodeAdminCommand11.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand11.onInvoke(commandContext15);
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

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand11 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.perms.PermissionLevel permissionLevel12 = botRestartCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = botRestartCommand11.getMinimumPerms();
    java.lang.String str14 = permissionLevel13.getName();
    int i15 = permissionLevel13.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Bot Admin"+ "'", str14.equals("Bot Admin"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }

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

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.moderation.ConfigCommand configCommand16 = new fredboat.command.moderation.ConfigCommand("fredboat.util.BrainfuckException: ", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("\u2757", str_array10);
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
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("hi!", "fredboat.util.BrainfuckException: \u2705", str_array6);
    textCommand10.msg = "\uD83D\uDEAA";
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
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand17 = new fredboat.command.admin.ReviveCommand("", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("\u2757", "DJ", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array11);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = brainfuckCommand19.process("", context21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org");
    fredboat.agent.StatsAgent.Action action2 = null;
    statsAgent1.addAction(action2);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.start((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("");
    fredboat.db.entity.UConfig uConfig3 = uConfig1.setBearerExpiration((-1L));
    java.lang.String str4 = uConfig1.getBearer();
    fredboat.db.entity.UConfig uConfig6 = uConfig1.setUserId("qua, 31 dez 1969, 09:00 PM");
    fredboat.db.entity.UConfig uConfig8 = uConfig1.setBearerExpiration(1531609948276L);
    java.lang.String str9 = uConfig1.getBearer();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array10);
    fredboat.command.admin.BotRestartCommand botRestartCommand12 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array10);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = setAvatarCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("qua, 31 dez 1969, 09:00 PM");
    statsAgent1.run();
    statsAgent1.run();
    fredboat.agent.StatsAgent.Action action4 = null;
    statsAgent1.addAction(action4);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.start((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }

    fredboat.util.rest.Weather weather2 = null;
    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array10);
    fredboat.command.util.WeatherCommand weatherCommand14 = new fredboat.command.util.WeatherCommand(weather2, "Bot Admin", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("\uD83D\uDEAA", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("hi!");
    guildConfig1.setLang("\u2757");
    boolean b4 = guildConfig1.isAutoResume();
    guildConfig1.setTrackAnnounce(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    blacklistEntry1.setRateLimitReached(3000);
    long long7 = blacklistEntry1.getBlacklistedTimestamp();
    long long8 = blacklistEntry1.getId();
    long long9 = blacklistEntry1.getBlacklistedTimestamp();
    blacklistEntry1.setLevel(0);
    long long12 = blacklistEntry1.getRateLimitReachedTimestamp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1531610084700L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 1531610084700L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 100L);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.LeaveCommand leaveCommand2 = new fredboat.command.music.control.LeaveCommand("", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand16 = new fredboat.command.music.control.PlaySplitCommand("Provided by OpenWeatherMap.org", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = playSplitCommand16.getMinimumPerms();
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = playSplitCommand16.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("fredboat.util.BrainfuckException: hi!", 2, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    java.lang.String str10 = remoteFileCommand9.url;
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = remoteFileCommand9.help(context11);
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
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("\u274C", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = destroyCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.fun.RollCommand rollCommand7 = new fredboat.command.fun.RollCommand("hi!", "DJ", str_array5);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = rollCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setHumidity((int)(byte)100);
    int i5 = weatherMainOpenWeather0.getPressure();
    weatherMainOpenWeather0.setTempMax((double)10L);
    double d8 = weatherMainOpenWeather0.getTempMin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 10.0d);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.seeking.RestartCommand restartCommand17 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array11);
    fredboat.command.admin.EvalCommand evalCommand18 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand19 = new fredboat.command.fun.RemoteFileCommand("", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    java.lang.String str20 = remoteFileCommand19.url;
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = remoteFileCommand19.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array10);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array10);
    java.lang.String str13 = textCommand12.msg;
    java.lang.String str14 = textCommand12.msg;
    textCommand12.msg = "fredboat.util.BrainfuckException: ";
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str13.equals("qua, 31 dez 1969, 09:00 PM"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str14.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand15 = new fredboat.command.util.MathCommand("", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = mathCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.seeking.RestartCommand restartCommand8 = new fredboat.command.music.seeking.RestartCommand("", str_array5);
    fredboat.command.music.control.PauseCommand pauseCommand9 = new fredboat.command.music.control.PauseCommand("https://i.imgur.com/YqZuqEB.jpg", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = pauseCommand9.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel11 = pauseCommand9.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand9.onInvoke(commandContext12);
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
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }

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
    fredboat.perms.PermissionLevel permissionLevel25 = disableCommandsCommand24.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel26 = disableCommandsCommand24.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext27 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand24.onInvoke(commandContext27);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    org.junit.Assert.assertTrue("'" + permissionLevel25 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel25.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.BotRestartCommand botRestartCommand2 = new fredboat.command.admin.BotRestartCommand("hi!", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array10);
    fredboat.command.admin.TestCommand testCommand17 = new fredboat.command.admin.TestCommand("", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand18 = new fredboat.command.music.control.PauseCommand("qua, 31 dez 1969, 09:00 PM", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = pauseCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }

    fredboat.util.GitRepoState gitRepoState1 = new fredboat.util.GitRepoState("\uD83D\uDEAA");
    java.lang.String str2 = gitRepoState1.commitId;
    java.lang.String str3 = gitRepoState1.branch;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.music.control.LeaveCommand leaveCommand7 = new fredboat.command.music.control.LeaveCommand("hi!", str_array5);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("fredboat.util.BrainfuckException: hi!", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.NodesCommand nodesCommand9 = new fredboat.command.maintenance.NodesCommand("", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand10 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array6);
    fredboat.perms.PermissionLevel permissionLevel12 = setAvatarCommand11.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = setAvatarCommand11.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand11.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand8 = new fredboat.command.music.control.LeaveCommand("hi!", str_array6);
    fredboat.command.moderation.LanguageCommand languageCommand9 = new fredboat.command.moderation.LanguageCommand("DJ", str_array6);
    fredboat.command.admin.BotRestartCommand botRestartCommand10 = new fredboat.command.admin.BotRestartCommand("en_US", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = botRestartCommand10.getMinimumPerms();
    java.lang.String str12 = permissionLevel11.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Bot Admin"+ "'", str12.equals("Bot Admin"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.rateLimitReached = 10;
    int i4 = blacklistEntry1.level;
    blacklistEntry1.setRateLimitReachedTimestamp((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("\u2757", str_array12);
    fredboat.command.fun.RollCommand rollCommand21 = new fredboat.command.fun.RollCommand("", "Bot Owner", str_array12);
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
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand11 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("Bot Admin", str_array7);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand13 = new fredboat.command.fun.DanceCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather1 = openWeatherCurrent0.getSys();
    openWeatherCurrent0.setId((int)(short)1);
    java.lang.String str4 = openWeatherCurrent0.getThumbnailUrl();
    int i5 = openWeatherCurrent0.getVisibility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    blacklistEntry1.setBlacklistedTimestamp((long)(short)-1);
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    blacklistEntry1.setLevel((int)(byte)1);
    long long9 = blacklistEntry1.getBlacklistedTimestamp();
    int i10 = blacklistEntry1.level;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    fredboat.db.entity.UConfig uConfig5 = uConfig0.setBearer("");
    fredboat.db.entity.UConfig uConfig7 = uConfig5.setBearer("fredboat.util.rest.APILimitException: en_US");
    java.lang.String str8 = uConfig5.getRefresh();
    
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
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.music.seeking.RestartCommand restartCommand9 = new fredboat.command.music.seeking.RestartCommand("", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = shuffleCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.music.control.StopCommand stopCommand11 = new fredboat.command.music.control.StopCommand("hi!", str_array7);
    fredboat.command.fun.RandomImageCommand randomImageCommand12 = new fredboat.command.fun.RandomImageCommand("\u274C", "\uD83D\uDCDD", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = randomImageCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand8 = new fredboat.command.music.control.LeaveCommand("hi!", str_array6);
    fredboat.command.moderation.LanguageCommand languageCommand9 = new fredboat.command.moderation.LanguageCommand("DJ", str_array6);
    fredboat.command.maintenance.NodesCommand nodesCommand10 = new fredboat.command.maintenance.NodesCommand("hi!", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("hi!", 10000, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand16 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array11);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("\u274C", "fredboat.util.BrainfuckException: \u2705", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = textCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }

    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand0 = null;
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider1 = new fredboat.audio.queue.SimpleTrackProvider();
    simpleTrackProvider1.skipped();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext5 = simpleTrackProvider1.getTracksInRange(3000, 10);
    fredboat.audio.queue.AudioTrackContext audioTrackContext6 = simpleTrackProvider1.provideAudioTrack();
    fredboat.util.Tuple2<fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>,fredboat.audio.queue.ITrackProvider> tuple2_tuple2_weatherOpenWeather_languageCommand_iTrackProvider7 = new fredboat.util.Tuple2<fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>,fredboat.audio.queue.ITrackProvider>(tuple2_weatherOpenWeather_languageCommand0, (fredboat.audio.queue.ITrackProvider)simpleTrackProvider1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext6);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand11 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.fun.FacedeskCommand facedeskCommand12 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array8);
    fredboat.command.moderation.ConfigCommand configCommand13 = new fredboat.command.moderation.ConfigCommand("Base", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.admin.BotRestartCommand botRestartCommand5 = new fredboat.command.admin.BotRestartCommand("\u2705", str_array4);
    fredboat.perms.PermissionLevel permissionLevel6 = botRestartCommand5.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel7 = botRestartCommand5.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = botRestartCommand5.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand5.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel6 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel6.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand9 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array8);
    java.lang.String str10 = rollCommand9.getRandomImageUrl();
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = rollCommand9.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str10.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array3);
    fredboat.command.moderation.LanguageCommand languageCommand5 = new fredboat.command.moderation.LanguageCommand("", str_array3);
    fredboat.commandmeta.abs.CommandContext commandContext6 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand5.onInvoke(commandContext6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }

    fredboat.util.GitRepoState gitRepoState0 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str1 = gitRepoState0.commitMessageShort;
    java.lang.String str2 = gitRepoState0.commitUserName;
    java.lang.String str3 = gitRepoState0.commitMessageFull;
    java.lang.String str4 = gitRepoState0.commitTime;
    java.lang.String str5 = gitRepoState0.commitUserName;
    java.lang.String str6 = gitRepoState0.commitUserEmail;
    java.lang.String str7 = gitRepoState0.commitMessageFull;
    java.lang.String str8 = gitRepoState0.commitMessageFull;
    
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
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("en_US");
    fredboat.agent.StatsAgent.Action action2 = null;
    statsAgent1.addAction(action2);
    fredboat.agent.StatsAgent.Action action4 = null;
    statsAgent1.addAction(action4);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.start((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    int i1 = weatherSystemOpenWeather0.getType();
    int i2 = weatherSystemOpenWeather0.getSunrise();
    int i3 = weatherSystemOpenWeather0.getSunrise();
    java.lang.String str4 = weatherSystemOpenWeather0.getCountry();
    java.lang.String str5 = weatherSystemOpenWeather0.getCountry();
    weatherSystemOpenWeather0.setId((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }

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
    java.lang.String[] str_array27 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand28 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array27);
    fredboat.command.maintenance.PingCommand pingCommand29 = new fredboat.command.maintenance.PingCommand("\u274C", str_array27);
    fredboat.command.music.control.DestroyCommand destroyCommand30 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array27);
    fredboat.command.music.control.DestroyCommand destroyCommand31 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array27);
    fredboat.command.admin.UpdateCommand updateCommand32 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array27);
    fredboat.perms.PermissionLevel permissionLevel33 = updateCommand32.getMinimumPerms();
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str34 = guildPermissions0.getFromEnum(permissionLevel33);
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
    org.junit.Assert.assertNotNull(str_array27);
    org.junit.Assert.assertTrue("'" + permissionLevel33 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel33.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    openWeatherCurrent0.setId(0);
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather6 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode7 = openWeatherCurrent0.errorType();
    java.lang.String str8 = openWeatherCurrent0.getThumbnailUrl();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str2.equals("Provided by OpenWeatherMap.org"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloudsOpenWeather6);
    org.junit.Assert.assertTrue("'" + errorCode7 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode7.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.util.MathCommand mathCommand16 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array14);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("", str_array14);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("hi!", str_array14);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand19 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array14);
    fredboat.command.music.control.RepeatCommand repeatCommand20 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand21 = new fredboat.command.music.seeking.RestartCommand("Bot Admin", str_array14);
    fredboat.command.music.seeking.RestartCommand restartCommand22 = new fredboat.command.music.seeking.RestartCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array14);
    fredboat.command.fun.HugCommand hugCommand23 = new fredboat.command.fun.HugCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "https://i.imgur.com/YqZuqEB.jpg", str_array14);
    fredboat.command.fun.TextCommand textCommand24 = new fredboat.command.fun.TextCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", "fredboat.util.BrainfuckException: \u2705", str_array14);
    fredboat.messaging.internal.Context context25 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str26 = textCommand24.help(context25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = unblacklistCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = unblacklistCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = unblacklistCommand15.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.maintenance.PingCommand pingCommand9 = new fredboat.command.maintenance.PingCommand("\u274C", str_array7);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array7);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array7);
    fredboat.command.admin.UpdateCommand updateCommand12 = new fredboat.command.admin.UpdateCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.command.maintenance.PingCommand pingCommand13 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("");
    java.lang.String str2 = guildConfig1.getLang();
    java.lang.String str3 = guildConfig1.getLang();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "en_US"+ "'", str2.equals("en_US"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "en_US"+ "'", str3.equals("en_US"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    boolean b1 = openWeatherCurrent0.isError();
    int i2 = openWeatherCurrent0.getId();
    java.lang.String str3 = openWeatherCurrent0.getThumbnailUrl();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather4 = openWeatherCurrent0.getMain();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather4);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand16 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("Provided by OpenWeatherMap.org", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand18 = new fredboat.command.fun.CatgirlCommand("Bot Admin", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\u2705", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.util.MathCommand mathCommand7 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand8 = new fredboat.command.music.control.UnpauseCommand("", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.PauseCommand pauseCommand14 = new fredboat.command.music.control.PauseCommand("", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }

    // The following exception was thrown during execution in test generation
    try {
    java.io.File file1 = fredboat.util.rest.CacheUtil.getImageFromURL("\u274C");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }

    fredboat.db.entity.GuildConfig guildConfig0 = new fredboat.db.entity.GuildConfig();
    java.lang.String str1 = guildConfig0.getGuildId();
    java.lang.String str2 = guildConfig0.getGuildId();
    guildConfig0.setTrackAnnounce(false);
    boolean b5 = guildConfig0.isTrackAnnounce();
    java.lang.String str6 = guildConfig0.getLang();
    guildConfig0.setAutoResume(true);
    guildConfig0.setAutoResume(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "en_US"+ "'", str6.equals("en_US"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("en_US", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand18 = new fredboat.command.music.control.UnpauseCommand("https://i.imgur.com/YqZuqEB.jpg", str_array11);
    fredboat.command.music.info.ListCommand listCommand19 = new fredboat.command.music.info.ListCommand("\u2757", str_array11);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("en_US", str_array11);
    fredboat.perms.PermissionLevel permissionLevel21 = stopCommand20.getMinimumPerms();
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = stopCommand20.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel21 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel21.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("Bot Admin", str_array8);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("Bot Admin", "", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = patCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(10L);
    blacklistEntry1.setRateLimitReachedTimestamp(1531609939130L);
    int i4 = blacklistEntry1.getRateLimitReached();
    long long5 = blacklistEntry1.getRateLimitReachedTimestamp();
    int i6 = blacklistEntry1.rateLimitReached;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 1531609939130L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array8);
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
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext1);
    fredboat.audio.queue.AudioTrackContext audioTrackContext3 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext3);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.audio.queue.AudioTrackContext audioTrackContext6 = simpleTrackProvider0.getTrack((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.seeking.RewindCommand rewindCommand17 = new fredboat.command.music.seeking.RewindCommand("", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("\u2705", str_array12);
    fredboat.command.fun.FacedeskCommand facedeskCommand19 = new fredboat.command.fun.FacedeskCommand("", "fredboat.util.BrainfuckException: \u2705", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand20 = new fredboat.command.moderation.ConfigCommand("", str_array12);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = configCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand("fredboat.util.BrainfuckException: \u2705", str_array6);
    fredboat.command.maintenance.GetIdCommand getIdCommand11 = new fredboat.command.maintenance.GetIdCommand("https://i.imgur.com/YqZuqEB.jpg", str_array6);
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
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("");
    fredboat.db.entity.UConfig uConfig3 = uConfig1.setBearerExpiration((-1L));
    java.lang.String str4 = uConfig3.getUserId();
    fredboat.db.entity.UConfig uConfig6 = uConfig3.setRefresh("fredboat.util.BrainfuckException: \uD83D\uDEAA");
    uConfig6.setId("https://i.imgur.com/YqZuqEB.jpg");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.seeking.RestartCommand restartCommand8 = new fredboat.command.music.seeking.RestartCommand("", str_array5);
    fredboat.command.music.control.PauseCommand pauseCommand9 = new fredboat.command.music.control.PauseCommand("https://i.imgur.com/YqZuqEB.jpg", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = pauseCommand9.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel11 = pauseCommand9.getMinimumPerms();
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = pauseCommand9.help(context12);
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
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }

    java.lang.String[] str_array2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.HugCommand hugCommand3 = new fredboat.command.fun.HugCommand("fredboat.util.BrainfuckException: \uD83D\uDEAA", "\uD83D\uDCDD", str_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }

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
    int i14 = permissionLevel12.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand18 = new fredboat.command.admin.ExitCommand("\u274C", str_array12);
    fredboat.command.maintenance.PingCommand pingCommand19 = new fredboat.command.maintenance.PingCommand("\u2757", str_array12);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather1, "\u274C", str_array12);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand21 = new fredboat.command.music.control.PlaySplitCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array12);
    fredboat.perms.PermissionLevel permissionLevel22 = playSplitCommand21.getMinimumPerms();
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = playSplitCommand21.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }

    fredboat.util.GitRepoState gitRepoState0 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str1 = gitRepoState0.commitMessageShort;
    java.lang.String str2 = gitRepoState0.commitUserName;
    java.lang.String str3 = gitRepoState0.commitMessageFull;
    java.lang.String str4 = gitRepoState0.commitMessageShort;
    java.lang.String str5 = gitRepoState0.commitUserEmail;
    
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
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("en_US", (int)(short)100, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    java.lang.String str1 = weatherOpenWeather0.getDescription();
    java.lang.String str2 = weatherOpenWeather0.getMain();
    java.lang.String str3 = weatherOpenWeather0.getIcon();
    java.lang.String str4 = weatherOpenWeather0.getMain();
    weatherOpenWeather0.setId((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("en_US", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand("en_US", str_array10);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = brainfuckCommand18.process("Base", context20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("");
    fredboat.db.entity.UConfig uConfig3 = uConfig1.setBearerExpiration((-1L));
    java.lang.String str4 = uConfig1.getBearer();
    fredboat.db.entity.UConfig uConfig6 = uConfig1.setBearerExpiration(1531609958568L);
    java.lang.String str7 = uConfig6.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array14);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array14);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.util.MathCommand mathCommand19 = new fredboat.command.util.MathCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand20 = new fredboat.command.util.WeatherCommand(weather0, "\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array14);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = weatherCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    java.lang.String str4 = openWeatherCurrent0.getFormattedDate();
    int i5 = openWeatherCurrent0.getDatetime();
    java.lang.String str6 = openWeatherCurrent0.getDataProviderIcon();
    java.lang.String str7 = openWeatherCurrent0.getName();
    java.lang.String str8 = openWeatherCurrent0.getFormattedDate();
    
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
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "https://i.imgur.com/YqZuqEB.jpg"+ "'", str6.equals("https://i.imgur.com/YqZuqEB.jpg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str8.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array13);
    fredboat.command.admin.BotRestartCommand botRestartCommand15 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array13);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand17 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.util.MathCommand mathCommand18 = new fredboat.command.util.MathCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.admin.ReviveCommand reviveCommand19 = new fredboat.command.admin.ReviveCommand("fredboat.util.BrainfuckException: \u2705", str_array13);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = reviveCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }

    fredboat.audio.queue.PlaylistInfo.Source source2 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo3 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source2);
    playlistInfo3.setTotalTracks((int)(short)0);
    playlistInfo3.setTotalTracks(97);
    java.lang.String str8 = playlistInfo3.getName();
    org.junit.Assert.assertTrue("'" + source2 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source2.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\u2757"+ "'", str8.equals("\u2757"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }

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
    java.util.List<java.lang.String> list_str21 = joinCommand19.aliases;
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand19.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.USER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand10 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.fun.FacedeskCommand facedeskCommand11 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array7);
    java.io.File file12 = facedeskCommand11.getRandomFile();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand11.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file12);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("DJ");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.startNow((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.admin.UpdateCommand updateCommand8 = new fredboat.command.admin.UpdateCommand("", str_array6);
    fredboat.command.fun.CatgirlCommand catgirlCommand9 = new fredboat.command.fun.CatgirlCommand("Bot Admin", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("fredboat.util.BrainfuckException: hi!", str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand13 = new fredboat.command.maintenance.AudioDebugCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = audioDebugCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.admin.BotRestartCommand botRestartCommand5 = new fredboat.command.admin.BotRestartCommand("\u2705", str_array4);
    fredboat.perms.PermissionLevel permissionLevel6 = botRestartCommand5.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel7 = botRestartCommand5.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand5.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel6 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel6.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.PlaySplitCommand playSplitCommand2 = new fredboat.command.music.control.PlaySplitCommand("", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }

    fredboat.util.GitRepoState gitRepoState1 = new fredboat.util.GitRepoState("en_US");

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }

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
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("", (int)(byte)10, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("Bot Admin");
    guildConfig1.setId("\uD83D\uDEAA");

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand11 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("Bot Admin", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand14 = new fredboat.command.music.seeking.ForwardCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array10);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("https://i.imgur.com/YqZuqEB.jpg", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand18 = new fredboat.command.moderation.LanguageCommand("\u2705", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand17 = new fredboat.command.util.ServerInfoCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
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
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array13);
    fredboat.command.fun.HugCommand hugCommand20 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array13);
    fredboat.command.admin.EvalCommand evalCommand21 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array13);
    fredboat.command.maintenance.VersionCommand versionCommand22 = new fredboat.command.maintenance.VersionCommand("\u2705", str_array13);
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = versionCommand22.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext29 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand26.onInvoke(commandContext29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\u2705", str_array10);
    fredboat.command.maintenance.PingCommand pingCommand17 = new fredboat.command.maintenance.PingCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.rateLimitReached = 10;
    blacklistEntry1.rateLimitReachedTimestamp = 1531609944902L;
    blacklistEntry1.setRateLimitReached((-1));
    long long8 = blacklistEntry1.id;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1L);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand12 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("\u2705", "\u274C", str_array8);
    java.lang.String str14 = remoteFileCommand13.url;
    java.lang.String str15 = remoteFileCommand13.url;
    remoteFileCommand13.url = "";
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = remoteFileCommand13.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "\u2705"+ "'", str14.equals("\u2705"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\u2705"+ "'", str15.equals("\u2705"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    int i3 = openWeatherCurrent0.getVisibility();
    openWeatherCurrent0.setId(10000);
    openWeatherCurrent0.setId((int)(short)0);
    java.lang.String str8 = openWeatherCurrent0.getDataProviderString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Provided by OpenWeatherMap.org"+ "'", str8.equals("Provided by OpenWeatherMap.org"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand17 = new fredboat.command.admin.ReviveCommand("", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("\u2757", "DJ", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand19 = new fredboat.command.fun.CatgirlCommand("fredboat.util.BrainfuckException: ", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand2 = new fredboat.command.admin.NodeAdminCommand("qua, 31 dez 1969, 09:00 PM", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }

    java.lang.String[] str_array15 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array15);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array15);
    fredboat.command.fun.TextCommand textCommand18 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array15);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand20 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array15);
    fredboat.command.moderation.ConfigCommand configCommand21 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array15);
    fredboat.command.fun.HugCommand hugCommand22 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array15);
    fredboat.command.admin.EvalCommand evalCommand23 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array15);
    fredboat.command.maintenance.VersionCommand versionCommand24 = new fredboat.command.maintenance.VersionCommand("\u2705", str_array15);
    fredboat.command.fun.FacedeskCommand facedeskCommand25 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: \u2705", "http://i.imgur.com/NqyOqnj.gif", str_array15);
    fredboat.commandmeta.abs.CommandContext commandContext26 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand25.onInvoke(commandContext26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array8);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.music.seeking.SeekCommand seekCommand13 = new fredboat.command.music.seeking.SeekCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
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
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand12 = new fredboat.command.music.control.JoinCommand("\u2705", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = joinCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = joinCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = joinCommand12.help(context15);
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
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand8 = new fredboat.command.music.control.LeaveCommand("hi!", str_array6);
    fredboat.command.moderation.LanguageCommand languageCommand9 = new fredboat.command.moderation.LanguageCommand("DJ", str_array6);
    fredboat.command.admin.BotRestartCommand botRestartCommand10 = new fredboat.command.admin.BotRestartCommand("en_US", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = botRestartCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand10.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }

    fredboat.util.rest.APILimitException aPILimitException1 = new fredboat.util.rest.APILimitException("qua, 31 dez 1969, 09:00 PM");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException2 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)aPILimitException1);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    int i1 = weatherSystemOpenWeather0.getSunset();
    java.lang.String str2 = weatherSystemOpenWeather0.getCountry();
    weatherSystemOpenWeather0.setSunset((int)(short)0);
    weatherSystemOpenWeather0.setType(3000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.lang.Long[] long_array7 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long8 = new java.util.ArrayList<java.lang.Long>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long8, long_array7);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long8);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext13 = simpleTrackProvider0.getTracksInRange(5, (int)(byte)100);
    int i14 = simpleTrackProvider0.size();
    fredboat.audio.queue.AudioTrackContext audioTrackContext15 = simpleTrackProvider0.peek();
    fredboat.audio.queue.AudioTrackContext audioTrackContext16 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext16);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider18 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext19 = simpleTrackProvider18.provideAudioTrack();
    int i20 = simpleTrackProvider18.size();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider21 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode22 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider21.setRepeatMode(repeatMode22);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider24 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext25 = simpleTrackProvider24.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext26 = null;
    simpleTrackProvider24.setLastTrack(audioTrackContext26);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext28 = simpleTrackProvider24.getAsListOrdered();
    simpleTrackProvider21.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext28);
    fredboat.audio.queue.AudioTrackContext audioTrackContext30 = null;
    boolean b31 = simpleTrackProvider21.remove(audioTrackContext30);
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider33 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext34 = simpleTrackProvider33.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext35 = null;
    simpleTrackProvider33.setLastTrack(audioTrackContext35);
    java.lang.Long[] long_array40 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long41 = new java.util.ArrayList<java.lang.Long>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long41, long_array40);
    simpleTrackProvider33.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long41);
    java.lang.String[] str_array48 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand49 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array48);
    fredboat.command.admin.ExitCommand exitCommand50 = new fredboat.command.admin.ExitCommand("hi!", str_array48);
    java.util.List<java.lang.String> list_str51 = exitCommand50.aliases;
    fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand> tuple2_arraylist_long_exitCommand52 = new fredboat.util.Tuple2<java.util.ArrayList<java.lang.Long>,fredboat.command.admin.ExitCommand>(arraylist_long41, exitCommand50);
    boolean b53 = simpleTrackProvider21.isUserTrackOwner(1531609933098L, (java.util.Collection<java.lang.Long>)arraylist_long41);
    long long54 = simpleTrackProvider21.getDurationMillis();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider55 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext56 = null;
    simpleTrackProvider55.setLastTrack(audioTrackContext56);
    int i58 = simpleTrackProvider55.size();
    fredboat.audio.queue.AudioTrackContext audioTrackContext59 = simpleTrackProvider55.peek();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider60 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext61 = simpleTrackProvider60.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext62 = null;
    simpleTrackProvider60.setLastTrack(audioTrackContext62);
    java.lang.Long[] long_array67 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long68 = new java.util.ArrayList<java.lang.Long>();
    boolean b69 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long68, long_array67);
    simpleTrackProvider60.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long68);
    simpleTrackProvider55.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long68);
    simpleTrackProvider21.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long68);
    simpleTrackProvider18.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long68);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long68);
    fredboat.audio.queue.RepeatMode repeatMode75 = simpleTrackProvider0.getRepeatMode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    org.junit.Assert.assertTrue("'" + repeatMode22 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode22.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long54 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    org.junit.Assert.assertTrue("'" + repeatMode75 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode75.equals(fredboat.audio.queue.RepeatMode.OFF));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setHumidity((int)(byte)100);
    int i5 = weatherMainOpenWeather0.getPressure();
    weatherMainOpenWeather0.setTempMax((double)10L);
    double d8 = weatherMainOpenWeather0.getTemp();
    int i9 = weatherMainOpenWeather0.getPressure();
    int i10 = weatherMainOpenWeather0.getPressure();
    int i11 = weatherMainOpenWeather0.getHumidity();
    weatherMainOpenWeather0.setTempMax((double)1531609955167L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.admin.BotRestartCommand botRestartCommand5 = new fredboat.command.admin.BotRestartCommand("\u2705", str_array4);
    fredboat.perms.PermissionLevel permissionLevel6 = botRestartCommand5.getMinimumPerms();
    fredboat.messaging.internal.Context context7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = botRestartCommand5.help(context7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel6 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel6.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.util.MathCommand mathCommand8 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.fun.HugCommand hugCommand9 = new fredboat.command.fun.HugCommand("\uD83D\uDCDD", "qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = hugCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.music.info.HistoryCommand historyCommand18 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("en_US", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("fredboat.util.BrainfuckException: ", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand21 = new fredboat.command.admin.UnblacklistCommand("", str_array12);
    fredboat.perms.PermissionLevel permissionLevel22 = unblacklistCommand21.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    java.lang.String str1 = weatherOpenWeather0.getDescription();
    java.lang.String str2 = weatherOpenWeather0.getMain();
    java.lang.String str3 = weatherOpenWeather0.getIcon();
    int i4 = weatherOpenWeather0.getId();
    weatherOpenWeather0.setId(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("\u274C", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array10);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("User", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = seekCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand11 = new fredboat.command.moderation.DisableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.SeekCommand seekCommand12 = new fredboat.command.music.seeking.SeekCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = seekCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }

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
    simpleTrackProvider0.setLastTrack(audioTrackContext9);
    int i11 = simpleTrackProvider0.size();
    fredboat.audio.queue.RepeatMode repeatMode12 = simpleTrackProvider0.getRepeatMode();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider14 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext15 = null;
    simpleTrackProvider14.setLastTrack(audioTrackContext15);
    int i17 = simpleTrackProvider14.size();
    fredboat.audio.queue.AudioTrackContext audioTrackContext18 = simpleTrackProvider14.peek();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider19 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext20 = simpleTrackProvider19.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext21 = null;
    simpleTrackProvider19.setLastTrack(audioTrackContext21);
    java.lang.Long[] long_array26 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long27 = new java.util.ArrayList<java.lang.Long>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long27, long_array26);
    simpleTrackProvider19.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long27);
    simpleTrackProvider14.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long27);
    boolean b31 = simpleTrackProvider0.isUserTrackOwner(5L, (java.util.Collection<java.lang.Long>)arraylist_long27);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.audio.queue.AudioTrackContext audioTrackContext33 = simpleTrackProvider0.getTrack((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + repeatMode1 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode1.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    org.junit.Assert.assertTrue("'" + repeatMode12 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode12.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }

    java.lang.String[] str_array8 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand9 = new fredboat.command.fun.HugCommand("", "\u274C", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand10 = new fredboat.command.admin.ReviveCommand("Bot Admin", str_array8);
    fredboat.perms.PermissionLevel permissionLevel11 = reviveCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = reviveCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand10.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array10);
    fredboat.command.fun.CatgirlCommand catgirlCommand17 = new fredboat.command.fun.CatgirlCommand("", str_array10);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("\uD83D\uDEAA", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.command.admin.EvalCommand evalCommand16 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = evalCommand16.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand16.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather1 = openWeatherCurrent0.getSys();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderIcon();
    java.lang.String str3 = openWeatherCurrent0.getFormattedDate();
    int i4 = openWeatherCurrent0.getVisibility();
    java.lang.String str5 = openWeatherCurrent0.getWeatherDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "https://i.imgur.com/YqZuqEB.jpg"+ "'", str2.equals("https://i.imgur.com/YqZuqEB.jpg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str3.equals("qua, 31 dez 1969, 09:00 PM"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }

    fredboat.db.entity.GuildConfig guildConfig0 = new fredboat.db.entity.GuildConfig();
    java.lang.String str1 = guildConfig0.getGuildId();
    boolean b2 = guildConfig0.isTrackAnnounce();
    boolean b3 = guildConfig0.isAutoResume();
    guildConfig0.setLang("DJ");
    guildConfig0.setLang("http://i.imgur.com/NqyOqnj.gif");
    guildConfig0.setAutoResume(false);
    boolean b10 = guildConfig0.isAutoResume();
    guildConfig0.setTrackAnnounce(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array8);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand14 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.perms.PermissionLevel permissionLevel15 = playSplitCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }

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
    java.lang.String str19 = gitRepoState17.commitMessageFull;
    
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
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("en_US", str_array10);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = seekCommand18.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand18.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand13 = new fredboat.command.music.control.JoinCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("fredboat.util.BrainfuckException: ", str_array9);
    fredboat.command.music.seeking.SeekCommand seekCommand15 = new fredboat.command.music.seeking.SeekCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("fredboat.util.BrainfuckException: \u2705", "", str_array9);
    textCommand16.msg = "http://i.imgur.com/NqyOqnj.gif";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand13 = new fredboat.command.maintenance.AudioDebugCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext1);
    fredboat.audio.queue.AudioTrackContext audioTrackContext3 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext3);
    boolean b5 = simpleTrackProvider0.isEmpty();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider6 = new fredboat.audio.queue.SimpleTrackProvider();
    simpleTrackProvider6.skipped();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext8 = simpleTrackProvider6.getAsListOrdered();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext9 = simpleTrackProvider6.getAsList();
    simpleTrackProvider0.removeAll((java.util.Collection<fredboat.audio.queue.AudioTrackContext>)list_audioTrackContext9);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext11 = simpleTrackProvider0.getAsListOrdered();
    int i12 = simpleTrackProvider0.streamsCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand17 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = restartCommand17.getMinimumPerms();
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = restartCommand17.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }

    fredboat.util.rest.APILimitException aPILimitException1 = new fredboat.util.rest.APILimitException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...");

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }

    fredboat.util.BrainfuckException brainfuckException2 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException2);
    java.lang.Throwable[] throwable_array4 = brainfuckException3.getSuppressed();
    fredboat.util.BrainfuckException brainfuckException6 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array7 = brainfuckException6.getSuppressed();
    brainfuckException3.addSuppressed((java.lang.Throwable)brainfuckException6);
    fredboat.util.BrainfuckException brainfuckException13 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException14 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException13);
    fredboat.util.BrainfuckException brainfuckException15 = new fredboat.util.BrainfuckException("\uD83D\uDEAA", (java.lang.Throwable)brainfuckException13);
    fredboat.commandmeta.MessagingException messagingException16 = new fredboat.commandmeta.MessagingException("", (java.lang.Throwable)brainfuckException15);
    brainfuckException3.addSuppressed((java.lang.Throwable)brainfuckException15);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException18 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)brainfuckException15);
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
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.util.MathCommand mathCommand14 = new fredboat.command.util.MathCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    mathCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand10 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("Bot Admin", str_array6);
    fredboat.perms.PermissionLevel permissionLevel12 = destroyCommand11.getMinimumPerms();
    int i13 = permissionLevel12.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather4 = openWeatherCurrent0.getWeather();
    int i5 = openWeatherCurrent0.getId();
    openWeatherCurrent0.setId(2);
    int i8 = openWeatherCurrent0.getDatetime();
    int i9 = openWeatherCurrent0.getVisibility();
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }

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
    fredboat.db.entity.GuildPermissions guildPermissions16 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str17 = guildPermissions16.getDjList();
    guildPermissions15.setUserList(list_str17);
    java.lang.String[] str_array23 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand24 = new fredboat.command.music.control.RepeatCommand("", str_array23);
    fredboat.command.music.control.LeaveCommand leaveCommand25 = new fredboat.command.music.control.LeaveCommand("hi!", str_array23);
    fredboat.perms.PermissionLevel permissionLevel26 = leaveCommand25.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel27 = leaveCommand25.getMinimumPerms();
    java.util.List<java.lang.String> list_str28 = guildPermissions15.getFromEnum(permissionLevel27);
    java.util.List<java.lang.String> list_str29 = guildPermissions15.getAdminList();
    guildPermissions0.setDjList(list_str29);
    fredboat.db.entity.GuildPermissions guildPermissions31 = new fredboat.db.entity.GuildPermissions();
    java.lang.String[] str_array35 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand36 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array35);
    fredboat.command.music.info.ListCommand listCommand37 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array35);
    java.util.List<java.lang.String> list_str38 = listCommand37.aliases;
    guildPermissions31.setDjList(list_str38);
    guildPermissions0.setUserList(list_str38);
    java.lang.String[] str_array48 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand49 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array48);
    fredboat.command.music.info.ListCommand listCommand50 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array48);
    fredboat.command.maintenance.NodesCommand nodesCommand51 = new fredboat.command.maintenance.NodesCommand("", str_array48);
    fredboat.command.music.control.LeaveCommand leaveCommand52 = new fredboat.command.music.control.LeaveCommand("Bot Owner", str_array48);
    fredboat.command.util.CommandsCommand commandsCommand53 = new fredboat.command.util.CommandsCommand("fredboat.util.BrainfuckException: \u2705", str_array48);
    fredboat.command.music.control.LeaveCommand leaveCommand54 = new fredboat.command.music.control.LeaveCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array48);
    fredboat.perms.PermissionLevel permissionLevel55 = leaveCommand54.getMinimumPerms();
    java.lang.String[] str_array65 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand66 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array65);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand67 = new fredboat.command.admin.NodeAdminCommand("Provided by OpenWeatherMap.org", str_array65);
    java.util.List<java.lang.String> list_str68 = nodeAdminCommand67.aliases;
    guildPermissions0.setFromEnum(permissionLevel55, list_str68);
    
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
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    org.junit.Assert.assertTrue("'" + permissionLevel26 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel26.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel27 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel27.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    org.junit.Assert.assertTrue("'" + permissionLevel55 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel55.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str68);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array9);
    fredboat.command.util.CommandsCommand commandsCommand15 = new fredboat.command.util.CommandsCommand("Bot Owner", str_array9);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("\u2757", str_array9);
    fredboat.command.music.control.StopCommand stopCommand17 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: ", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.music.control.DestroyCommand destroyCommand17 = new fredboat.command.music.control.DestroyCommand("qua, 31 dez 1969, 09:00 PM", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = destroyCommand17.getMinimumPerms();
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = destroyCommand17.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "Bot Admin", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = nodeAdminCommand14.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel16 = nodeAdminCommand14.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand14.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("Provided by OpenWeatherMap.org", str_array9);
    java.util.List<java.lang.String> list_str12 = nodeAdminCommand11.aliases;
    fredboat.perms.PermissionLevel permissionLevel13 = nodeAdminCommand11.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = nodeAdminCommand11.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str12);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.music.control.JoinCommand joinCommand15 = new fredboat.command.music.control.JoinCommand("\u2705", str_array10);
    fredboat.command.fun.HugCommand hugCommand16 = new fredboat.command.fun.HugCommand("Base", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.music.control.PauseCommand pauseCommand12 = new fredboat.command.music.control.PauseCommand("", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand13 = new fredboat.command.admin.ReviveCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("fredboat.util.BrainfuckException: \uD83D\uDEAA", str_array8);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("Bot Owner", str_array8);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = unblacklistCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    java.lang.String str4 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig6 = uConfig0.setRefresh("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org");
    fredboat.db.entity.UConfig uConfig8 = uConfig6.setRefresh("en_US");
    fredboat.db.entity.UConfig uConfig10 = uConfig6.setBearerExpiration(1531609984375L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\u2705"+ "'", str4.equals("\u2705"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig10);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand16 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array11);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array11);
    java.io.File file19 = hugCommand18.getRandomFile();
    java.io.File file20 = hugCommand18.getRandomFile();
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand18.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(file20);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.music.control.PauseCommand pauseCommand12 = new fredboat.command.music.control.PauseCommand("", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand13 = new fredboat.command.admin.ReviveCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.fun.CatgirlCommand catgirlCommand14 = new fredboat.command.fun.CatgirlCommand("fredboat.util.BrainfuckException: \uD83D\uDEAA", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand15 = new fredboat.command.moderation.DisableCommandsCommand("fredboat.util.rest.APILimitException: en_US", str_array8);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = disableCommandsCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("", str_array4);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array4);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params7 = fredboat.util.rest.Http.Params.of(str_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    simpleTrackProvider0.skipped();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext4 = simpleTrackProvider0.getTracksInRange(3000, 10);
    boolean b5 = simpleTrackProvider0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array9);
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("\uD83D\uDEAA", "qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("DJ", str_array9);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand16 = new fredboat.command.fun.DanceCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setTempMax((double)0);
    double d5 = weatherMainOpenWeather0.getTempMax();
    int i6 = weatherMainOpenWeather0.getHumidity();
    weatherMainOpenWeather0.setTemp((double)0);
    weatherMainOpenWeather0.setPressure(100);
    double d11 = weatherMainOpenWeather0.getTempMin();
    weatherMainOpenWeather0.setTempMax(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 10.0d);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }

    fredboat.util.rest.Weather weather6 = null;
    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array14);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather6, "Bot Admin", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand19 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array14);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand20 = new fredboat.command.admin.SetAvatarCommand("\u2757", str_array14);
    fredboat.command.music.control.StopCommand stopCommand21 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: ", str_array14);
    fredboat.command.fun.PatCommand patCommand22 = new fredboat.command.fun.PatCommand("https://i.imgur.com/YqZuqEB.jpg", "", str_array14);
    fredboat.command.music.info.HistoryCommand historyCommand23 = new fredboat.command.music.info.HistoryCommand("User", str_array14);
    fredboat.messaging.internal.Context context24 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = historyCommand23.help(context24);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    int i1 = weatherSystemOpenWeather0.getType();
    int i2 = weatherSystemOpenWeather0.getSunrise();
    int i3 = weatherSystemOpenWeather0.getSunrise();
    weatherSystemOpenWeather0.setCountry("");
    weatherSystemOpenWeather0.setSunrise(100);
    java.lang.String str8 = weatherSystemOpenWeather0.getCountry();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.seeking.RestartCommand restartCommand8 = new fredboat.command.music.seeking.RestartCommand("", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = shuffleCommand9.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel11 = shuffleCommand9.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = shuffleCommand9.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand9.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.music.control.StopCommand stopCommand12 = new fredboat.command.music.control.StopCommand("hi!", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.seeking.SeekCommand seekCommand14 = new fredboat.command.music.seeking.SeekCommand("fredboat.util.BrainfuckException: \u2705", str_array8);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand15 = new fredboat.command.fun.DanceCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = configCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = configCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = configCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand15.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BASE));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array10);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array10);
    java.lang.String str13 = textCommand12.msg;
    java.lang.String str14 = textCommand12.msg;
    textCommand12.msg = "en_US";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str13.equals("qua, 31 dez 1969, 09:00 PM"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str14.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.command.admin.EvalCommand evalCommand16 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = evalCommand16.getMinimumPerms();
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = evalCommand16.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array9);
    fredboat.command.maintenance.NodesCommand nodesCommand15 = new fredboat.command.maintenance.NodesCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = nodesCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }

    fredboat.util.rest.Weather weather3 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.maintenance.PingCommand pingCommand11 = new fredboat.command.maintenance.PingCommand("\u274C", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather3, ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("\u2757", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("fredboat.util.BrainfuckException: \u2705", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.util.CommandsCommand commandsCommand12 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.music.control.StopCommand stopCommand13 = new fredboat.command.music.control.StopCommand("hi!", str_array9);
    fredboat.command.fun.RandomImageCommand randomImageCommand14 = new fredboat.command.fun.RandomImageCommand("\u274C", "\uD83D\uDCDD", str_array9);
    fredboat.command.admin.EvalCommand evalCommand15 = new fredboat.command.admin.EvalCommand("\u2757", str_array9);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand16 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array9);
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
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.admin.BotRestartCommand botRestartCommand5 = new fredboat.command.admin.BotRestartCommand("\u2705", str_array4);
    fredboat.messaging.internal.Context context6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = botRestartCommand5.help(context6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand19 = new fredboat.command.admin.ReviveCommand("\uD83D\uDEAA", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = reviveCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.admin.TestCommand testCommand8 = new fredboat.command.admin.TestCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.moderation.LanguageCommand languageCommand9 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.util.MathCommand mathCommand8 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("Bot Owner", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("Bot Admin", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.BotRestartCommand botRestartCommand2 = new fredboat.command.admin.BotRestartCommand("fredboat.util.rest.APILimitException: en_US", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand17 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array11);
    fredboat.command.admin.TestCommand testCommand18 = new fredboat.command.admin.TestCommand("", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand19 = new fredboat.command.music.control.PauseCommand("qua, 31 dez 1969, 09:00 PM", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand20 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array10);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array10);
    textCommand12.msg = "en_US";
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand12.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand6 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDEAA", str_array4);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand7 = new fredboat.command.admin.UnblacklistCommand("Bot Owner", str_array4);
    fredboat.perms.PermissionLevel permissionLevel8 = unblacklistCommand7.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand7.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.fun.PatCommand patCommand18 = new fredboat.command.fun.PatCommand("", "", str_array13);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand19 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array13);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand20 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array13);
    fredboat.command.admin.ReviveCommand reviveCommand21 = new fredboat.command.admin.ReviveCommand("\uD83D\uDEAA", str_array13);
    fredboat.command.util.AvatarCommand avatarCommand22 = new fredboat.command.util.AvatarCommand("\uD83D\uDCDD", str_array13);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand23 = new fredboat.command.fun.DanceCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand11 = new fredboat.command.music.seeking.RestartCommand("", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand14 = new fredboat.command.util.CommandsCommand("Bot Owner", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = serverInfoCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setPressure(10);
    double d3 = weatherMainOpenWeather0.getTempMin();
    weatherMainOpenWeather0.setPressure((int)'4');
    weatherMainOpenWeather0.setTempMin((double)(short)1);
    double d8 = weatherMainOpenWeather0.getTempMax();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand12 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand13 = new fredboat.command.music.seeking.RestartCommand("", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array10);
    fredboat.command.music.control.LeaveCommand leaveCommand15 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array10);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand16 = new fredboat.command.maintenance.AudioDebugCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "DJ", str_array10);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand18 = new fredboat.command.music.control.PlaySplitCommand("Bot Owner", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand12 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand14 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array8);
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
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = leaveCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel14 = leaveCommand12.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = leaveCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = leaveCommand12.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand12 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("\u2705", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("fredboat.util.BrainfuckException: \u2705", str_array8);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("User", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand16 = new fredboat.command.admin.ExitCommand("en_US", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand17 = new fredboat.command.music.control.UnpauseCommand("https://i.imgur.com/YqZuqEB.jpg", str_array10);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("\u2757", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand15 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array10);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand17 = new fredboat.command.music.seeking.RestartCommand("Bot Admin", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand18 = new fredboat.command.music.seeking.RewindCommand("Provided by OpenWeatherMap.org", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = rewindCommand18.getMinimumPerms();
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = rewindCommand18.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.control.DestroyCommand destroyCommand7 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array4);
    fredboat.perms.PermissionLevel permissionLevel8 = destroyCommand7.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel9 = destroyCommand7.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = destroyCommand7.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel11 = destroyCommand7.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = destroyCommand7.getMinimumPerms();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = destroyCommand7.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    simpleTrackProvider0.skipped();
    fredboat.audio.queue.AudioTrackContext audioTrackContext5 = simpleTrackProvider0.peek();
    int i6 = simpleTrackProvider0.size();
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
    org.junit.Assert.assertNull(audioTrackContext5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array7);
    fredboat.command.admin.BotRestartCommand botRestartCommand12 = new fredboat.command.admin.BotRestartCommand("Provided by OpenWeatherMap.org", str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }

    java.lang.String[] str_array14 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array14);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array14);
    fredboat.command.fun.TextCommand textCommand17 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand18 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array14);
    fredboat.command.music.seeking.RewindCommand rewindCommand19 = new fredboat.command.music.seeking.RewindCommand("", str_array14);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand20 = new fredboat.command.admin.NodeAdminCommand("\u2705", str_array14);
    fredboat.command.fun.FacedeskCommand facedeskCommand21 = new fredboat.command.fun.FacedeskCommand("", "fredboat.util.BrainfuckException: \u2705", str_array14);
    fredboat.command.moderation.ConfigCommand configCommand22 = new fredboat.command.moderation.ConfigCommand("", str_array14);
    fredboat.command.admin.ReviveCommand reviveCommand23 = new fredboat.command.admin.ReviveCommand("Bot Admin", str_array14);
    fredboat.command.fun.CatgirlCommand catgirlCommand24 = new fredboat.command.fun.CatgirlCommand("Bot Owner", str_array14);
    fredboat.commandmeta.abs.CommandContext commandContext25 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand24.onInvoke(commandContext25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand16 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array11);
    fredboat.command.fun.HugCommand hugCommand18 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = hugCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.maintenance.NodesCommand nodesCommand10 = new fredboat.command.maintenance.NodesCommand("", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("Bot Owner", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand12 = new fredboat.command.util.CommandsCommand("fredboat.util.BrainfuckException: \u2705", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.perms.PermissionLevel permissionLevel14 = leaveCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = leaveCommand13.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }

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
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.LeaveCommand leaveCommand13 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array8);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand14 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.perms.PermissionLevel permissionLevel15 = playSplitCommand14.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = playSplitCommand14.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    fredboat.audio.queue.AudioTrackContext audioTrackContext4 = simpleTrackProvider0.provideAudioTrack();
    long long5 = simpleTrackProvider0.getDurationMillis();
    simpleTrackProvider0.setShuffle(true);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.audio.queue.AudioTrackContext audioTrackContext9 = simpleTrackProvider0.getTrack((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    fredboat.util.rest.models.weather.WeatherError weatherError2 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str3 = weatherError2.getTemperature();
    java.lang.String str4 = weatherError2.getFormattedDate();
    java.lang.String str5 = weatherError2.getFormattedDate();
    java.lang.String str6 = weatherError2.getTemperature();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
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
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.fun.RollCommand rollCommand8 = new fredboat.command.fun.RollCommand("hi!", "DJ", str_array6);
    fredboat.command.music.info.HistoryCommand historyCommand9 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: ", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getId();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather4 = openWeatherCurrent0.getWeather();
    int i5 = openWeatherCurrent0.getId();
    openWeatherCurrent0.setId(2);
    int i8 = openWeatherCurrent0.getDatetime();
    int i9 = openWeatherCurrent0.getVisibility();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather10 = openWeatherCurrent0.getClouds();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloudsOpenWeather10);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    int i5 = blacklistEntry1.getLevel();
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    int i7 = blacklistEntry1.getRateLimitReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1531610128989L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    weatherSystemOpenWeather0.setId((int)(short)100);
    int i3 = weatherSystemOpenWeather0.getType();
    int i4 = weatherSystemOpenWeather0.getType();
    int i5 = weatherSystemOpenWeather0.getSunset();
    weatherSystemOpenWeather0.setId((-1));
    weatherSystemOpenWeather0.setId((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext6 = simpleTrackProvider0.getTracksInRange((int)(byte)10, 10000);
    int i7 = simpleTrackProvider0.size();
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
    org.junit.Assert.assertNotNull(list_audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather1 = openWeatherCurrent0.getSys();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderIcon();
    int i3 = openWeatherCurrent0.getDatetime();
    int i4 = openWeatherCurrent0.getCode();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode5 = openWeatherCurrent0.errorType();
    java.lang.String str6 = openWeatherCurrent0.getDataProviderIcon();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "https://i.imgur.com/YqZuqEB.jpg"+ "'", str2.equals("https://i.imgur.com/YqZuqEB.jpg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    org.junit.Assert.assertTrue("'" + errorCode5 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode5.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "https://i.imgur.com/YqZuqEB.jpg"+ "'", str6.equals("https://i.imgur.com/YqZuqEB.jpg"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }

    fredboat.util.BrainfuckException brainfuckException2 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array3 = brainfuckException2.getSuppressed();
    fredboat.commandmeta.MessagingException messagingException4 = new fredboat.commandmeta.MessagingException("DJ", (java.lang.Throwable)brainfuckException2);
    java.lang.Throwable[] throwable_array5 = brainfuckException2.getSuppressed();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException6 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)brainfuckException2);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array5);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.music.seeking.RestartCommand restartCommand10 = new fredboat.command.music.seeking.RestartCommand("", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand11 = new fredboat.command.music.control.JoinCommand("https://i.imgur.com/YqZuqEB.jpg", str_array7);
    fredboat.command.maintenance.NodesCommand nodesCommand12 = new fredboat.command.maintenance.NodesCommand("fredboat.util.BrainfuckException: ", str_array7);
    fredboat.command.music.seeking.SeekCommand seekCommand13 = new fredboat.command.music.seeking.SeekCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array7);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = seekCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand6 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("", str_array5);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = listCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }

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
    fredboat.messaging.internal.Context context29 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str30 = languageCommand26.help(context29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = openWeatherCurrent0.errorType();
    int i3 = openWeatherCurrent0.getCode();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode4 = openWeatherCurrent0.errorType();
    fredboat.util.rest.models.weather.WeatherError weatherError5 = new fredboat.util.rest.models.weather.WeatherError(errorCode4);
    java.lang.String str6 = weatherError5.getFormattedDate();
    
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
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    java.lang.String str4 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig6 = uConfig0.setRefresh("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org");
    java.lang.String str7 = uConfig6.getBearer();
    fredboat.db.entity.UConfig uConfig9 = uConfig6.setBearerExpiration(1531609994016L);
    java.lang.String str10 = uConfig9.getBearer();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\u2705"+ "'", str4.equals("\u2705"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\u2705"+ "'", str7.equals("\u2705"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "\u2705"+ "'", str10.equals("\u2705"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array10);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("en_US", str_array10);
    fredboat.command.music.seeking.SeekCommand seekCommand18 = new fredboat.command.music.seeking.SeekCommand("", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = seekCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand4 = new fredboat.command.music.control.RepeatCommand("", str_array3);
    fredboat.perms.PermissionLevel permissionLevel5 = repeatCommand4.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext6 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand4.onInvoke(commandContext6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    org.junit.Assert.assertTrue("'" + permissionLevel5 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel5.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand16 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("Provided by OpenWeatherMap.org", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand18 = new fredboat.command.fun.CatgirlCommand("Bot Admin", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = catgirlCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand13 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.admin.ReviveCommand reviveCommand16 = new fredboat.command.admin.ReviveCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    guildConfig1.setId("en_US");

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    long long1 = uConfig0.getBearerExpiration();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setUserId("");
    java.lang.String str4 = uConfig0.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand10 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand11 = new fredboat.command.music.control.DestroyCommand("Bot Admin", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }

    fredboat.util.BrainfuckException brainfuckException4 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array5 = brainfuckException4.getSuppressed();
    fredboat.commandmeta.MessagingException messagingException6 = new fredboat.commandmeta.MessagingException("DJ", (java.lang.Throwable)brainfuckException4);
    fredboat.commandmeta.MessagingException messagingException7 = new fredboat.commandmeta.MessagingException("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", (java.lang.Throwable)brainfuckException4);
    fredboat.util.BrainfuckException brainfuckException8 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException4);
    java.lang.String str9 = brainfuckException4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org"+ "'", str9.equals("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    blacklistEntry1.setRateLimitReached(3000);
    long long7 = blacklistEntry1.getBlacklistedTimestamp();
    blacklistEntry1.rateLimitReachedTimestamp = 0L;
    long long10 = blacklistEntry1.getBlacklistedTimestamp();
    // The following exception was thrown during execution in test generation
    try {
    blacklistEntry1.setId("fredboat.util.BrainfuckException: \uD83D\uDEAA");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1531610132516L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 1531610132516L);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand16 = new fredboat.command.music.control.UnpauseCommand("https://i.imgur.com/YqZuqEB.jpg", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDCDD", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext1);
    int i3 = simpleTrackProvider0.size();
    fredboat.audio.queue.AudioTrackContext audioTrackContext4 = simpleTrackProvider0.peek();
    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider5 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext6 = simpleTrackProvider5.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext7 = null;
    simpleTrackProvider5.setLastTrack(audioTrackContext7);
    java.lang.Long[] long_array12 = new java.lang.Long[] { 1L, (-1L), 0L };
    java.util.ArrayList<java.lang.Long> arraylist_long13 = new java.util.ArrayList<java.lang.Long>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long13, long_array12);
    simpleTrackProvider5.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long13);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long13);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext17 = simpleTrackProvider0.getAsListOrdered();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext17);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }

    fredboat.audio.queue.PlaylistInfo.Source source4 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo5 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source4);
    fredboat.audio.queue.PlaylistInfo playlistInfo6 = new fredboat.audio.queue.PlaylistInfo(0, "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", source4);
    playlistInfo6.setName("hi!");
    playlistInfo6.setName("\u274C");
    fredboat.audio.queue.PlaylistInfo.Source source11 = playlistInfo6.getSource();
    org.junit.Assert.assertTrue("'" + source4 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source4.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    org.junit.Assert.assertTrue("'" + source11 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source11.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand10 = new fredboat.command.music.control.JoinCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand11 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.control.PauseCommand pauseCommand17 = new fredboat.command.music.control.PauseCommand("", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand18 = new fredboat.command.admin.ReviveCommand("hi!", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand19 = new fredboat.command.util.WeatherCommand(weather0, "DJ", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    boolean b1 = openWeatherCurrent0.isError();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderIcon();
    java.lang.String str3 = openWeatherCurrent0.getThumbnailUrl();
    int i4 = openWeatherCurrent0.getDatetime();
    java.util.List<fredboat.util.rest.models.weather.WeatherOpenWeather> list_weatherOpenWeather5 = openWeatherCurrent0.getWeather();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode6 = openWeatherCurrent0.errorType();
    int i7 = openWeatherCurrent0.getVisibility();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "https://i.imgur.com/YqZuqEB.jpg"+ "'", str2.equals("https://i.imgur.com/YqZuqEB.jpg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_weatherOpenWeather5);
    org.junit.Assert.assertTrue("'" + errorCode6 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode6.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }

    fredboat.db.entity.GuildConfig guildConfig0 = new fredboat.db.entity.GuildConfig();
    java.lang.String str1 = guildConfig0.getGuildId();
    boolean b2 = guildConfig0.isTrackAnnounce();
    java.lang.String str3 = guildConfig0.getLang();
    java.lang.String str4 = guildConfig0.getLang();
    guildConfig0.setTrackAnnounce(false);
    guildConfig0.setTrackAnnounce(true);
    boolean b9 = guildConfig0.isTrackAnnounce();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "en_US"+ "'", str3.equals("en_US"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "en_US"+ "'", str4.equals("en_US"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }

    fredboat.util.BrainfuckException brainfuckException1 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array2 = brainfuckException1.getSuppressed();
    java.lang.String str3 = brainfuckException1.toString();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException4 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)brainfuckException1);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org"+ "'", str3.equals("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.getId();
    blacklistEntry1.setLevel(0);
    blacklistEntry1.setRateLimitReached((int)(byte)100);
    long long10 = blacklistEntry1.id;
    blacklistEntry1.id = 5;
    blacklistEntry1.blacklistedTimestamp = 'a';
    long long15 = blacklistEntry1.id;
    long long16 = blacklistEntry1.blacklistedTimestamp;
    blacklistEntry1.blacklistedTimestamp = 32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long10 == 10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long15 == 5L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 97L);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.admin.ReviveCommand reviveCommand17 = new fredboat.command.admin.ReviveCommand("", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand18 = new fredboat.command.fun.FacedeskCommand("\u2757", "DJ", str_array11);
    fredboat.command.util.BrainfuckCommand brainfuckCommand19 = new fredboat.command.util.BrainfuckCommand("", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array10);
    fredboat.command.admin.BotRestartCommand botRestartCommand18 = new fredboat.command.admin.BotRestartCommand("\uD83D\uDEAA", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = botRestartCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode2 = weatherError1.errorType();
    fredboat.util.rest.models.weather.WeatherError weatherError3 = new fredboat.util.rest.models.weather.WeatherError(errorCode2);
    java.lang.String str4 = weatherError3.getThumbnailUrl();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode5 = weatherError3.errorType();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));
    org.junit.Assert.assertTrue("'" + errorCode2 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode2.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    org.junit.Assert.assertTrue("'" + errorCode5 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG + "'", errorCode5.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    java.lang.String str1 = openWeatherCurrent0.getLocation();
    java.lang.String str2 = openWeatherCurrent0.getName();
    int i3 = openWeatherCurrent0.getId();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather4 = openWeatherCurrent0.getMain();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather5 = openWeatherCurrent0.getClouds();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather6 = openWeatherCurrent0.getMain();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(cloudsOpenWeather5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather6);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("", str_array4);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = nodeAdminCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = nodeAdminCommand6.getMinimumPerms();
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = nodeAdminCommand6.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    fredboat.util.rest.models.weather.WeatherError weatherError2 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    boolean b3 = weatherError2.isError();
    java.lang.String str4 = weatherError2.getWeatherDescription();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }

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
    java.util.List<java.lang.String> list_str27 = guildPermissions0.getDjList();
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand34 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array33);
    fredboat.command.admin.ExitCommand exitCommand35 = new fredboat.command.admin.ExitCommand("hi!", str_array33);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand36 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array33);
    fredboat.perms.PermissionLevel permissionLevel37 = setAvatarCommand36.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel38 = setAvatarCommand36.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel39 = setAvatarCommand36.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel40 = setAvatarCommand36.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel41 = setAvatarCommand36.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel42 = setAvatarCommand36.getMinimumPerms();
    fredboat.db.entity.GuildPermissions guildPermissions43 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions44 = new fredboat.db.entity.GuildPermissions();
    java.lang.String[] str_array48 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand49 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array48);
    fredboat.command.music.info.ListCommand listCommand50 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array48);
    java.util.List<java.lang.String> list_str51 = listCommand50.aliases;
    guildPermissions44.setDjList(list_str51);
    guildPermissions43.setUserList(list_str51);
    java.util.List<java.lang.String> list_str54 = guildPermissions43.getDjList();
    java.util.List<java.lang.String> list_str55 = guildPermissions43.getUserList();
    fredboat.perms.PermissionLevel permissionLevel56 = fredboat.perms.PermissionLevel.ADMIN;
    java.lang.String[] str_array66 = new java.lang.String[] { "hi!", "Bot Owner", "\u274C", "en_US", "hi!", "hi!", "\u2705", "Provided by OpenWeatherMap.org", "en_US" };
    java.util.ArrayList<java.lang.String> arraylist_str67 = new java.util.ArrayList<java.lang.String>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str67, str_array66);
    guildPermissions43.setFromEnum(permissionLevel56, (java.util.List<java.lang.String>)arraylist_str67);
    // The following exception was thrown during execution in test generation
    try {
    guildPermissions0.setFromEnum(permissionLevel42, (java.util.List<java.lang.String>)arraylist_str67);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    org.junit.Assert.assertTrue("'" + permissionLevel37 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel37.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel38 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel38.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel39 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel39.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel40 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel40.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel41 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel41.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel42 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel42.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);
    org.junit.Assert.assertTrue("'" + permissionLevel56 + "' != '" + fredboat.perms.PermissionLevel.ADMIN + "'", permissionLevel56.equals(fredboat.perms.PermissionLevel.ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }

    fredboat.db.entity.GuildConfig guildConfig1 = new fredboat.db.entity.GuildConfig("\uD83D\uDCDD");
    guildConfig1.setLang("\u2757");

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("en_US", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = pauseCommand16.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel18 = pauseCommand16.getMinimumPerms();
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = pauseCommand16.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    blacklistEntry1.setBlacklistedTimestamp((long)(short)-1);
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    int i7 = blacklistEntry1.getLevel();
    long long8 = blacklistEntry1.getRateLimitReachedTimestamp();
    blacklistEntry1.setBlacklistedTimestamp(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 100L);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setTemp((-1.0d));
    double d5 = weatherMainOpenWeather0.getTempMax();
    weatherMainOpenWeather0.setTemp((double)(short)0);
    double d8 = weatherMainOpenWeather0.getTemp();
    int i9 = weatherMainOpenWeather0.getPressure();
    weatherMainOpenWeather0.setPressure((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand17 = new fredboat.command.admin.ExitCommand("\u274C", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather1, "https://i.imgur.com/YqZuqEB.jpg", str_array11);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("Bot Admin", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.SOMETHING_IS_WRONG;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str2 = weatherError1.getDataProviderIcon();
    java.lang.String str3 = weatherError1.getLocation();
    java.lang.String str4 = weatherError1.getTemperature();
    java.lang.String str5 = weatherError1.getThumbnailUrl();
    java.lang.String str6 = weatherError1.getDataProviderString();
    java.lang.String str7 = weatherError1.getLocation();
    java.lang.String str8 = weatherError1.getWeatherDescription();
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

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }

    java.lang.String[] str_array16 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array16);
    fredboat.command.admin.BotRestartCommand botRestartCommand18 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array16);
    fredboat.command.maintenance.VersionCommand versionCommand19 = new fredboat.command.maintenance.VersionCommand("fredboat.util.BrainfuckException: \u2705", str_array16);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand20 = new fredboat.command.music.control.PlaySplitCommand("http://i.imgur.com/NqyOqnj.gif", str_array16);
    fredboat.command.util.MathCommand mathCommand21 = new fredboat.command.util.MathCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array16);
    fredboat.command.admin.ReviveCommand reviveCommand22 = new fredboat.command.admin.ReviveCommand("fredboat.util.BrainfuckException: \u2705", str_array16);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand23 = new fredboat.command.admin.UnblacklistCommand("Bot Admin", str_array16);
    fredboat.command.util.CommandsCommand commandsCommand24 = new fredboat.command.util.CommandsCommand("", str_array16);
    fredboat.command.music.control.DestroyCommand destroyCommand25 = new fredboat.command.music.control.DestroyCommand("qua, 31 dez 1969, 09:00 PM", str_array16);
    fredboat.messaging.internal.Context context26 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str27 = destroyCommand25.help(context26);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }

    fredboat.db.entity.GuildConfig guildConfig0 = new fredboat.db.entity.GuildConfig();
    java.lang.String str1 = guildConfig0.getGuildId();
    boolean b2 = guildConfig0.isAutoResume();
    boolean b3 = guildConfig0.isAutoResume();
    java.lang.String str4 = guildConfig0.getLang();
    guildConfig0.setTrackAnnounce(false);
    
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
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.maintenance.NodesCommand nodesCommand10 = new fredboat.command.maintenance.NodesCommand("", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.fun.CatgirlCommand catgirlCommand12 = new fredboat.command.fun.CatgirlCommand("hi!", str_array7);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand13 = new fredboat.command.moderation.DisableCommandsCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel14 = disableCommandsCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = disableCommandsCommand13.getMinimumPerms();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    weatherSystemOpenWeather0.setId((int)(short)100);
    int i3 = weatherSystemOpenWeather0.getSunrise();
    weatherSystemOpenWeather0.setCountry("hi!");
    java.lang.String str6 = weatherSystemOpenWeather0.getCountry();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }

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
    fredboat.audio.queue.AudioTrackContext audioTrackContext11 = simpleTrackProvider0.provideAudioTrack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext11);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.BotRestartCommand botRestartCommand13 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.maintenance.NodesCommand nodesCommand14 = new fredboat.command.maintenance.NodesCommand("en_US", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = nodesCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array10);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand15 = new fredboat.command.moderation.DisableCommandsCommand("Bot Admin", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand16 = new fredboat.command.moderation.LanguageCommand("", str_array10);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("fredboat.util.rest.APILimitException: en_US", str_array10);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = setAvatarCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }

    fredboat.util.BrainfuckException brainfuckException2 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException2);
    java.lang.Throwable[] throwable_array4 = brainfuckException3.getSuppressed();
    fredboat.util.BrainfuckException brainfuckException6 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array7 = brainfuckException6.getSuppressed();
    brainfuckException3.addSuppressed((java.lang.Throwable)brainfuckException6);
    fredboat.util.BrainfuckException brainfuckException12 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array13 = brainfuckException12.getSuppressed();
    java.lang.String str14 = brainfuckException12.toString();
    fredboat.util.BrainfuckException brainfuckException15 = new fredboat.util.BrainfuckException("https://i.imgur.com/YqZuqEB.jpg", (java.lang.Throwable)brainfuckException12);
    fredboat.commandmeta.MessagingException messagingException16 = new fredboat.commandmeta.MessagingException("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", (java.lang.Throwable)brainfuckException15);
    brainfuckException3.addSuppressed((java.lang.Throwable)messagingException16);
    fredboat.util.BrainfuckException brainfuckException22 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException23 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException22);
    fredboat.util.BrainfuckException brainfuckException24 = new fredboat.util.BrainfuckException(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", (java.lang.Throwable)brainfuckException22);
    fredboat.util.BrainfuckException brainfuckException26 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    fredboat.util.BrainfuckException brainfuckException29 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException30 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException29);
    brainfuckException26.addSuppressed((java.lang.Throwable)brainfuckException29);
    brainfuckException22.addSuppressed((java.lang.Throwable)brainfuckException29);
    fredboat.commandmeta.MessagingException messagingException33 = new fredboat.commandmeta.MessagingException("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", (java.lang.Throwable)brainfuckException22);
    brainfuckException3.addSuppressed((java.lang.Throwable)messagingException33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org"+ "'", str14.equals("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext1);
    fredboat.audio.queue.AudioTrackContext audioTrackContext3 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext3);
    boolean b5 = simpleTrackProvider0.isEmpty();
    fredboat.audio.queue.RepeatMode repeatMode6 = simpleTrackProvider0.getRepeatMode();
    int i7 = simpleTrackProvider0.streamsCount();
    int i8 = simpleTrackProvider0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    org.junit.Assert.assertTrue("'" + repeatMode6 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode6.equals(fredboat.audio.queue.RepeatMode.OFF));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    openWeatherCurrent0.setId((int)(byte)100);
    openWeatherCurrent0.setId((int)' ');
    openWeatherCurrent0.setId((int)'a');
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather7 = openWeatherCurrent0.getSys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather7);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "Bot Admin", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.admin.ReviveCommand reviveCommand20 = new fredboat.command.admin.ReviveCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.util.AvatarCommand avatarCommand21 = new fredboat.command.util.AvatarCommand("\uD83D\uDCDD", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = avatarCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand12 = new fredboat.command.music.seeking.RestartCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = gitInfoCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array12);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand19 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array12);
    fredboat.command.util.MathCommand mathCommand20 = new fredboat.command.util.MathCommand("Bot Owner", str_array12);
    fredboat.command.fun.TextCommand textCommand21 = new fredboat.command.fun.TextCommand("\uD83D\uDCDD", "hi!", str_array12);
    fredboat.messaging.internal.Context context22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = textCommand21.help(context22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("fredboat.util.BrainfuckException: \u2705");

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.music.seeking.ForwardCommand forwardCommand13 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.LeaveCommand leaveCommand14 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array9);
    fredboat.command.music.control.DestroyCommand destroyCommand15 = new fredboat.command.music.control.DestroyCommand("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand16 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
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
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.admin.UpdateCommand updateCommand10 = new fredboat.command.admin.UpdateCommand("", str_array8);
    fredboat.command.fun.CatgirlCommand catgirlCommand11 = new fredboat.command.fun.CatgirlCommand("Bot Admin", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand("\u2705", str_array8);
    fredboat.command.fun.CatgirlCommand catgirlCommand13 = new fredboat.command.fun.CatgirlCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.maintenance.PingCommand pingCommand14 = new fredboat.command.maintenance.PingCommand("User", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand12 = new fredboat.command.music.seeking.ForwardCommand("fredboat.util.BrainfuckException: ", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    weatherCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand11 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.DestroyCommand destroyCommand12 = new fredboat.command.music.control.DestroyCommand("Bot Admin", str_array7);
    fredboat.command.moderation.ConfigCommand configCommand13 = new fredboat.command.moderation.ConfigCommand("\u2757", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand17 = new fredboat.command.fun.RandomImageCommand("qua, 31 dez 1969, 09:00 PM", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.admin.UpdateCommand updateCommand18 = new fredboat.command.admin.UpdateCommand("fredboat.util.rest.APILimitException: en_US", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("fredboat.util.BrainfuckException: \u2705");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.startNow((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.admin.UpdateCommand updateCommand8 = new fredboat.command.admin.UpdateCommand("", str_array6);
    fredboat.command.fun.FacedeskCommand facedeskCommand9 = new fredboat.command.fun.FacedeskCommand("Bot Admin", "qua, 31 dez 1969, 09:00 PM", str_array6);
    java.lang.String str10 = facedeskCommand9.getRandomImageUrl();
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = facedeskCommand9.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str10.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.info.ListCommand listCommand6 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array4);
    fredboat.command.admin.TestCommand testCommand7 = new fredboat.command.admin.TestCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.perms.PermissionLevel permissionLevel8 = testCommand7.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel9 = testCommand7.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = testCommand7.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand7.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.util.BrainfuckCommand brainfuckCommand17 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.music.seeking.RestartCommand restartCommand18 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array12);
    fredboat.command.maintenance.GetIdCommand getIdCommand19 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.music.control.StopCommand stopCommand20 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand21 = new fredboat.command.maintenance.AudioDebugCommand("\uD83D\uDCDD", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand22 = new fredboat.command.maintenance.GitInfoCommand("", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.music.control.LeaveCommand leaveCommand7 = new fredboat.command.music.control.LeaveCommand("hi!", str_array5);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand8 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = gitInfoCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getId();
    int i4 = openWeatherCurrent0.getId();
    java.lang.String str5 = openWeatherCurrent0.getDataProviderString();
    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather6 = openWeatherCurrent0.getClouds();
    java.lang.String str7 = openWeatherCurrent0.getWeatherDescription();
    
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
    org.junit.Assert.assertNull(cloudsOpenWeather6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.music.info.ListCommand listCommand15 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array12);
    fredboat.command.fun.PatCommand patCommand17 = new fredboat.command.fun.PatCommand("", "", str_array12);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand18 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array12);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand19 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.music.control.JoinCommand joinCommand20 = new fredboat.command.music.control.JoinCommand("https://i.imgur.com/YqZuqEB.jpg", str_array12);
    fredboat.command.music.control.PauseCommand pauseCommand21 = new fredboat.command.music.control.PauseCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext22 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand21.onInvoke(commandContext22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setTempMax((double)0);
    double d5 = weatherMainOpenWeather0.getTempMax();
    weatherMainOpenWeather0.setHumidity(100);
    double d8 = weatherMainOpenWeather0.getTemp();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather1 = openWeatherCurrent0.getSys();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderIcon();
    int i3 = openWeatherCurrent0.getDatetime();
    int i4 = openWeatherCurrent0.getCode();
    java.lang.String str5 = openWeatherCurrent0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherSystemOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "https://i.imgur.com/YqZuqEB.jpg"+ "'", str2.equals("https://i.imgur.com/YqZuqEB.jpg"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }

    fredboat.audio.queue.PlaylistInfo.Source source2 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo3 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source2);
    playlistInfo3.setTotalTracks((int)(short)0);
    java.lang.String str6 = playlistInfo3.getName();
    playlistInfo3.setName("Provided by OpenWeatherMap.org");
    playlistInfo3.setTotalTracks((int)(byte)100);
    playlistInfo3.setName("");
    java.lang.String str13 = playlistInfo3.getName();
    org.junit.Assert.assertTrue("'" + source2 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source2.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\u2757"+ "'", str6.equals("\u2757"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.rateLimitReached = 10;
    int i4 = blacklistEntry1.level;
    int i5 = blacklistEntry1.getRateLimitReached();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = historyCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }

    fredboat.db.entity.GuildConfig guildConfig0 = new fredboat.db.entity.GuildConfig();
    java.lang.String str1 = guildConfig0.getGuildId();
    boolean b2 = guildConfig0.isTrackAnnounce();
    java.lang.String str3 = guildConfig0.getLang();
    guildConfig0.setTrackAnnounce(false);
    guildConfig0.setId("https://i.imgur.com/YqZuqEB.jpg");
    guildConfig0.setId("Provided by OpenWeatherMap.org");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "en_US"+ "'", str3.equals("en_US"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }

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
    fredboat.command.fun.CatgirlCommand catgirlCommand41 = tuple2_catgirlCommand_commandsCommand40.a;
    fredboat.messaging.internal.Context context42 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str43 = catgirlCommand41.help(context42);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(catgirlCommand41);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.RollCommand rollCommand17 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\u2705", str_array11);
    fredboat.command.fun.CatgirlCommand catgirlCommand18 = new fredboat.command.fun.CatgirlCommand("hi!", str_array11);
    fredboat.command.music.info.HistoryCommand historyCommand19 = new fredboat.command.music.info.HistoryCommand("Provided by OpenWeatherMap.org", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand17 = new fredboat.command.music.info.HistoryCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("\u2757", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.music.control.PauseCommand pauseCommand11 = new fredboat.command.music.control.PauseCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("hi!", str_array7);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand13 = new fredboat.command.music.control.ReshuffleCommand("\u274C", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

}
