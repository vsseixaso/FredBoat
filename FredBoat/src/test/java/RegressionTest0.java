
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    java.lang.String str0 = fredboat.util.Emojis.PENCIL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\uD83D\uDCDD"+ "'", str0.equals("\uD83D\uDCDD"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    java.lang.String str0 = fredboat.util.AsciiArtConstant.EAGLE_OF_LENNY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D"+ "'", str0.equals(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    fredboat.util.rest.Http.Params params0 = new fredboat.util.rest.Http.Params();

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    java.lang.String str0 = fredboat.util.AsciiArtConstant.MAGICAL_LENNY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..."+ "'", str0.equals("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..."));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.ratelimit.Ratelimiter ratelimiter0 = fredboat.util.ratelimit.Ratelimiter.getRatelimiter();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    fredboat.audio.source.PasteServiceConstants pasteServiceConstants0 = new fredboat.audio.source.PasteServiceConstants();

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    org.slf4j.Logger logger0 = null;
    java.io.InputStream inputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.log.SLF4JInputStreamErrorLogger sLF4JInputStreamErrorLogger2 = new fredboat.util.log.SLF4JInputStreamErrorLogger(logger0, inputStream1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    fredboat.agent.FredBoatAgent.shutdown();

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand4 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array3);
    fredboat.messaging.internal.Context context5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = versionCommand4.help(context5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.util.MathCommand mathCommand6 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    mathCommand6.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    java.lang.String str0 = fredboat.util.Emojis.EXCLAMATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\u2757"+ "'", str0.equals("\u2757"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    java.lang.String str0 = fredboat.util.Emojis.DOOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\uD83D\uDEAA"+ "'", str0.equals("\uD83D\uDEAA"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    int i0 = fredboat.audio.player.AudioLossCounter.EXPECTED_PACKET_COUNT_PER_MIN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3000);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    int i0 = java.lang.Thread.MAX_PRIORITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    fredboat.perms.PermissionLevel permissionLevel0 = fredboat.perms.PermissionLevel.BOT_OWNER;
    org.junit.Assert.assertTrue("'" + permissionLevel0 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel0.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    // The following exception was thrown during execution in test generation
    try {
    fredboat.commandmeta.init.MainCommandInitializer.initCommands();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    int i0 = fredboat.command.util.BrainfuckCommand.MAX_CYCLE_COUNT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10000);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    // The following exception was thrown during execution in test generation
    try {
    java.io.File file1 = fredboat.util.rest.CacheUtil.getImageFromURL("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand7 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
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
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array3);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params5 = fredboat.util.rest.Http.Params.of(str_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.util.MathCommand mathCommand6 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.messaging.internal.Context context7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = mathCommand6.help(context7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array3);
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array3);
    fredboat.messaging.internal.Context context6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = repeatCommand5.help(context6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("\u2757", (int)(byte)10, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    fredboat.commandmeta.init.MainCommandInitializer mainCommandInitializer0 = new fredboat.commandmeta.init.MainCommandInitializer();

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.admin.ExitCommand exitCommand7 = new fredboat.command.admin.ExitCommand("hi!", str_array5);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand5 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array4);
    fredboat.messaging.internal.Context context6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = pauseCommand5.help(context6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = shuffleCommand6.getMinimumPerms();
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = shuffleCommand6.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand6 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.fun.CatgirlCommand catgirlCommand7 = new fredboat.command.fun.CatgirlCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand6 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.fun.CatgirlCommand catgirlCommand7 = new fredboat.command.fun.CatgirlCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = catgirlCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.LOCATION_NOT_FOUND;
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.LOCATION_NOT_FOUND + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.LOCATION_NOT_FOUND));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.command.music.seeking.RestartCommand restartCommand7 = new fredboat.command.music.seeking.RestartCommand("", str_array4);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = restartCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    java.lang.String str0 = fredboat.util.Emojis.OK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\u2705"+ "'", str0.equals("\u2705"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    java.util.Map<java.lang.Class<? extends fredboat.agent.FredBoatAgent>,java.lang.Long> map_cls_long0 = fredboat.agent.FredBoatAgent.getLastRunTimes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_cls_long0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    java.lang.String str0 = fredboat.util.Emojis.BAD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\u274C"+ "'", str0.equals("\u274C"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.admin.ExitCommand exitCommand7 = new fredboat.command.admin.ExitCommand("hi!", str_array5);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = listCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    fredboat.agent.FredBoatAgent fredBoatAgent0 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.start(fredBoatAgent0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array3);
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array3);
    fredboat.commandmeta.abs.CommandContext commandContext6 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand5.onInvoke(commandContext6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    org.slf4j.Logger logger0 = null;
    java.io.InputStream inputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.log.SLF4JInputStreamLogger sLF4JInputStreamLogger2 = new fredboat.util.log.SLF4JInputStreamLogger(logger0, inputStream1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.admin.ExitCommand exitCommand7 = new fredboat.command.admin.ExitCommand("hi!", str_array5);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = setAvatarCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand3 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array2);
    fredboat.messaging.internal.Context context4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = nodeAdminCommand3.help(context4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand10 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array6);
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
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand6.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array3);
    fredboat.messaging.internal.Context context5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = nodeAdminCommand4.help(context5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    int i4 = blacklistEntry1.getRateLimitReached();
    int i5 = blacklistEntry1.level;
    blacklistEntry1.rateLimitReached = '#';
    blacklistEntry1.rateLimitReachedTimestamp = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array3);
    fredboat.perms.PermissionLevel permissionLevel5 = nodeAdminCommand4.getMinimumPerms();
    fredboat.messaging.internal.Context context6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = nodeAdminCommand4.help(context6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    org.junit.Assert.assertTrue("'" + permissionLevel5 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel5.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.admin.UpdateCommand updateCommand6 = new fredboat.command.admin.UpdateCommand("", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = updateCommand6.getMinimumPerms();
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = updateCommand6.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand10 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = gitInfoCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand7 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand7 = new fredboat.command.fun.DanceCommand("\uD83D\uDCDD", str_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.messaging.internal.Context context7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = shuffleCommand6.help(context7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.util.MathCommand mathCommand8 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand10 = new fredboat.command.moderation.EnableCommandsCommand("", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand7 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.util.AvatarCommand avatarCommand8 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array5);
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
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.admin.EvalCommand evalCommand10 = new fredboat.command.admin.EvalCommand("hi!", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array7);
    fredboat.command.util.BrainfuckCommand brainfuckCommand12 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    int i0 = java.lang.Thread.NORM_PRIORITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 5);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    fredboat.agent.FredBoatAgent fredBoatAgent0 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.startNow(fredBoatAgent0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.command.music.seeking.RestartCommand restartCommand7 = new fredboat.command.music.seeking.RestartCommand("", str_array4);
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
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    fredboat.util.BrainfuckException brainfuckException1 = new fredboat.util.BrainfuckException("hi!");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException2 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)brainfuckException1);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("", (int)(short)-1, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    // The following exception was thrown during execution in test generation
    try {
    fredboat.commandmeta.init.MusicCommandInitializer.initCommands();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand4 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array3);
    fredboat.commandmeta.abs.CommandContext commandContext5 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand4.onInvoke(commandContext5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand7 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.maintenance.GetIdCommand getIdCommand8 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException0 = new fredboat.db.DatabaseNotReadyException();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    fredboat.util.ratelimit.Ratelimit.Scope scope0 = fredboat.util.ratelimit.Ratelimit.Scope.GUILD;
    org.junit.Assert.assertTrue("'" + scope0 + "' != '" + fredboat.util.ratelimit.Ratelimit.Scope.GUILD + "'", scope0.equals(fredboat.util.ratelimit.Ratelimit.Scope.GUILD));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand5 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext6 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand5.onInvoke(commandContext6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand7 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.util.ServerInfoCommand serverInfoCommand8 = new fredboat.command.util.ServerInfoCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array6);
    textCommand9.msg = "\u2757";
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = textCommand9.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array3);
    fredboat.command.maintenance.PingCommand pingCommand5 = new fredboat.command.maintenance.PingCommand("\u274C", str_array3);
    fredboat.messaging.internal.Context context6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = pingCommand5.help(context6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand7 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.util.AvatarCommand avatarCommand8 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array5);
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
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand5 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.command.admin.ExitCommand exitCommand6 = new fredboat.command.admin.ExitCommand("hi!", str_array4);
    java.util.List<java.lang.String> list_str7 = exitCommand6.aliases;
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = exitCommand6.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.reshuffle();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.admin.EvalCommand evalCommand10 = new fredboat.command.admin.EvalCommand("hi!", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = evalCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array6);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand10 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array6);
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
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.util.MathCommand mathCommand6 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    java.util.List<java.lang.String> list_str7 = mathCommand6.aliases;
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = mathCommand6.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", 1, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    fredboat.perms.PermissionLevel permissionLevel0 = fredboat.perms.PermissionLevel.BASE;
    org.junit.Assert.assertTrue("'" + permissionLevel0 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel0.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array3);
    fredboat.command.maintenance.PingCommand pingCommand5 = new fredboat.command.maintenance.PingCommand("\u274C", str_array3);
    fredboat.commandmeta.abs.CommandContext commandContext6 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand5.onInvoke(commandContext6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    int i0 = java.lang.Thread.MIN_PRIORITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array7);
    fredboat.command.util.BrainfuckCommand brainfuckCommand12 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = brainfuckCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
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
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand5 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.command.admin.ExitCommand exitCommand6 = new fredboat.command.admin.ExitCommand("hi!", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand6.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    fredboat.util.AsciiArtConstant asciiArtConstant0 = new fredboat.util.AsciiArtConstant();

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.admin.EvalCommand evalCommand10 = new fredboat.command.admin.EvalCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = evalCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = evalCommand10.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    simpleTrackProvider0.setShuffle(true);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.audio.queue.AudioTrackContext audioTrackContext5 = simpleTrackProvider0.getTrack(10000);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    fredboat.db.DatabaseManager databaseManager0 = null;
    fredboat.agent.DBConnectionWatchdogAgent dBConnectionWatchdogAgent1 = new fredboat.agent.DBConnectionWatchdogAgent(databaseManager0);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.startNow((fredboat.agent.FredBoatAgent)dBConnectionWatchdogAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    fredboat.util.rest.models.weather.CloudsOpenWeather cloudsOpenWeather0 = new fredboat.util.rest.models.weather.CloudsOpenWeather();
    cloudsOpenWeather0.setAll((int)(short)0);
    int i3 = cloudsOpenWeather0.getAll();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.StopCommand stopCommand9 = new fredboat.command.music.control.StopCommand("hi!", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    fredboat.audio.queue.PlaylistInfo.Source source4 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo5 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source4);
    fredboat.audio.queue.PlaylistInfo playlistInfo6 = new fredboat.audio.queue.PlaylistInfo(0, "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", source4);
    fredboat.audio.queue.PlaylistInfo.Source source9 = fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY;
    fredboat.audio.queue.PlaylistInfo playlistInfo10 = new fredboat.audio.queue.PlaylistInfo(100, "\u2757", source9);
    playlistInfo10.setTotalTracks((int)(short)0);
    fredboat.audio.queue.PlaylistInfo.Source source13 = playlistInfo10.getSource();
    fredboat.audio.queue.PlaylistInfo.Source source14 = playlistInfo10.getSource();
    playlistInfo6.setSource(source14);
    org.junit.Assert.assertTrue("'" + source4 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source4.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    org.junit.Assert.assertTrue("'" + source9 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source9.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    org.junit.Assert.assertTrue("'" + source13 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source13.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));
    org.junit.Assert.assertTrue("'" + source14 + "' != '" + fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY + "'", source14.equals(fredboat.audio.queue.PlaylistInfo.Source.SPOTIFY));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.admin.ExitCommand exitCommand7 = new fredboat.command.admin.ExitCommand("hi!", str_array5);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = setAvatarCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = setAvatarCommand8.getMinimumPerms();
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = setAvatarCommand8.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    patCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.command.admin.EvalCommand evalCommand16 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    java.lang.String[] str_array7 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand8 = new fredboat.command.fun.HugCommand("", "\u274C", str_array7);
    java.lang.String str9 = hugCommand8.getRandomImageUrl();
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = hugCommand8.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str9.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.command.admin.EvalCommand evalCommand16 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = evalCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.moderation.LanguageCommand languageCommand10 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = languageCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array3);
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array3);
    fredboat.perms.PermissionLevel permissionLevel6 = repeatCommand5.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel7 = repeatCommand5.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = repeatCommand5.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand5.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    org.junit.Assert.assertTrue("'" + permissionLevel6 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel6.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.command.util.CommandsCommand commandsCommand7 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array4);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = commandsCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.control.DestroyCommand destroyCommand7 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array4);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = destroyCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("hi!");
    fredboat.util.BrainfuckException brainfuckException4 = new fredboat.util.BrainfuckException("", (java.lang.Throwable)brainfuckException3);
    fredboat.commandmeta.MessagingException messagingException5 = new fredboat.commandmeta.MessagingException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException3);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException6 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)messagingException5);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.util.MathCommand mathCommand2 = new fredboat.command.util.MathCommand("Provided by OpenWeatherMap.org", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    java.lang.String str1 = openWeatherCurrent0.getLocation();
    java.lang.String str2 = openWeatherCurrent0.getFormattedDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str2.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array6);
    textCommand9.msg = "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...";
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = textCommand9.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array6);
    fredboat.command.music.seeking.ForwardCommand forwardCommand10 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
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
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = brainfuckCommand15.process("http://i.imgur.com/NqyOqnj.gif", context17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand7 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.maintenance.GetIdCommand getIdCommand8 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = getIdCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array3);
    fredboat.perms.PermissionLevel permissionLevel5 = nodeAdminCommand4.getMinimumPerms();
    java.lang.String str6 = permissionLevel5.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    org.junit.Assert.assertTrue("'" + permissionLevel5 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel5.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Bot Admin"+ "'", str6.equals("Bot Admin"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    fredboat.audio.queue.AudioTrackContext audioTrackContext4 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext5 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.add(audioTrackContext5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext4);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand14 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = unblacklistCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    java.lang.String[] str_array7 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand8 = new fredboat.command.fun.HugCommand("", "\u274C", str_array7);
    java.lang.String str9 = hugCommand8.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand8.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str9.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.info.ListCommand listCommand6 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array4);
    fredboat.command.maintenance.NodesCommand nodesCommand7 = new fredboat.command.maintenance.NodesCommand("", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodesCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.PauseCommand pauseCommand9 = new fredboat.command.music.control.PauseCommand("", str_array5);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = pauseCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\u2705", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = rollCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    fredboat.perms.PermissionLevel permissionLevel0 = fredboat.perms.PermissionLevel.DJ;
    int i1 = permissionLevel0.getLevel();
    org.junit.Assert.assertTrue("'" + permissionLevel0 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel0.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = shuffleCommand6.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand6.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand8 = new fredboat.command.maintenance.PingCommand("\u274C", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand9 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand10 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array6);
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
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    fredboat.util.Emojis emojis0 = new fredboat.util.Emojis();

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.moderation.LanguageCommand languageCommand6 = new fredboat.command.moderation.LanguageCommand("", str_array4);
    fredboat.command.music.control.UnpauseCommand unpauseCommand7 = new fredboat.command.music.control.UnpauseCommand("qua, 31 dez 1969, 09:00 PM", str_array4);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = unpauseCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand9 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array8);
    java.lang.String str10 = rollCommand9.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand9.onInvoke(commandContext11);
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
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand10 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    brainfuckCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.SeekCommand seekCommand12 = new fredboat.command.music.seeking.SeekCommand("\uD83D\uDCDD", str_array7);
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
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode1 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider0.setRepeatMode(repeatMode1);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext3 = simpleTrackProvider0.getAsListOrdered();
    simpleTrackProvider0.clear();
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.reshuffle();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + repeatMode1 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode1.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext3);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.util.MathCommand mathCommand7 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand8 = new fredboat.command.music.control.UnpauseCommand("", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = unpauseCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand2 = new fredboat.command.moderation.DisableCommandsCommand("\uD83D\uDCDD", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    java.lang.String[] str_array7 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand8 = new fredboat.command.fun.HugCommand("", "\u274C", str_array7);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = hugCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand9 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand9 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    playSplitCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    java.lang.String[] str_array7 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand8 = new fredboat.command.fun.HugCommand("", "\u274C", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "", str_array8);
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
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = testCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = testCommand15.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.maintenance.PingCommand pingCommand7 = new fredboat.command.maintenance.PingCommand("\u274C", str_array5);
    fredboat.command.music.control.DestroyCommand destroyCommand8 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array5);
    fredboat.command.music.control.DestroyCommand destroyCommand9 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array5);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = destroyCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array7);
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.StopCommand stopCommand9 = new fredboat.command.music.control.StopCommand("hi!", str_array5);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = stopCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand10 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = brainfuckCommand10.process("Bot Admin", context12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand13 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = disableCommandsCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = disableCommandsCommand13.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array6);
    fredboat.command.music.seeking.ForwardCommand forwardCommand10 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = forwardCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.command.fun.PatCommand patCommand13 = new fredboat.command.fun.PatCommand("", "", str_array8);
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
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.admin.ExitCommand exitCommand7 = new fredboat.command.admin.ExitCommand("hi!", str_array5);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = setAvatarCommand8.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = setAvatarCommand8.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand8.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.moderation.LanguageCommand languageCommand6 = new fredboat.command.moderation.LanguageCommand("", str_array4);
    fredboat.command.music.control.UnpauseCommand unpauseCommand7 = new fredboat.command.music.control.UnpauseCommand("qua, 31 dez 1969, 09:00 PM", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.util.MathCommand mathCommand6 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    java.util.List<java.lang.String> list_str7 = mathCommand6.aliases;
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    mathCommand6.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array7);
    java.lang.String str12 = textCommand11.msg;
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = textCommand11.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str12.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array6);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand10 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = gitInfoCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.AppInfo appInfo0 = fredboat.util.AppInfo.getAppInfo();
      org.junit.Assert.fail("Expected exception of type java.lang.ExceptionInInitializerError");
    } catch (java.lang.ExceptionInInitializerError e) {
      // Expected exception.
    }

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array7);
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = versionCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    simpleTrackProvider0.skipped();
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.reshuffle();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.control.DestroyCommand destroyCommand7 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array4);
    fredboat.perms.PermissionLevel permissionLevel8 = destroyCommand7.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand7.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array7);
    java.lang.String str12 = textCommand11.msg;
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand11.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str12.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.admin.UpdateCommand updateCommand6 = new fredboat.command.admin.UpdateCommand("", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand6.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.PauseCommand pauseCommand9 = new fredboat.command.music.control.PauseCommand("", str_array5);
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
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "https://i.imgur.com/YqZuqEB.jpg", "https://i.imgur.com/YqZuqEB.jpg", "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.ShuffleCommand shuffleCommand5 = new fredboat.command.music.control.ShuffleCommand("\u274C", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext6 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand5.onInvoke(commandContext6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("", str_array4);
    fredboat.command.music.control.LeaveCommand leaveCommand6 = new fredboat.command.music.control.LeaveCommand("hi!", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = leaveCommand6.getMinimumPerms();
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = leaveCommand6.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.TextCommand textCommand13 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.fun.FacedeskCommand facedeskCommand15 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("Provided by OpenWeatherMap.org", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = enableCommandsCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.PauseCommand pauseCommand9 = new fredboat.command.music.control.PauseCommand("", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = pauseCommand9.getMinimumPerms();
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = pauseCommand9.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("", str_array4);
    fredboat.command.music.control.LeaveCommand leaveCommand6 = new fredboat.command.music.control.LeaveCommand("hi!", str_array4);
    fredboat.messaging.internal.Context context7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = leaveCommand6.help(context7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode1 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider0.setRepeatMode(repeatMode1);
    fredboat.audio.queue.AudioTrackContext audioTrackContext3 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.add(audioTrackContext3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + repeatMode1 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode1.equals(fredboat.audio.queue.RepeatMode.SINGLE));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("", str_array4);
    fredboat.command.music.control.LeaveCommand leaveCommand6 = new fredboat.command.music.control.LeaveCommand("hi!", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = leaveCommand6.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand6.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
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
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array6);
    fredboat.command.music.seeking.ForwardCommand forwardCommand10 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.admin.ExitCommand exitCommand7 = new fredboat.command.admin.ExitCommand("hi!", str_array5);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = setAvatarCommand8.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand8.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array9);
    java.util.List<java.lang.String> list_str15 = facedeskCommand14.aliases;
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = facedeskCommand14.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = getIdCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = fredboat.agent.FredBoatAgent.getScheduler();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scheduledExecutorService0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.command.util.CommandsCommand commandsCommand7 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.admin.UpdateCommand updateCommand6 = new fredboat.command.admin.UpdateCommand("", str_array4);
    fredboat.messaging.internal.Context context7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = updateCommand6.help(context7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = botRestartCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.RewindCommand rewindCommand12 = new fredboat.command.music.seeking.RewindCommand("", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array9);
    java.util.List<java.lang.String> list_str15 = facedeskCommand14.aliases;
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand14.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str15);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand9 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array5);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = playSplitCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.admin.EvalCommand evalCommand10 = new fredboat.command.admin.EvalCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = evalCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = evalCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand10.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array7);
    java.lang.String str12 = textCommand11.msg;
    java.lang.String str13 = textCommand11.msg;
    textCommand11.msg = ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D";
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str12.equals("qua, 31 dez 1969, 09:00 PM"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str13.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.SeekCommand seekCommand12 = new fredboat.command.music.seeking.SeekCommand("\uD83D\uDCDD", str_array7);
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
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.util.MathCommand mathCommand7 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand8 = new fredboat.command.music.control.UnpauseCommand("", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = unpauseCommand8.getMinimumPerms();
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = unpauseCommand8.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.util.WeatherCommand weatherCommand12 = new fredboat.command.util.WeatherCommand(weather0, "Bot Admin", str_array8);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = weatherCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getUserId();
    uConfig0.setId("qua, 31 dez 1969, 09:00 PM");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    fredboat.perms.PermissionLevel permissionLevel0 = fredboat.perms.PermissionLevel.BOT_ADMIN;
    org.junit.Assert.assertTrue("'" + permissionLevel0 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel0.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand5 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.command.admin.ExitCommand exitCommand6 = new fredboat.command.admin.ExitCommand("hi!", str_array4);
    java.util.List<java.lang.String> list_str7 = exitCommand6.aliases;
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand6.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = brainfuckCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("https://i.imgur.com/YqZuqEB.jpg", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand13 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    fredboat.db.entity.UConfig uConfig5 = uConfig0.setBearerExpiration((long)(short)10);
    java.lang.String str6 = uConfig0.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.admin.UpdateCommand updateCommand6 = new fredboat.command.admin.UpdateCommand("", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel9 = updateCommand6.getMinimumPerms();
    java.lang.String str10 = permissionLevel9.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Bot Owner"+ "'", str10.equals("Bot Owner"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry0 = new fredboat.db.entity.BlacklistEntry();
    int i1 = blacklistEntry0.level;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.control.DestroyCommand destroyCommand7 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    boolean b2 = openWeatherCurrent0.isError();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(weatherMainOpenWeather1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.fun.CatgirlCommand catgirlCommand10 = new fredboat.command.fun.CatgirlCommand("hi!", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = catgirlCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    // The following exception was thrown during execution in test generation
    try {
    java.io.File file1 = fredboat.util.rest.CacheUtil.getImageFromURL("\u2757");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.admin.UpdateCommand updateCommand7 = new fredboat.command.admin.UpdateCommand("", str_array5);
    fredboat.command.fun.CatgirlCommand catgirlCommand8 = new fredboat.command.fun.CatgirlCommand("Bot Admin", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = catgirlCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = rewindCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.SeekCommand seekCommand12 = new fredboat.command.music.seeking.SeekCommand("\uD83D\uDCDD", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = seekCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    seekCommand12.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "https://i.imgur.com/YqZuqEB.jpg", "https://i.imgur.com/YqZuqEB.jpg", "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.ShuffleCommand shuffleCommand5 = new fredboat.command.music.control.ShuffleCommand("\u274C", str_array4);
    fredboat.messaging.internal.Context context6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = shuffleCommand5.help(context6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand12 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand14 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = restartCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = testCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    simpleTrackProvider0.setShuffle(true);
    fredboat.audio.queue.AudioTrackContext audioTrackContext4 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.add(audioTrackContext4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    fredboat.commandmeta.MessagingException messagingException1 = new fredboat.commandmeta.MessagingException("\uD83D\uDCDD");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException2 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)messagingException1);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand12 = new fredboat.command.fun.DanceCommand("", str_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    java.lang.String str4 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig6 = uConfig0.setRefresh("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org");
    java.lang.String str7 = uConfig6.getUserId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\u2705"+ "'", str4.equals("\u2705"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand11 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = botRestartCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.perms.PermissionLevel permissionLevel19 = stopCommand18.getMinimumPerms();
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = stopCommand18.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    fredboat.agent.StatsAgent.Action action2 = null;
    statsAgent1.addAction(action2);
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
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.ShuffleCommand shuffleCommand2 = new fredboat.command.music.control.ShuffleCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    fredboat.audio.queue.AudioTrackContext audioTrackContext4 = simpleTrackProvider0.provideAudioTrack();
    long long5 = simpleTrackProvider0.getDurationMillis();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 0L);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    simpleTrackProvider0.skipped();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext4 = simpleTrackProvider0.getTracksInRange(3000, 10);
    fredboat.audio.queue.AudioTrackContext audioTrackContext5 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.add(audioTrackContext5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext4);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("", str_array9);
    fredboat.command.admin.BotRestartCommand botRestartCommand16 = new fredboat.command.admin.BotRestartCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.getId();
    blacklistEntry1.setLevel(0);
    blacklistEntry1.setRateLimitReached((int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    blacklistEntry1.setId("https://i.imgur.com/YqZuqEB.jpg");
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
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.admin.BotRestartCommand botRestartCommand5 = new fredboat.command.admin.BotRestartCommand("\u2705", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext6 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand5.onInvoke(commandContext6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.maintenance.GetIdCommand getIdCommand9 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand10 = new fredboat.command.maintenance.GitInfoCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
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
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.admin.UpdateCommand updateCommand7 = new fredboat.command.admin.UpdateCommand("", str_array5);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand8 = new fredboat.command.moderation.DisableCommandsCommand("en_US", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array6);
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
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.control.DestroyCommand destroyCommand7 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array4);
    fredboat.perms.PermissionLevel permissionLevel8 = destroyCommand7.getMinimumPerms();
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = destroyCommand7.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand7 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.JoinCommand joinCommand8 = new fredboat.command.music.control.JoinCommand("\uD83D\uDCDD", str_array5);
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = joinCommand8.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.control.StopCommand stopCommand7 = new fredboat.command.music.control.StopCommand("\u274C", str_array4);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = stopCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.moderation.LanguageCommand languageCommand11 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array7);
    fredboat.command.moderation.LanguageCommand languageCommand12 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = languageCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.fun.CatgirlCommand catgirlCommand10 = new fredboat.command.fun.CatgirlCommand("hi!", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.maintenance.NodesCommand nodesCommand8 = new fredboat.command.maintenance.NodesCommand("", str_array5);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand9 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array5);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = enableCommandsCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.info.ListCommand listCommand6 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array4);
    fredboat.command.maintenance.NodesCommand nodesCommand7 = new fredboat.command.maintenance.NodesCommand("", str_array4);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = nodesCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand13 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array8);
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
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand15 = new fredboat.command.util.ServerInfoCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand16 = new fredboat.command.fun.DanceCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.maintenance.PingCommand pingCommand9 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    pingCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.seeking.RestartCommand restartCommand14 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array8);
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
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "Bot Admin", str_array9);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = stopCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.command.music.seeking.RestartCommand restartCommand7 = new fredboat.command.music.seeking.RestartCommand("", str_array4);
    java.util.List<java.lang.String> list_str8 = restartCommand7.aliases;
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = configCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = brainfuckCommand15.process("", context17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("en_US", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

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
    commandsCommand20.onInvoke(commandContext22);
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
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = facedeskCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather0.setMain(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherOpenWeather0.setMain("Provided by OpenWeatherMap.org");
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array11);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand16 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather0, languageCommand15);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = languageCommand15.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    fredboat.util.rest.APILimitException aPILimitException1 = new fredboat.util.rest.APILimitException("hi!");
    java.lang.Throwable throwable2 = null;
    // The following exception was thrown during execution in test generation
    try {
    aPILimitException1.addSuppressed(throwable2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.music.info.HistoryCommand historyCommand15 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
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
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.info.ListCommand listCommand8 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.NodesCommand nodesCommand9 = new fredboat.command.maintenance.NodesCommand("", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand10 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = setAvatarCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    java.lang.String[] str_array7 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand8 = new fredboat.command.fun.HugCommand("", "\u274C", str_array7);
    java.lang.String str9 = hugCommand8.getRandomImageUrl();
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = hugCommand8.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "http://i.imgur.com/NqyOqnj.gif"+ "'", str9.equals("http://i.imgur.com/NqyOqnj.gif"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = simpleTrackProvider0.getTrack((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand6 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand7 = new fredboat.command.music.control.ReshuffleCommand("fredboat.util.BrainfuckException: \u2705", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    int i2 = simpleTrackProvider0.size();
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext3 = simpleTrackProvider0.getAsListOrdered();
    int i4 = simpleTrackProvider0.size();
    fredboat.audio.queue.AudioTrackContext audioTrackContext5 = null;
    boolean b6 = simpleTrackProvider0.remove(audioTrackContext5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params12 = fredboat.util.rest.Http.Params.of(str_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.PauseCommand pauseCommand9 = new fredboat.command.music.control.PauseCommand("", str_array5);
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
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.util.WeatherCommand weatherCommand12 = new fredboat.command.util.WeatherCommand(weather0, "Bot Admin", str_array8);
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
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array10);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array10);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("en_US", str_array10);
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
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand5 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.command.music.control.UnpauseCommand unpauseCommand6 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array4);
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
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\u2705", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand6 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand7 = new fredboat.command.music.control.ReshuffleCommand("fredboat.util.BrainfuckException: \u2705", str_array5);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = reshuffleCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.id;
    blacklistEntry1.setRateLimitReached((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand14 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array9);
    fredboat.command.moderation.ConfigCommand configCommand15 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array9);
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = configCommand15.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather0.setMain(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherOpenWeather0.setMain("Provided by OpenWeatherMap.org");
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand16 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand17 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand18 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather0, languageCommand17);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand17.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.control.DestroyCommand destroyCommand7 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array4);
    fredboat.perms.PermissionLevel permissionLevel8 = destroyCommand7.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel9 = destroyCommand7.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand7.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "Bot Admin", str_array9);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand("", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array8);
    fredboat.perms.PermissionLevel permissionLevel15 = rewindCommand14.getMinimumPerms();
    int i16 = permissionLevel15.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array3);
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array3);
    fredboat.perms.PermissionLevel permissionLevel6 = repeatCommand5.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel7 = repeatCommand5.getMinimumPerms();
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = repeatCommand5.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    org.junit.Assert.assertTrue("'" + permissionLevel6 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel6.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.admin.UpdateCommand updateCommand6 = new fredboat.command.admin.UpdateCommand("", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel9 = updateCommand6.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand6.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.info.HistoryCommand historyCommand7 = new fredboat.command.music.info.HistoryCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    java.util.List<java.lang.String> list_str8 = historyCommand7.aliases;
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = historyCommand7.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.admin.ExitCommand exitCommand7 = new fredboat.command.admin.ExitCommand("hi!", str_array5);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand8 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.seeking.RewindCommand rewindCommand2 = new fredboat.command.music.seeking.RewindCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array5);
    fredboat.command.admin.UpdateCommand updateCommand7 = new fredboat.command.admin.UpdateCommand("", str_array5);
    fredboat.command.fun.CatgirlCommand catgirlCommand8 = new fredboat.command.fun.CatgirlCommand("Bot Admin", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand10 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = commandsCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array7);
    fredboat.command.util.BrainfuckCommand brainfuckCommand12 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = brainfuckCommand12.process(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", context14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.util.AvatarCommand avatarCommand8 = new fredboat.command.util.AvatarCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
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
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("hi!", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = listCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.admin.UpdateCommand updateCommand9 = new fredboat.command.admin.UpdateCommand("", str_array7);
    fredboat.command.fun.CatgirlCommand catgirlCommand10 = new fredboat.command.fun.CatgirlCommand("Bot Admin", str_array7);
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand("\u2705", str_array7);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand("", str_array7);
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
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "Bot Admin", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("DJ", str_array9);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = getIdCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.admin.UpdateCommand updateCommand8 = new fredboat.command.admin.UpdateCommand("", str_array6);
    fredboat.command.fun.CatgirlCommand catgirlCommand9 = new fredboat.command.fun.CatgirlCommand("Bot Admin", str_array6);
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand("\u2705", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    simpleTrackProvider0.skipped();
    fredboat.audio.queue.RepeatMode repeatMode5 = simpleTrackProvider0.getRepeatMode();
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.reshuffle();
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(audioTrackContext1);
    org.junit.Assert.assertTrue("'" + repeatMode5 + "' != '" + fredboat.audio.queue.RepeatMode.OFF + "'", repeatMode5.equals(fredboat.audio.queue.RepeatMode.OFF));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array8);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
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
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.SeekCommand seekCommand12 = new fredboat.command.music.seeking.SeekCommand("\uD83D\uDCDD", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = seekCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = seekCommand12.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand4 = new fredboat.command.music.control.RepeatCommand("", str_array3);
    fredboat.perms.PermissionLevel permissionLevel5 = repeatCommand4.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel6 = repeatCommand4.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand4.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    org.junit.Assert.assertTrue("'" + permissionLevel5 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel5.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel6 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel6.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    blacklistEntry1.setBlacklistedTimestamp((long)(short)-1);
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    blacklistEntry1.setLevel((int)(byte)1);
    long long9 = blacklistEntry1.getBlacklistedTimestamp();
    blacklistEntry1.setLevel(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == (-1L));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("https://i.imgur.com/YqZuqEB.jpg", str_array8);
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
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array8);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand11 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array8);
    fredboat.command.fun.RollCommand rollCommand12 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    rollCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand2 = new fredboat.command.moderation.EnableCommandsCommand("\u2757", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand7 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.JoinCommand joinCommand8 = new fredboat.command.music.control.JoinCommand("\uD83D\uDCDD", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.seeking.RewindCommand rewindCommand12 = new fredboat.command.music.seeking.RewindCommand("", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = rewindCommand12.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand12.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.music.info.ListCommand listCommand11 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand13 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.PauseCommand pauseCommand14 = new fredboat.command.music.control.PauseCommand("", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = pauseCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand15 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array11);
    fredboat.command.fun.FacedeskCommand facedeskCommand16 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand17 = new fredboat.command.moderation.EnableCommandsCommand("Provided by OpenWeatherMap.org", str_array11);
    fredboat.command.music.info.ListCommand listCommand18 = new fredboat.command.music.info.ListCommand("hi!", str_array11);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = listCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setHumidity((int)(byte)100);
    int i5 = weatherMainOpenWeather0.getPressure();
    weatherMainOpenWeather0.setTempMax((double)10L);
    weatherMainOpenWeather0.setTemp((double)0L);
    double d10 = weatherMainOpenWeather0.getTemp();
    weatherMainOpenWeather0.setPressure(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array6);
    textCommand9.msg = "\u2757";
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand9.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.moderation.LanguageCommand languageCommand6 = new fredboat.command.moderation.LanguageCommand("", str_array4);
    fredboat.command.music.control.UnpauseCommand unpauseCommand7 = new fredboat.command.music.control.UnpauseCommand("qua, 31 dez 1969, 09:00 PM", str_array4);
    fredboat.perms.PermissionLevel permissionLevel8 = unpauseCommand7.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand7.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.util.MathCommand mathCommand8 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("", str_array6);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = exitCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.util.BrainfuckCommand brainfuckCommand2 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.AudioTrackContext audioTrackContext1 = simpleTrackProvider0.provideAudioTrack();
    fredboat.audio.queue.AudioTrackContext audioTrackContext2 = null;
    simpleTrackProvider0.setLastTrack(audioTrackContext2);
    java.lang.Long[] long_array5 = new java.lang.Long[] { 1531609931147L };
    java.util.ArrayList<java.lang.Long> arraylist_long6 = new java.util.ArrayList<java.lang.Long>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>)arraylist_long6, long_array5);
    simpleTrackProvider0.removeAllById((java.util.Collection<java.lang.Long>)arraylist_long6);
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
    org.junit.Assert.assertNotNull(long_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("en_US", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.control.DestroyCommand destroyCommand7 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array4);
    fredboat.perms.PermissionLevel permissionLevel8 = destroyCommand7.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel9 = destroyCommand7.getMinimumPerms();
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = destroyCommand7.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    fredboat.commandmeta.init.MusicCommandInitializer musicCommandInitializer0 = new fredboat.commandmeta.init.MusicCommandInitializer();

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "Bot Admin", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand14 = new fredboat.command.maintenance.GetIdCommand("DJ", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    java.lang.String str4 = uConfig0.getRefresh();
    java.lang.String str5 = uConfig0.getRefresh();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(uConfig3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand("", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = rewindCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand13 = new fredboat.command.admin.ReviveCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = reviveCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = reviveCommand13.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array7);
    java.lang.String str12 = textCommand11.msg;
    java.lang.String str13 = textCommand11.msg;
    textCommand11.msg = "\u274C";
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand11.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str12.equals("qua, 31 dez 1969, 09:00 PM"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str13.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand16 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
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
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand12 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array8);
    fredboat.command.util.CommandsCommand commandsCommand14 = new fredboat.command.util.CommandsCommand("hi!", str_array8);
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

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand16 = new fredboat.command.util.BrainfuckCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand17 = new fredboat.command.moderation.LanguageCommand("\uD83D\uDCDD", str_array10);
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
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand8 = new fredboat.command.maintenance.PingCommand("\u274C", str_array6);
    fredboat.command.music.control.DestroyCommand destroyCommand9 = new fredboat.command.music.control.DestroyCommand("\u2757", str_array6);
    fredboat.command.util.WeatherCommand weatherCommand10 = new fredboat.command.util.WeatherCommand(weather0, ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = weatherCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("en_US", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("\u274C", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    fredboat.audio.queue.RepeatMode repeatMode1 = fredboat.audio.queue.RepeatMode.SINGLE;
    simpleTrackProvider0.setRepeatMode(repeatMode1);
    java.util.List<fredboat.audio.queue.AudioTrackContext> list_audioTrackContext3 = simpleTrackProvider0.getAsListOrdered();
    int i4 = simpleTrackProvider0.streamsCount();
    org.junit.Assert.assertTrue("'" + repeatMode1 + "' != '" + fredboat.audio.queue.RepeatMode.SINGLE + "'", repeatMode1.equals(fredboat.audio.queue.RepeatMode.SINGLE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_audioTrackContext3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand6 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand7 = new fredboat.command.music.control.ReshuffleCommand("fredboat.util.BrainfuckException: \u2705", str_array5);
    fredboat.perms.PermissionLevel permissionLevel8 = reshuffleCommand7.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand7.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.ExitCommand exitCommand2 = new fredboat.command.admin.ExitCommand("qua, 31 dez 1969, 09:00 PM", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.util.MathCommand mathCommand8 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("", str_array6);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = exitCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand10.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array7);
    fredboat.command.music.control.JoinCommand joinCommand12 = new fredboat.command.music.control.JoinCommand("\u2705", str_array7);
    fredboat.perms.PermissionLevel permissionLevel13 = joinCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = joinCommand12.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand11 = new fredboat.command.moderation.EnableCommandsCommand("", str_array7);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("fredboat.util.BrainfuckException: \u2705", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("hi!", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    listCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.maintenance.PingCommand pingCommand6 = new fredboat.command.maintenance.PingCommand("\u274C", str_array4);
    fredboat.command.music.info.HistoryCommand historyCommand7 = new fredboat.command.music.info.HistoryCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    historyCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\u2705", str_array10);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand17 = new fredboat.command.fun.DanceCommand("qua, 31 dez 1969, 09:00 PM", str_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("\uD83D\uDEAA", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = joinCommand16.getMinimumPerms();
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = joinCommand16.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    int i2 = blacklistEntry1.getRateLimitReached();
    int i3 = blacklistEntry1.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand5 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.command.admin.ExitCommand exitCommand6 = new fredboat.command.admin.ExitCommand("hi!", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = exitCommand6.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand6.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.util.MathCommand mathCommand8 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("", str_array6);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand10 = new fredboat.command.moderation.EnableCommandsCommand("", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = enableCommandsCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand10 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.fun.FacedeskCommand facedeskCommand11 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array7);
    java.io.File file12 = facedeskCommand11.getRandomFile();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = facedeskCommand11.help(context13);
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
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("en_US", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = unblacklistCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand13 = new fredboat.command.admin.ReviveCommand("", str_array8);
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
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand("", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array8);
    fredboat.perms.PermissionLevel permissionLevel15 = rewindCommand14.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = rewindCommand14.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    fredboat.util.GitRepoState gitRepoState0 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str1 = gitRepoState0.commitMessageShort;
    java.lang.String str2 = gitRepoState0.commitUserName;
    java.lang.String str3 = gitRepoState0.commitId;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gitRepoState0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array10);
    fredboat.command.util.MathCommand mathCommand18 = new fredboat.command.util.MathCommand("Bot Owner", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = mathCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.PlaySplitCommand playSplitCommand2 = new fredboat.command.music.control.PlaySplitCommand("https://i.imgur.com/YqZuqEB.jpg", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.music.control.JoinCommand joinCommand16 = new fredboat.command.music.control.JoinCommand("\uD83D\uDEAA", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = joinCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

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
    fredboat.audio.queue.AudioTrackContext audioTrackContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.add(audioTrackContext15);
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
    org.junit.Assert.assertNotNull(list_audioTrackContext13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand9 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand11 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.fun.FacedeskCommand facedeskCommand13 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array8);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = facedeskCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2705", str_array7);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = serverInfoCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("", str_array4);
    fredboat.command.music.control.LeaveCommand leaveCommand6 = new fredboat.command.music.control.LeaveCommand("hi!", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = leaveCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = leaveCommand6.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand6.onInvoke(commandContext9);
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
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.StopCommand stopCommand9 = new fredboat.command.music.control.StopCommand("hi!", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = stopCommand9.getMinimumPerms();
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = stopCommand9.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

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
    fredboat.perms.PermissionLevel permissionLevel22 = rewindCommand12.getMinimumPerms();
    fredboat.messaging.internal.Context context23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = rewindCommand12.help(context23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    org.junit.Assert.assertTrue("'" + permissionLevel22 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel22.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.util.MathCommand mathCommand8 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("", str_array6);
    fredboat.command.admin.ExitCommand exitCommand10 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = exitCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = exitCommand10.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.admin.BotRestartCommand botRestartCommand12 = new fredboat.command.admin.BotRestartCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
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
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

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
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = disableCommandsCommand18.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel19 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel19.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    enableCommandsCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array9);
    fredboat.command.music.control.RepeatCommand repeatCommand15 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("Bot Admin", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = restartCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand5 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.command.music.control.UnpauseCommand unpauseCommand6 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    unpauseCommand6.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.seeking.RestartCommand restartCommand8 = new fredboat.command.music.seeking.RestartCommand("", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array5);
    fredboat.perms.PermissionLevel permissionLevel10 = shuffleCommand9.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand9.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    fredboat.util.rest.models.weather.OpenWeatherCurrent openWeatherCurrent0 = new fredboat.util.rest.models.weather.OpenWeatherCurrent();
    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather1 = openWeatherCurrent0.getMain();
    java.lang.String str2 = openWeatherCurrent0.getDataProviderString();
    int i3 = openWeatherCurrent0.getCode();
    int i4 = openWeatherCurrent0.getDatetime();
    java.lang.String str5 = openWeatherCurrent0.getDataProviderString();
    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode6 = openWeatherCurrent0.errorType();
    
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
    org.junit.Assert.assertTrue("'" + errorCode6 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode6.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    fredboat.util.BrainfuckException brainfuckException1 = new fredboat.util.BrainfuckException("\u2757");

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    // The following exception was thrown during execution in test generation
    try {
    java.io.File file1 = fredboat.util.rest.CacheUtil.getImageFromURL("\uD83D\uDEAA");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand11 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array7);
    fredboat.command.util.BrainfuckCommand brainfuckCommand12 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = brainfuckCommand12.process("DJ", context14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand4 = new fredboat.command.music.control.RepeatCommand("", str_array3);
    fredboat.perms.PermissionLevel permissionLevel5 = repeatCommand4.getMinimumPerms();
    fredboat.messaging.internal.Context context6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = repeatCommand4.help(context6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    org.junit.Assert.assertTrue("'" + permissionLevel5 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel5.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.music.seeking.RestartCommand restartCommand9 = new fredboat.command.music.seeking.RestartCommand("", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand("hi!", str_array6);
    fredboat.command.music.control.LeaveCommand leaveCommand11 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array6);
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = leaveCommand11.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array7);
    java.lang.String str12 = textCommand11.msg;
    java.lang.String str13 = textCommand11.msg;
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand11.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str12.equals("qua, 31 dez 1969, 09:00 PM"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str13.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array7);
    fredboat.command.music.seeking.ForwardCommand forwardCommand11 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.LeaveCommand leaveCommand12 = new fredboat.command.music.control.LeaveCommand("Bot Admin", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array10);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

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
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    blacklistEntry1.setBlacklistedTimestamp((long)(short)-1);
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    blacklistEntry1.setLevel((int)(byte)1);
    blacklistEntry1.setBlacklistedTimestamp(1531609936760L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == (-1L));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    int i4 = blacklistEntry1.getRateLimitReached();
    long long5 = blacklistEntry1.getRateLimitReachedTimestamp();
    long long6 = blacklistEntry1.rateLimitReachedTimestamp;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 100L);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.util.WeatherCommand weatherCommand13 = new fredboat.command.util.WeatherCommand(weather1, "Bot Admin", str_array9);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.perms.PermissionLevel permissionLevel15 = stopCommand14.getMinimumPerms();
    fredboat.messaging.internal.Context context16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = stopCommand14.help(context16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel15 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel15.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    fredboat.util.rest.Weather weather1 = null;
    java.lang.String[] str_array12 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand13 = new fredboat.command.music.control.RepeatCommand("", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array12);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand15 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array12);
    fredboat.command.fun.RollCommand rollCommand16 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand17 = new fredboat.command.music.control.ShuffleCommand("DJ", str_array12);
    fredboat.command.util.WeatherCommand weatherCommand18 = new fredboat.command.util.WeatherCommand(weather1, "\uD83D\uDEAA", str_array12);
    fredboat.command.music.control.LeaveCommand leaveCommand19 = new fredboat.command.music.control.LeaveCommand("qua, 31 dez 1969, 09:00 PM", str_array12);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params20 = fredboat.util.rest.Http.Params.of(str_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.admin.EvalCommand evalCommand10 = new fredboat.command.admin.EvalCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = evalCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = evalCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = evalCommand10.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand6 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand7 = new fredboat.command.music.control.ReshuffleCommand("fredboat.util.BrainfuckException: \u2705", str_array5);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params8 = fredboat.util.rest.Http.Params.of(str_array5);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.fun.TextCommand textCommand9 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("http://i.imgur.com/NqyOqnj.gif", 5, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array3);
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array3);
    fredboat.perms.PermissionLevel permissionLevel6 = repeatCommand5.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel7 = repeatCommand5.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    repeatCommand5.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    org.junit.Assert.assertTrue("'" + permissionLevel6 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel6.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.music.control.PlaySplitCommand playSplitCommand10 = new fredboat.command.music.control.PlaySplitCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand11 = new fredboat.command.util.CommandsCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    commandsCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\u274C", str_array7);
    java.lang.String str12 = textCommand11.msg;
    java.lang.String str13 = textCommand11.msg;
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = textCommand11.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str12.equals("qua, 31 dez 1969, 09:00 PM"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "qua, 31 dez 1969, 09:00 PM"+ "'", str13.equals("qua, 31 dez 1969, 09:00 PM"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand4 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array3);
    fredboat.perms.PermissionLevel permissionLevel5 = nodeAdminCommand4.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel6 = nodeAdminCommand4.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel7 = nodeAdminCommand4.getMinimumPerms();
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = nodeAdminCommand4.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    org.junit.Assert.assertTrue("'" + permissionLevel5 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel5.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel6 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel6.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.command.music.seeking.RestartCommand restartCommand7 = new fredboat.command.music.seeking.RestartCommand("", str_array4);
    java.util.List<java.lang.String> list_str8 = restartCommand7.aliases;
    fredboat.perms.PermissionLevel permissionLevel9 = restartCommand7.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = restartCommand7.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    restartCommand7.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand11 = new fredboat.command.admin.UnblacklistCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.AvatarCommand avatarCommand9 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.util.BrainfuckCommand brainfuckCommand10 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = brainfuckCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.music.seeking.ForwardCommand forwardCommand17 = new fredboat.command.music.seeking.ForwardCommand("\u274C", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array4);
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
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather0.setMain(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherOpenWeather0.setMain("Provided by OpenWeatherMap.org");
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand14 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.moderation.LanguageCommand languageCommand15 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array11);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand16 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather0, languageCommand15);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setHumidity((int)(byte)100);
    int i5 = weatherMainOpenWeather0.getPressure();
    weatherMainOpenWeather0.setTempMax((double)10L);
    double d8 = weatherMainOpenWeather0.getTemp();
    weatherMainOpenWeather0.setPressure(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand15 = new fredboat.command.music.control.PauseCommand("", str_array9);
    fredboat.command.admin.ReviveCommand reviveCommand16 = new fredboat.command.admin.ReviveCommand("hi!", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    int i5 = blacklistEntry1.getLevel();
    long long6 = blacklistEntry1.getBlacklistedTimestamp();
    int i7 = blacklistEntry1.level;
    blacklistEntry1.setRateLimitReached((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 1531609955167L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    fredboat.util.BrainfuckException brainfuckException2 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    java.lang.Throwable[] throwable_array3 = brainfuckException2.getSuppressed();
    fredboat.commandmeta.MessagingException messagingException4 = new fredboat.commandmeta.MessagingException("DJ", (java.lang.Throwable)brainfuckException2);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException5 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)messagingException4);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array3);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.util.CommandsCommand commandsCommand8 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.PauseCommand pauseCommand9 = new fredboat.command.music.control.PauseCommand("", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    pauseCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "https://i.imgur.com/YqZuqEB.jpg", "https://i.imgur.com/YqZuqEB.jpg", "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand("\u274C", str_array5);
    fredboat.command.music.seeking.RewindCommand rewindCommand7 = new fredboat.command.music.seeking.RewindCommand("\uD83D\uDCDD", str_array5);
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = rewindCommand7.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    // The following exception was thrown during execution in test generation
    try {
    java.io.File file1 = fredboat.util.rest.CacheUtil.getImageFromURL("");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = unblacklistCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = unblacklistCommand15.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    java.lang.String[] str_array12 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array12);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.fun.TextCommand textCommand15 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array12);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array12);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand17 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array12);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array12);
    fredboat.command.fun.HugCommand hugCommand19 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array12);
    fredboat.command.music.control.DestroyCommand destroyCommand20 = new fredboat.command.music.control.DestroyCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    fredboat.util.rest.models.weather.WeatherMainOpenWeather weatherMainOpenWeather0 = new fredboat.util.rest.models.weather.WeatherMainOpenWeather();
    weatherMainOpenWeather0.setTempMin((double)(short)10);
    weatherMainOpenWeather0.setTempMax((double)0);
    int i5 = weatherMainOpenWeather0.getHumidity();
    weatherMainOpenWeather0.setTempMin((double)1531609931147L);
    weatherMainOpenWeather0.setPressure(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.maintenance.GetIdCommand getIdCommand9 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand10 = new fredboat.command.maintenance.GitInfoCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = gitInfoCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    fredboat.db.DatabaseManager databaseManager0 = null;
    fredboat.agent.DBConnectionWatchdogAgent dBConnectionWatchdogAgent1 = new fredboat.agent.DBConnectionWatchdogAgent(databaseManager0);
    dBConnectionWatchdogAgent1.run();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.startNow((fredboat.agent.FredBoatAgent)dBConnectionWatchdogAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    gitInfoCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand10 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.fun.FacedeskCommand facedeskCommand11 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand10 = new fredboat.command.moderation.DisableCommandsCommand("", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.control.UnpauseCommand unpauseCommand13 = new fredboat.command.music.control.UnpauseCommand("", str_array10);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("", str_array10);
    fredboat.command.music.seeking.RewindCommand rewindCommand16 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand17 = new fredboat.command.maintenance.VersionCommand("en_US", str_array10);
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
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    fredboat.db.DatabaseManager databaseManager0 = null;
    fredboat.agent.DBConnectionWatchdogAgent dBConnectionWatchdogAgent1 = new fredboat.agent.DBConnectionWatchdogAgent(databaseManager0);
    dBConnectionWatchdogAgent1.doRun();
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.startNow((fredboat.agent.FredBoatAgent)dBConnectionWatchdogAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand2 = new fredboat.command.maintenance.GitInfoCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

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
    java.util.List<java.lang.String> list_str19 = null;
    // The following exception was thrown during execution in test generation
    try {
    guildPermissions0.setDjList(list_str19);
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

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array10);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array10);
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = textCommand12.help(context13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array10);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array10);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("en_US", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = disableCommandsCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    java.lang.String str0 = fredboat.util.AsciiArtConstant.DOG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)"+ "'", str0.equals("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array10);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand17 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    reshuffleCommand17.onInvoke(commandContext18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\u2705", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = listCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand14 = new fredboat.command.moderation.EnableCommandsCommand("\u2705", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand15 = new fredboat.command.maintenance.GetIdCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    getIdCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand13 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = disableCommandsCommand13.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel15 = disableCommandsCommand13.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    disableCommandsCommand13.onInvoke(commandContext16);
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
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array9);
    fredboat.command.moderation.LanguageCommand languageCommand14 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("\u2757", str_array9);
    fredboat.command.fun.CatgirlCommand catgirlCommand16 = new fredboat.command.fun.CatgirlCommand("", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    catgirlCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array8);
    fredboat.command.music.control.RepeatCommand repeatCommand14 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = repeatCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    java.lang.String[] str_array8 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand9 = new fredboat.command.fun.HugCommand("", "\u274C", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.messaging.internal.Context context11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = serverInfoCommand10.help(context11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.util.MathCommand mathCommand8 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand9 = new fredboat.command.music.control.UnpauseCommand("", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand10 = new fredboat.command.admin.SetAvatarCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    setAvatarCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

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
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather0.setMain(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D");
    weatherOpenWeather0.setMain("Provided by OpenWeatherMap.org");
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array12);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("hi!", str_array12);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand15 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand16 = new fredboat.command.moderation.LanguageCommand("\u2757", str_array12);
    fredboat.command.moderation.LanguageCommand languageCommand17 = new fredboat.command.moderation.LanguageCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array12);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand18 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather0, languageCommand17);
    int i19 = weatherOpenWeather0.getId();
    java.lang.String str20 = weatherOpenWeather0.getIcon();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("Provided by OpenWeatherMap.org", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.maintenance.GetIdCommand getIdCommand12 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand13 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array9);
    fredboat.command.fun.HugCommand hugCommand14 = new fredboat.command.fun.HugCommand("Bot Owner", "Bot Admin", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    hugCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.maintenance.GetIdCommand getIdCommand9 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand("DJ", str_array6);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.RepeatCommand repeatCommand2 = new fredboat.command.music.control.RepeatCommand("\uD83D\uDEAA", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("\uD83D\uDEAA", (int)(byte)-1, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand10 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.fun.FacedeskCommand facedeskCommand11 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array7);
    java.io.File file12 = facedeskCommand11.getRandomFile();
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = facedeskCommand11.help(context13);
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
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array10);
    fredboat.command.admin.EvalCommand evalCommand17 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array10);
    fredboat.command.moderation.LanguageCommand languageCommand18 = new fredboat.command.moderation.LanguageCommand("hi!", str_array10);
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
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.command.music.seeking.RestartCommand restartCommand7 = new fredboat.command.music.seeking.RestartCommand("", str_array4);
    java.util.List<java.lang.String> list_str8 = restartCommand7.aliases;
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode errorCode0 = fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR;
    fredboat.util.rest.models.weather.WeatherError weatherError1 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    fredboat.util.rest.models.weather.WeatherError weatherError2 = new fredboat.util.rest.models.weather.WeatherError(errorCode0);
    java.lang.String str3 = weatherError2.getTemperature();
    java.lang.String str4 = weatherError2.getLocation();
    org.junit.Assert.assertTrue("'" + errorCode0 + "' != '" + fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR + "'", errorCode0.equals(fredboat.util.rest.models.weather.RetrievedWeather.ErrorCode.NO_ERROR));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.util.MathCommand mathCommand9 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("", str_array7);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2705", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand12.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand5 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.command.admin.ExitCommand exitCommand6 = new fredboat.command.admin.ExitCommand("hi!", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = exitCommand6.getMinimumPerms();
    fredboat.messaging.internal.Context context8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = exitCommand6.help(context8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.music.control.LeaveCommand leaveCommand7 = new fredboat.command.music.control.LeaveCommand("hi!", str_array5);
    fredboat.command.moderation.LanguageCommand languageCommand8 = new fredboat.command.moderation.LanguageCommand("DJ", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("fredboat.util.BrainfuckException: ", (int)(short)100, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.util.ServerInfoCommand serverInfoCommand14 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array11);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand18 = new fredboat.command.music.control.JoinCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("\u2757", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand20 = new fredboat.command.music.control.JoinCommand("fredboat.util.BrainfuckException: \u2705", str_array11);
    fredboat.messaging.internal.Context context21 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = joinCommand20.help(context21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array4);
    fredboat.command.music.seeking.RestartCommand restartCommand7 = new fredboat.command.music.seeking.RestartCommand("", str_array4);
    java.util.List<java.lang.String> list_str8 = restartCommand7.aliases;
    fredboat.perms.PermissionLevel permissionLevel9 = restartCommand7.getMinimumPerms();
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = restartCommand7.help(context10);
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
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = unblacklistCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = unblacklistCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext18 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand15.onInvoke(commandContext18);
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
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand6 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand7 = new fredboat.command.music.control.ReshuffleCommand("fredboat.util.BrainfuckException: \u2705", str_array5);
    fredboat.perms.PermissionLevel permissionLevel8 = reshuffleCommand7.getMinimumPerms();
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = reshuffleCommand7.help(context9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    fredboat.util.GitRepoState gitRepoState1 = new fredboat.util.GitRepoState("fredboat.util.BrainfuckException: \u2705");
    java.lang.String str2 = gitRepoState1.commitUserEmail;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.command.admin.EvalCommand evalCommand16 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array9);
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
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
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
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\u2705", str_array9);
    java.io.File file16 = rollCommand15.getRandomFile();
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = rollCommand15.help(context17);
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
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.admin.UpdateCommand updateCommand6 = new fredboat.command.admin.UpdateCommand("", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel9 = updateCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel10 = updateCommand6.getMinimumPerms();
    int i11 = permissionLevel10.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel8 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel8.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel10 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel10.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 5);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

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
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params23 = fredboat.util.rest.Http.Params.of(str_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.music.control.LeaveCommand leaveCommand9 = new fredboat.command.music.control.LeaveCommand("https://i.imgur.com/YqZuqEB.jpg", str_array5);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = leaveCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.util.BrainfuckCommand brainfuckCommand15 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.music.seeking.RestartCommand restartCommand16 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array10);
    fredboat.command.maintenance.GetIdCommand getIdCommand17 = new fredboat.command.maintenance.GetIdCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("http://i.imgur.com/NqyOqnj.gif", str_array10);
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = stopCommand18.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.info.ListCommand listCommand2 = new fredboat.command.music.info.ListCommand("Bot Admin", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    weatherOpenWeather0.setDescription("");
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array13);
    fredboat.command.music.info.ListCommand listCommand16 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array13);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand17 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array13);
    fredboat.command.util.BrainfuckCommand brainfuckCommand18 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.music.seeking.RestartCommand restartCommand19 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array13);
    fredboat.command.admin.EvalCommand evalCommand20 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array13);
    fredboat.command.moderation.LanguageCommand languageCommand21 = new fredboat.command.moderation.LanguageCommand("hi!", str_array13);
    fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand> tuple2_weatherOpenWeather_languageCommand22 = new fredboat.util.Tuple2<fredboat.util.rest.models.weather.WeatherOpenWeather,fredboat.command.moderation.LanguageCommand>(weatherOpenWeather0, languageCommand21);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    languageCommand21.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.fun.CatgirlCommand catgirlCommand12 = new fredboat.command.fun.CatgirlCommand("hi!", str_array8);
    fredboat.command.moderation.LanguageCommand languageCommand13 = new fredboat.command.moderation.LanguageCommand("en_US", str_array8);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uD83D\uDEAA", str_array8);
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
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    fredboat.util.rest.Weather weather3 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand13 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.fun.TextCommand textCommand14 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand15 = new fredboat.command.util.WeatherCommand(weather3, "Bot Admin", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand16 = new fredboat.command.admin.NodeAdminCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand17 = new fredboat.command.admin.SetAvatarCommand("\u2757", str_array11);
    fredboat.command.music.control.StopCommand stopCommand18 = new fredboat.command.music.control.StopCommand("fredboat.util.BrainfuckException: ", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    stopCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array7);
    fredboat.command.music.control.RepeatCommand repeatCommand9 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.util.CommandsCommand commandsCommand10 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.maintenance.PingCommand pingCommand11 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array7);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand13 = new fredboat.command.maintenance.AudioDebugCommand("en_US", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand11 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand12 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand14 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("\uD83D\uDCDD", str_array9);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = gitInfoCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand16 = new fredboat.command.maintenance.VersionCommand("en_US", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    versionCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand9 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array6);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand10 = new fredboat.command.maintenance.GitInfoCommand("Bot Admin", str_array6);
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
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.music.seeking.ForwardCommand forwardCommand9 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext10 = null;
    // The following exception was thrown during execution in test generation
    try {
    forwardCommand9.onInvoke(commandContext10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

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
    java.lang.String str21 = brainfuckCommand18.process("Bot Owner", context20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array10);
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("DJ", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("\uD83D\uDCDD", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = shuffleCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    java.lang.String[] str_array10 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand11 = new fredboat.command.fun.HugCommand("", "\u274C", str_array10);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("\uD83D\uDCDD", "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("Bot Owner", str_array10);
    fredboat.messaging.internal.Context context14 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = serverInfoCommand13.help(context14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("fredboat.util.BrainfuckException: ", 5, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.admin.ReviveCommand reviveCommand13 = new fredboat.command.admin.ReviveCommand("", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    reviveCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    // The following exception was thrown during execution in test generation
    try {
    java.io.File file1 = fredboat.util.rest.CacheUtil.getImageFromURL("\u2508\u2508\u2571\u258F\u2508\u2508\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2572\u2508 \n\u2508\u2508\u258F\u258F\u2508\u2508\u2508\u2508\u2508\u258F\u2572\u2595\u258B\u2595\u258B\u258F\n\u2508\u2508\u2572\u2572\u2508\u2508\u2508\u2508\u2508\u258F\u2508\u258F\u2508\u2594\u2594\u2594\u2586 ------- BORF!\n\u2508\u2508\u2508\u2572\u2594\u2594\u2594\u2594\u2594\u2572\u2571\u2508\u2570\u2533\u2533\u2533\u256F \n\u2571\u2572\u2571\u2572\u258F\u2508\u2508\u2508\u2508\u2508\u2508\u2595\u2594\u2570\u2501\u256F \n\u2594\u2572\u2572\u2571\u2571\u2594\u2571\u2594\u2594\u2572\u2572\u2572\u2572\u2508\u2508\u2508 \n\u2508\u2508\u2572\u2571\u2572\u2571\u2508\u2508\u2508\u2508\u2572\u2572\u2582\u2572\u2582\u2508 \n\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2508\u2572\u2571\u2572\u2571\u2508\nSpread him to take over Discord!(Don't spam him though!)");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!", "Provided by OpenWeatherMap.org" };
    fredboat.command.music.control.PauseCommand pauseCommand6 = new fredboat.command.music.control.PauseCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.DestroyCommand destroyCommand7 = new fredboat.command.music.control.DestroyCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    destroyCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array11);
    fredboat.command.util.MathCommand mathCommand13 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.music.control.UnpauseCommand unpauseCommand14 = new fredboat.command.music.control.UnpauseCommand("", str_array11);
    fredboat.command.admin.ExitCommand exitCommand15 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand16 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array11);
    fredboat.command.music.control.RepeatCommand repeatCommand17 = new fredboat.command.music.control.RepeatCommand("\u2705", str_array11);
    fredboat.command.fun.RandomImageCommand randomImageCommand18 = new fredboat.command.fun.RandomImageCommand("http://i.imgur.com/NqyOqnj.gif", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand19 = new fredboat.command.maintenance.AudioDebugCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array11);
    fredboat.commandmeta.abs.CommandContext commandContext20 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand19.onInvoke(commandContext20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array4);
    fredboat.command.music.control.ShuffleCommand shuffleCommand6 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = shuffleCommand6.getMinimumPerms();
    int i8 = permissionLevel7.getLevel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel7 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel7.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

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
    java.lang.String str29 = weatherOpenWeather0.getMain();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Bot Owner"+ "'", str29.equals("Bot Owner"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.TestCommand testCommand15 = new fredboat.command.admin.TestCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = testCommand15.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel17 = testCommand15.getMinimumPerms();
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = testCommand15.help(context18);
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
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand12 = new fredboat.command.admin.SetAvatarCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand("\uD83D\uDEAA", str_array9);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", "", str_array9);
    fredboat.command.admin.UpdateCommand updateCommand15 = new fredboat.command.admin.UpdateCommand("\uD83D\uDCDD", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext16 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand15.onInvoke(commandContext16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    java.lang.String[] str_array9 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand10 = new fredboat.command.fun.HugCommand("", "\u274C", str_array9);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("\uD83D\uDCDD", "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    textCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    java.lang.String[] str_array13 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand14 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array13);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array13);
    fredboat.command.fun.TextCommand textCommand16 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array13);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand17 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array13);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand18 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array13);
    fredboat.command.moderation.ConfigCommand configCommand19 = new fredboat.command.moderation.ConfigCommand("https://i.imgur.com/YqZuqEB.jpg", str_array13);
    fredboat.command.fun.HugCommand hugCommand20 = new fredboat.command.fun.HugCommand("", "\uD83D\uDEAA", str_array13);
    fredboat.command.admin.EvalCommand evalCommand21 = new fredboat.command.admin.EvalCommand("qua, 31 dez 1969, 09:00 PM", str_array13);
    fredboat.command.maintenance.AudioDebugCommand audioDebugCommand22 = new fredboat.command.maintenance.AudioDebugCommand("fredboat.util.BrainfuckException: \u2705", str_array13);
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    audioDebugCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    java.lang.String str1 = weatherOpenWeather0.getDescription();
    java.lang.String str2 = weatherOpenWeather0.getMain();
    java.lang.String str3 = weatherOpenWeather0.getIcon();
    java.lang.String str4 = weatherOpenWeather0.getMain();
    weatherOpenWeather0.setId((int)(short)1);
    
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
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    java.lang.String[] str_array8 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand9 = new fredboat.command.fun.HugCommand("", "\u274C", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand10 = new fredboat.command.util.ServerInfoCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext11 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand10.onInvoke(commandContext11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.admin.BotRestartCommand botRestartCommand5 = new fredboat.command.admin.BotRestartCommand("\u2705", str_array4);
    fredboat.perms.PermissionLevel permissionLevel6 = botRestartCommand5.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext7 = null;
    // The following exception was thrown during execution in test generation
    try {
    botRestartCommand5.onInvoke(commandContext7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    org.junit.Assert.assertTrue("'" + permissionLevel6 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel6.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand11 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("Provided by OpenWeatherMap.org", str_array10);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.fun.DanceCommand danceCommand13 = new fredboat.command.fun.DanceCommand("\uD83D\uDCDD", str_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand5 = new fredboat.command.music.control.RepeatCommand("", str_array4);
    fredboat.command.music.control.LeaveCommand leaveCommand6 = new fredboat.command.music.control.LeaveCommand("hi!", str_array4);
    fredboat.perms.PermissionLevel permissionLevel7 = leaveCommand6.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel8 = leaveCommand6.getMinimumPerms();
    fredboat.messaging.internal.Context context9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = leaveCommand6.help(context9);
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
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

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
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = languageCommand18.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.maintenance.NodesCommand nodesCommand8 = new fredboat.command.maintenance.NodesCommand("", str_array5);
    fredboat.command.music.control.LeaveCommand leaveCommand9 = new fredboat.command.music.control.LeaveCommand("Bot Owner", str_array5);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = leaveCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    fredboat.util.rest.Weather weather0 = null;
    java.lang.String[] str_array11 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand12 = new fredboat.command.music.control.RepeatCommand("", str_array11);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand13 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array11);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand14 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array11);
    fredboat.command.fun.RollCommand rollCommand15 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array11);
    fredboat.command.music.control.ShuffleCommand shuffleCommand16 = new fredboat.command.music.control.ShuffleCommand("DJ", str_array11);
    fredboat.command.util.WeatherCommand weatherCommand17 = new fredboat.command.util.WeatherCommand(weather0, "\uD83D\uDEAA", str_array11);
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = weatherCommand17.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand10 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.fun.FacedeskCommand facedeskCommand11 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array7);
    java.io.File file12 = facedeskCommand11.getRandomFile();
    java.lang.String str13 = facedeskCommand11.getRandomImageUrl();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    facedeskCommand11.onInvoke(commandContext14);
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
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    fredboat.agent.StatsAgent statsAgent1 = new fredboat.agent.StatsAgent("qua, 31 dez 1969, 09:00 PM");
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.FredBoatAgent.start((fredboat.agent.FredBoatAgent)statsAgent1);
      org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
    } catch (java.util.concurrent.RejectedExecutionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

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
    int i20 = weatherOpenWeather0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.ServerInfoCommand serverInfoCommand11 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand12 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array8);
    fredboat.command.maintenance.VersionCommand versionCommand13 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.StopCommand stopCommand14 = new fredboat.command.music.control.StopCommand("\uD83D\uDCDD", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = stopCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    java.util.concurrent.TimeUnit timeUnit2 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.agent.StatsAgent statsAgent3 = new fredboat.agent.StatsAgent("Bot Admin", (int)(short)100, timeUnit2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand7 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.admin.ExitCommand exitCommand8 = new fredboat.command.admin.ExitCommand("hi!", str_array6);
    fredboat.command.music.info.ListCommand listCommand9 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.admin.EvalCommand evalCommand10 = new fredboat.command.admin.EvalCommand("hi!", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = evalCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel12 = evalCommand10.getMinimumPerms();
    fredboat.perms.PermissionLevel permissionLevel13 = evalCommand10.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    evalCommand10.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.BOT_OWNER));
    org.junit.Assert.assertTrue("'" + permissionLevel13 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel13.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand11 = new fredboat.command.music.control.RepeatCommand("", str_array10);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array10);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand13 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array10);
    fredboat.command.fun.RollCommand rollCommand14 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand15 = new fredboat.command.music.control.ShuffleCommand("DJ", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand16 = new fredboat.command.maintenance.GitInfoCommand("fredboat.util.BrainfuckException: \u2705", str_array10);
    fredboat.messaging.internal.Context context17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = gitInfoCommand16.help(context17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.admin.UpdateCommand updateCommand9 = new fredboat.command.admin.UpdateCommand("", str_array7);
    fredboat.command.fun.CatgirlCommand catgirlCommand10 = new fredboat.command.fun.CatgirlCommand("Bot Admin", str_array7);
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand("\u2705", str_array7);
    fredboat.command.util.MathCommand mathCommand12 = new fredboat.command.util.MathCommand("", str_array7);
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
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.fun.PatCommand patCommand14 = new fredboat.command.fun.PatCommand("", "", str_array9);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand15 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array9);
    fredboat.perms.PermissionLevel permissionLevel16 = unblacklistCommand15.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    unblacklistCommand15.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel16 + "' != '" + fredboat.perms.PermissionLevel.BOT_OWNER + "'", permissionLevel16.equals(fredboat.perms.PermissionLevel.BOT_OWNER));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    fredboat.db.entity.UConfig uConfig0 = new fredboat.db.entity.UConfig();
    java.lang.String str1 = uConfig0.getBearer();
    fredboat.db.entity.UConfig uConfig3 = uConfig0.setBearer("\u2705");
    fredboat.db.entity.UConfig uConfig5 = uConfig0.setBearerExpiration((long)(short)10);
    long long6 = uConfig5.getBearerExpiration();
    
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
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.fun.TextCommand textCommand10 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array7);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array7);
    fredboat.commandmeta.abs.CommandContext commandContext12 = null;
    // The following exception was thrown during execution in test generation
    try {
    nodeAdminCommand11.onInvoke(commandContext12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    long long4 = blacklistEntry1.rateLimitReachedTimestamp;
    long long5 = blacklistEntry1.id;
    blacklistEntry1.setBlacklistedTimestamp((long)(short)-1);
    blacklistEntry1.setBlacklistedTimestamp(1531609935745L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 10L);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("en_US", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = configCommand17.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand17.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.admin.BotRestartCommand botRestartCommand6 = new fredboat.command.admin.BotRestartCommand("\u2705", str_array5);
    fredboat.command.admin.ExitCommand exitCommand7 = new fredboat.command.admin.ExitCommand("\uD83D\uDCDD", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array10);
    fredboat.command.music.control.ShuffleCommand shuffleCommand12 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array10);
    fredboat.command.maintenance.VersionCommand versionCommand15 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand16 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.music.control.JoinCommand joinCommand17 = new fredboat.command.music.control.JoinCommand("\uD83D\uDEAA", str_array10);
    fredboat.command.moderation.ConfigCommand configCommand18 = new fredboat.command.moderation.ConfigCommand("\u2757", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext19 = null;
    // The following exception was thrown during execution in test generation
    try {
    configCommand18.onInvoke(commandContext19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

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
    fredboat.audio.queue.AudioTrackContext audioTrackContext17 = null;
    boolean b18 = simpleTrackProvider0.remove(audioTrackContext17);
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry((long)(short)10);
    blacklistEntry1.rateLimitReachedTimestamp = (byte)100;
    int i4 = blacklistEntry1.getRateLimitReached();
    long long5 = blacklistEntry1.getRateLimitReachedTimestamp();
    int i6 = blacklistEntry1.getLevel();
    blacklistEntry1.setBlacklistedTimestamp((long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array7);
    fredboat.command.music.control.ShuffleCommand shuffleCommand9 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.maintenance.GetIdCommand getIdCommand10 = new fredboat.command.maintenance.GetIdCommand("Provided by OpenWeatherMap.org", str_array7);
    fredboat.command.fun.FacedeskCommand facedeskCommand11 = new fredboat.command.fun.FacedeskCommand("Provided by OpenWeatherMap.org", "Bot Owner", str_array7);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params12 = fredboat.util.rest.Http.Params.of(str_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    fredboat.util.rest.models.weather.WeatherOpenWeather weatherOpenWeather0 = new fredboat.util.rest.models.weather.WeatherOpenWeather();
    java.lang.String str1 = weatherOpenWeather0.getDescription();
    java.lang.String str2 = weatherOpenWeather0.getMain();
    weatherOpenWeather0.setMain("Bot Owner");
    weatherOpenWeather0.setIcon("http://i.imgur.com/NqyOqnj.gif");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand10 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array9);
    fredboat.command.util.MathCommand mathCommand11 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.control.UnpauseCommand unpauseCommand12 = new fredboat.command.music.control.UnpauseCommand("", str_array9);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("", str_array9);
    fredboat.command.music.seeking.RewindCommand rewindCommand15 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array9);
    fredboat.command.music.control.PauseCommand pauseCommand16 = new fredboat.command.music.control.PauseCommand("en_US", str_array9);
    fredboat.perms.PermissionLevel permissionLevel17 = pauseCommand16.getMinimumPerms();
    fredboat.messaging.internal.Context context18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = pauseCommand16.help(context18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    org.junit.Assert.assertTrue("'" + permissionLevel17 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel17.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "", "\u2705", "\uD83D\uDCDD", "\uD83D\uDCDD", "\uD83D\uDEAA", "" };
    fredboat.command.fun.RollCommand rollCommand10 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "\uD83D\uDEAA", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("Provided by OpenWeatherMap.org", str_array9);
    java.util.List<java.lang.String> list_str12 = nodeAdminCommand11.aliases;
    fredboat.messaging.internal.Context context13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str14 = nodeAdminCommand11.help(context13);
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
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand("", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand20.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("https://i.imgur.com/YqZuqEB.jpg", str_array11);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.util.rest.Http.Params params20 = fredboat.util.rest.Http.Params.of(str_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    fredboat.db.entity.BlacklistEntry blacklistEntry1 = new fredboat.db.entity.BlacklistEntry(1L);
    blacklistEntry1.rateLimitReached = 10;
    blacklistEntry1.rateLimitReachedTimestamp = 1531609944902L;
    // The following exception was thrown during execution in test generation
    try {
    blacklistEntry1.setId("\uD83D\uDEAA");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand2 = new fredboat.command.music.control.ReshuffleCommand("Bot Admin", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand10 = new fredboat.command.music.control.RepeatCommand("", str_array9);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand11 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array9);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand12 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array9);
    fredboat.command.fun.RollCommand rollCommand13 = new fredboat.command.fun.RollCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", "Provided by OpenWeatherMap.org", str_array9);
    fredboat.command.music.control.ShuffleCommand shuffleCommand14 = new fredboat.command.music.control.ShuffleCommand("DJ", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    shuffleCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext23 = null;
    // The following exception was thrown during execution in test generation
    try {
    updateCommand22.onInvoke(commandContext23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    fredboat.command.admin.EvalCommand evalCommand2 = new fredboat.command.admin.EvalCommand("fredboat.util.BrainfuckException: ", str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    java.lang.String[] str_array10 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand11 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array10);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array10);
    fredboat.command.music.info.ListCommand listCommand13 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array10);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand14 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array10);
    fredboat.command.fun.PatCommand patCommand15 = new fredboat.command.fun.PatCommand("", "", str_array10);
    fredboat.command.music.info.HistoryCommand historyCommand16 = new fredboat.command.music.info.HistoryCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.moderation.ConfigCommand configCommand17 = new fredboat.command.moderation.ConfigCommand("en_US", str_array10);
    fredboat.perms.PermissionLevel permissionLevel18 = configCommand17.getMinimumPerms();
    fredboat.messaging.internal.Context context19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = configCommand17.help(context19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    org.junit.Assert.assertTrue("'" + permissionLevel18 + "' != '" + fredboat.perms.PermissionLevel.BASE + "'", permissionLevel18.equals(fredboat.perms.PermissionLevel.BASE));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand6 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array5);
    fredboat.command.music.control.UnpauseCommand unpauseCommand7 = new fredboat.command.music.control.UnpauseCommand("Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand("http://i.imgur.com/NqyOqnj.gif", str_array5);
    fredboat.perms.PermissionLevel permissionLevel9 = shuffleCommand8.getMinimumPerms();
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = shuffleCommand8.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    org.junit.Assert.assertTrue("'" + permissionLevel9 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel9.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    fredboat.db.entity.UConfig uConfig1 = new fredboat.db.entity.UConfig("\u274C");
    fredboat.db.entity.UConfig uConfig3 = uConfig1.setBearerExpiration(0L);
    fredboat.db.entity.UConfig uConfig5 = uConfig1.setRefresh("Provided by OpenWeatherMap.org");
    fredboat.db.entity.UConfig uConfig7 = uConfig1.setUserId("\u274C");
    java.lang.String str8 = uConfig1.getRefresh();
    
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
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    java.lang.String[] str_array7 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand8 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array7);
    fredboat.command.admin.ExitCommand exitCommand9 = new fredboat.command.admin.ExitCommand("hi!", str_array7);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array7);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand11 = new fredboat.command.moderation.DisableCommandsCommand("", str_array7);
    fredboat.command.admin.EvalCommand evalCommand12 = new fredboat.command.admin.EvalCommand("", str_array7);
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
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.fun.TextCommand textCommand11 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array8);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand12 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand13 = new fredboat.command.music.seeking.RewindCommand("", str_array8);
    fredboat.perms.PermissionLevel permissionLevel14 = rewindCommand13.getMinimumPerms();
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = rewindCommand13.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    org.junit.Assert.assertTrue("'" + permissionLevel14 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel14.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    fredboat.util.rest.models.weather.WeatherSystemOpenWeather weatherSystemOpenWeather0 = new fredboat.util.rest.models.weather.WeatherSystemOpenWeather();
    int i1 = weatherSystemOpenWeather0.getId();
    weatherSystemOpenWeather0.setType((int)'a');
    weatherSystemOpenWeather0.setSunrise(10000);
    weatherSystemOpenWeather0.setCountry("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

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
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException31 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)brainfuckException20);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array15);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.music.control.UnpauseCommand unpauseCommand10 = new fredboat.command.music.control.UnpauseCommand("http://i.imgur.com/NqyOqnj.gif", str_array6);
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
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array6);
    fredboat.command.music.control.RepeatCommand repeatCommand8 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array6);
    fredboat.command.util.CommandsCommand commandsCommand9 = new fredboat.command.util.CommandsCommand("Provided by OpenWeatherMap.org", str_array6);
    fredboat.command.maintenance.PingCommand pingCommand10 = new fredboat.command.maintenance.PingCommand("qua, 31 dez 1969, 09:00 PM", str_array6);
    fredboat.command.music.seeking.RewindCommand rewindCommand11 = new fredboat.command.music.seeking.RewindCommand("\u2705", str_array6);
    fredboat.perms.PermissionLevel permissionLevel12 = rewindCommand11.getMinimumPerms();
    fredboat.commandmeta.abs.CommandContext commandContext13 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand11.onInvoke(commandContext13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel12 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel12.equals(fredboat.perms.PermissionLevel.DJ));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    fredboat.audio.queue.SimpleTrackProvider simpleTrackProvider0 = new fredboat.audio.queue.SimpleTrackProvider();
    boolean b1 = simpleTrackProvider0.isEmpty();
    simpleTrackProvider0.skipped();
    fredboat.audio.queue.AudioTrackContext audioTrackContext3 = null;
    // The following exception was thrown during execution in test generation
    try {
    simpleTrackProvider0.add(audioTrackContext3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    fredboat.util.GitRepoState gitRepoState0 = fredboat.util.GitRepoState.getGitRepositoryState();
    java.lang.String str1 = gitRepoState0.commitId;
    java.lang.String str2 = gitRepoState0.commitTime;
    java.lang.String str3 = gitRepoState0.commitUserName;
    java.lang.String str4 = gitRepoState0.commitUserName;
    
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

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand5 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array4);
    fredboat.command.music.info.ListCommand listCommand6 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array4);
    fredboat.command.admin.TestCommand testCommand7 = new fredboat.command.admin.TestCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array4);
    fredboat.commandmeta.abs.CommandContext commandContext8 = null;
    // The following exception was thrown during execution in test generation
    try {
    testCommand7.onInvoke(commandContext8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    java.lang.String[] str_array10 = new java.lang.String[] { ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", "http://i.imgur.com/NqyOqnj.gif", "\uD83D\uDEAA", "\u2757", ":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D" };
    fredboat.command.fun.HugCommand hugCommand11 = new fredboat.command.fun.HugCommand("", "\u274C", str_array10);
    fredboat.command.fun.TextCommand textCommand12 = new fredboat.command.fun.TextCommand("\uD83D\uDCDD", "fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array10);
    fredboat.command.util.ServerInfoCommand serverInfoCommand13 = new fredboat.command.util.ServerInfoCommand("Bot Owner", str_array10);
    fredboat.commandmeta.abs.CommandContext commandContext14 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand13.onInvoke(commandContext14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.util.MathCommand mathCommand10 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.music.control.UnpauseCommand unpauseCommand11 = new fredboat.command.music.control.UnpauseCommand("", str_array8);
    fredboat.command.admin.ExitCommand exitCommand12 = new fredboat.command.admin.ExitCommand("hi!", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand13 = new fredboat.command.moderation.EnableCommandsCommand("hi!", str_array8);
    fredboat.command.admin.ExitCommand exitCommand14 = new fredboat.command.admin.ExitCommand("en_US", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    exitCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    fredboat.util.BrainfuckException brainfuckException2 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException2);
    // The following exception was thrown during execution in test generation
    try {
    fredboat.db.DatabaseNotReadyException databaseNotReadyException4 = new fredboat.db.DatabaseNotReadyException((java.lang.Throwable)brainfuckException3);
      org.junit.Assert.fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

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
    java.lang.String[] str_array29 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand30 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array29);
    fredboat.command.music.control.ShuffleCommand shuffleCommand31 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array29);
    fredboat.command.fun.TextCommand textCommand32 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array29);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand33 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array29);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand34 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array29);
    fredboat.command.music.control.UnpauseCommand unpauseCommand35 = new fredboat.command.music.control.UnpauseCommand("\uD83D\uDCDD", str_array29);
    fredboat.perms.PermissionLevel permissionLevel36 = unpauseCommand35.getMinimumPerms();
    java.util.List<java.lang.String> list_str37 = guildPermissions0.getFromEnum(permissionLevel36);
    fredboat.db.entity.GuildPermissions guildPermissions38 = new fredboat.db.entity.GuildPermissions();
    java.lang.String[] str_array47 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand48 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array47);
    fredboat.command.util.MathCommand mathCommand49 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array47);
    fredboat.command.music.control.UnpauseCommand unpauseCommand50 = new fredboat.command.music.control.UnpauseCommand("", str_array47);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand51 = new fredboat.command.moderation.EnableCommandsCommand("", str_array47);
    fredboat.command.music.seeking.RewindCommand rewindCommand52 = new fredboat.command.music.seeking.RewindCommand("", str_array47);
    fredboat.command.music.seeking.RewindCommand rewindCommand53 = new fredboat.command.music.seeking.RewindCommand("en_US", str_array47);
    fredboat.perms.PermissionLevel permissionLevel54 = rewindCommand53.getMinimumPerms();
    java.util.List<java.lang.String> list_str55 = guildPermissions38.getFromEnum(permissionLevel54);
    fredboat.db.entity.GuildPermissions guildPermissions56 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str57 = guildPermissions56.getDjList();
    guildPermissions38.setUserList(list_str57);
    guildPermissions0.setDjList(list_str57);
    java.lang.String[] str_array68 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand69 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array68);
    fredboat.command.music.control.ShuffleCommand shuffleCommand70 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array68);
    fredboat.command.fun.TextCommand textCommand71 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array68);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand72 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array68);
    fredboat.command.moderation.DisableCommandsCommand disableCommandsCommand73 = new fredboat.command.moderation.DisableCommandsCommand("hi!", str_array68);
    fredboat.perms.PermissionLevel permissionLevel74 = disableCommandsCommand73.getMinimumPerms();
    java.lang.String[] str_array78 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand79 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array78);
    fredboat.command.music.info.ListCommand listCommand80 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array78);
    java.util.List<java.lang.String> list_str81 = listCommand80.aliases;
    // The following exception was thrown during execution in test generation
    try {
    guildPermissions0.setFromEnum(permissionLevel74, list_str81);
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
    org.junit.Assert.assertNotNull(str_array29);
    org.junit.Assert.assertTrue("'" + permissionLevel36 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel36.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    org.junit.Assert.assertTrue("'" + permissionLevel54 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel54.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array68);
    org.junit.Assert.assertTrue("'" + permissionLevel74 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel74.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str81);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    java.lang.String[] str_array11 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand12 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array11);
    fredboat.command.admin.ExitCommand exitCommand13 = new fredboat.command.admin.ExitCommand("hi!", str_array11);
    fredboat.command.music.info.ListCommand listCommand14 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array11);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand15 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array11);
    fredboat.command.fun.PatCommand patCommand16 = new fredboat.command.fun.PatCommand("", "", str_array11);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand17 = new fredboat.command.admin.UnblacklistCommand("hi!", str_array11);
    fredboat.command.music.control.ReshuffleCommand reshuffleCommand18 = new fredboat.command.music.control.ReshuffleCommand("\uD83D\uDEAA", str_array11);
    fredboat.command.music.control.JoinCommand joinCommand19 = new fredboat.command.music.control.JoinCommand("https://i.imgur.com/YqZuqEB.jpg", str_array11);
    fredboat.messaging.internal.Context context20 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = joinCommand19.help(context20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array8);
    fredboat.command.music.info.ListCommand listCommand10 = new fredboat.command.music.info.ListCommand("Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.maintenance.NodesCommand nodesCommand11 = new fredboat.command.maintenance.NodesCommand("", str_array8);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand12 = new fredboat.command.moderation.EnableCommandsCommand("qua, 31 dez 1969, 09:00 PM", str_array8);
    fredboat.command.admin.SetAvatarCommand setAvatarCommand13 = new fredboat.command.admin.SetAvatarCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array8);
    fredboat.command.fun.FacedeskCommand facedeskCommand14 = new fredboat.command.fun.FacedeskCommand("\uD83D\uDCDD", "", str_array8);
    fredboat.messaging.internal.Context context15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str16 = facedeskCommand14.help(context15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    fredboat.util.BrainfuckException brainfuckException3 = new fredboat.util.BrainfuckException("Provided by OpenWeatherMap.org");
    fredboat.util.BrainfuckException brainfuckException4 = new fredboat.util.BrainfuckException("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", (java.lang.Throwable)brainfuckException3);
    fredboat.util.BrainfuckException brainfuckException5 = new fredboat.util.BrainfuckException("\u2705", (java.lang.Throwable)brainfuckException4);
    java.lang.String str6 = brainfuckException5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "fredboat.util.BrainfuckException: \u2705"+ "'", str6.equals("fredboat.util.BrainfuckException: \u2705"));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    java.lang.String[] str_array8 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand9 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array8);
    fredboat.command.music.control.ShuffleCommand shuffleCommand10 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.util.AvatarCommand avatarCommand11 = new fredboat.command.util.AvatarCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.util.BrainfuckCommand brainfuckCommand12 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array8);
    fredboat.command.maintenance.GetIdCommand getIdCommand13 = new fredboat.command.maintenance.GetIdCommand("\uD83D\uDEAA", str_array8);
    fredboat.command.music.seeking.RewindCommand rewindCommand14 = new fredboat.command.music.seeking.RewindCommand("\uD83D\uDCDD", str_array8);
    fredboat.commandmeta.abs.CommandContext commandContext15 = null;
    // The following exception was thrown during execution in test generation
    try {
    rewindCommand14.onInvoke(commandContext15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

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
    fredboat.commandmeta.abs.CommandContext commandContext21 = null;
    // The following exception was thrown during execution in test generation
    try {
    joinCommand19.onInvoke(commandContext21);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    org.junit.Assert.assertTrue("'" + permissionLevel20 + "' != '" + fredboat.perms.PermissionLevel.USER + "'", permissionLevel20.equals(fredboat.perms.PermissionLevel.USER));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    java.lang.String[] str_array9 = new java.lang.String[] { "hi!", "hi!" };
    fredboat.command.maintenance.VersionCommand versionCommand10 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.admin.ExitCommand exitCommand11 = new fredboat.command.admin.ExitCommand("hi!", str_array9);
    fredboat.command.music.info.ListCommand listCommand12 = new fredboat.command.music.info.ListCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array9);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand13 = new fredboat.command.maintenance.GitInfoCommand("hi!", str_array9);
    fredboat.command.util.BrainfuckCommand brainfuckCommand14 = new fredboat.command.util.BrainfuckCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array9);
    fredboat.command.music.seeking.RestartCommand restartCommand15 = new fredboat.command.music.seeking.RestartCommand("hi!", str_array9);
    fredboat.command.util.ServerInfoCommand serverInfoCommand16 = new fredboat.command.util.ServerInfoCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array9);
    fredboat.commandmeta.abs.CommandContext commandContext17 = null;
    // The following exception was thrown during execution in test generation
    try {
    serverInfoCommand16.onInvoke(commandContext17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("", str_array6);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand8 = new fredboat.command.admin.NodeAdminCommand("\u274C", str_array6);
    fredboat.command.fun.RemoteFileCommand remoteFileCommand9 = new fredboat.command.fun.RemoteFileCommand("\u274C", "Bot Admin", str_array6);
    remoteFileCommand9.url = "hi!";
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
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

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
    java.lang.String[] str_array22 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand23 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array22);
    fredboat.command.util.MathCommand mathCommand24 = new fredboat.command.util.MathCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array22);
    fredboat.command.music.control.UnpauseCommand unpauseCommand25 = new fredboat.command.music.control.UnpauseCommand("", str_array22);
    fredboat.command.moderation.EnableCommandsCommand enableCommandsCommand26 = new fredboat.command.moderation.EnableCommandsCommand("", str_array22);
    fredboat.command.music.seeking.RewindCommand rewindCommand27 = new fredboat.command.music.seeking.RewindCommand("", str_array22);
    fredboat.perms.PermissionLevel permissionLevel28 = rewindCommand27.getMinimumPerms();
    fredboat.db.entity.GuildPermissions guildPermissions29 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions30 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str31 = guildPermissions30.getDjList();
    guildPermissions29.setUserList(list_str31);
    guildPermissions0.setFromEnum(permissionLevel28, list_str31);
    java.util.List<java.lang.String> list_str34 = guildPermissions0.getUserList();
    java.util.List<java.lang.String> list_str35 = guildPermissions0.getAdminList();
    fredboat.db.entity.GuildPermissions guildPermissions36 = new fredboat.db.entity.GuildPermissions();
    fredboat.db.entity.GuildPermissions guildPermissions37 = new fredboat.db.entity.GuildPermissions();
    java.util.List<java.lang.String> list_str38 = guildPermissions37.getDjList();
    guildPermissions36.setUserList(list_str38);
    fredboat.db.entity.GuildPermissions guildPermissions40 = new fredboat.db.entity.GuildPermissions();
    java.lang.String[] str_array50 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand51 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array50);
    fredboat.command.music.control.ShuffleCommand shuffleCommand52 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array50);
    fredboat.command.fun.TextCommand textCommand53 = new fredboat.command.fun.TextCommand("Provided by OpenWeatherMap.org", "\u274C", str_array50);
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand54 = new fredboat.command.admin.NodeAdminCommand("http://i.imgur.com/NqyOqnj.gif", str_array50);
    fredboat.command.fun.FacedeskCommand facedeskCommand55 = new fredboat.command.fun.FacedeskCommand("qua, 31 dez 1969, 09:00 PM", "\uD83D\uDEAA", str_array50);
    java.util.List<java.lang.String> list_str56 = facedeskCommand55.aliases;
    guildPermissions40.setUserList(list_str56);
    guildPermissions36.setAdminList(list_str56);
    guildPermissions0.setUserList(list_str56);
    java.lang.String[] str_array70 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand71 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array70);
    fredboat.command.music.control.ShuffleCommand shuffleCommand72 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array70);
    fredboat.command.util.ServerInfoCommand serverInfoCommand73 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array70);
    fredboat.command.maintenance.GitInfoCommand gitInfoCommand74 = new fredboat.command.maintenance.GitInfoCommand("\u2757", str_array70);
    fredboat.command.maintenance.VersionCommand versionCommand75 = new fredboat.command.maintenance.VersionCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array70);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand76 = new fredboat.command.admin.UnblacklistCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array70);
    fredboat.command.admin.UnblacklistCommand unblacklistCommand77 = new fredboat.command.admin.UnblacklistCommand("en_US", str_array70);
    fredboat.command.admin.ExitCommand exitCommand78 = new fredboat.command.admin.ExitCommand("", str_array70);
    fredboat.perms.PermissionLevel permissionLevel79 = exitCommand78.getMinimumPerms();
    java.lang.String str80 = permissionLevel79.getName();
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<java.lang.String> list_str81 = guildPermissions0.getFromEnum(permissionLevel79);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertNotNull(str_array22);
    org.junit.Assert.assertTrue("'" + permissionLevel28 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel28.equals(fredboat.perms.PermissionLevel.DJ));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array70);
    org.junit.Assert.assertTrue("'" + permissionLevel79 + "' != '" + fredboat.perms.PermissionLevel.BOT_ADMIN + "'", permissionLevel79.equals(fredboat.perms.PermissionLevel.BOT_ADMIN));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Bot Admin"+ "'", str80.equals("Bot Admin"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand6 = new fredboat.command.admin.NodeAdminCommand("\uD83D\uDCDD", str_array5);
    fredboat.command.music.control.RepeatCommand repeatCommand7 = new fredboat.command.music.control.RepeatCommand("\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA...", str_array5);
    fredboat.command.music.seeking.RestartCommand restartCommand8 = new fredboat.command.music.seeking.RestartCommand("", str_array5);
    fredboat.command.music.control.PauseCommand pauseCommand9 = new fredboat.command.music.control.PauseCommand("https://i.imgur.com/YqZuqEB.jpg", str_array5);
    fredboat.messaging.internal.Context context10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = pauseCommand9.help(context10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    java.lang.String[] str_array5 = new java.lang.String[] { "Provided by OpenWeatherMap.org", "\uFF08 \u0361\u00B0 \u035C\u0296 \u0361\u00B0)\u3064\u2501\u2606\u30FB\u3002\n\u2282\u3000\u3000 \u30CE \u3000\u3000\u3000\u30FB\u309C+.\n\u3000\u3057\u30FC\uFF2A\u3000\u3000\u3000\u00B0\u3002+ \u00B4\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000.\u00B7 \u00B4\u00B8.\u00B7\u00B4\u00A8) \u00B8.\u00B7*\u00A8)\n\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000\u3000(\u00B8.\u00B7\u00B4 (\u00B8.\u00B7' \u2606 ABRA KADABRA..." };
    fredboat.command.music.control.RepeatCommand repeatCommand6 = new fredboat.command.music.control.RepeatCommand("", str_array5);
    fredboat.command.music.info.ListCommand listCommand7 = new fredboat.command.music.info.ListCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array5);
    fredboat.command.music.control.LeaveCommand leaveCommand8 = new fredboat.command.music.control.LeaveCommand("fredboat.util.BrainfuckException: Provided by OpenWeatherMap.org", str_array5);
    fredboat.commandmeta.abs.CommandContext commandContext9 = null;
    // The following exception was thrown during execution in test generation
    try {
    leaveCommand8.onInvoke(commandContext9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "", "hi!" };
    fredboat.command.admin.NodeAdminCommand nodeAdminCommand7 = new fredboat.command.admin.NodeAdminCommand("hi!", str_array6);
    fredboat.command.music.control.ShuffleCommand shuffleCommand8 = new fredboat.command.music.control.ShuffleCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.command.util.ServerInfoCommand serverInfoCommand9 = new fredboat.command.util.ServerInfoCommand("\u2757", str_array6);
    fredboat.command.music.seeking.ForwardCommand forwardCommand10 = new fredboat.command.music.seeking.ForwardCommand(":\uFF1C\uFFE3\uFF40\u30FD\u3001\u3000\u3000\u3000\u3000\u3000\u3000\u3000\uFF0F\uFFE3\uFF1E\n\u3000\u309D\u3001\u3000\u3000\uFF3C\u3000\uFF0F\u2312\u30FD,\u30CE \u3000/\u00B4\n\u3000\u3000\u3000\u309D\u3001\u3000`\uFF08 ( \u0361\u00B0 \u035C\u0296 \u0361\u00B0) \uFF0F\n\u3000\u3000 \u3000\u3000>\u3000 \u3000 \u3000,\u30CE\n\u3000\u3000\u3000\u3000\u3000\u2220_,,,/\u00B4\u201D", str_array6);
    fredboat.perms.PermissionLevel permissionLevel11 = forwardCommand10.getMinimumPerms();
    fredboat.messaging.internal.Context context12 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str13 = forwardCommand10.help(context12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    org.junit.Assert.assertTrue("'" + permissionLevel11 + "' != '" + fredboat.perms.PermissionLevel.DJ + "'", permissionLevel11.equals(fredboat.perms.PermissionLevel.DJ));

  }

}
