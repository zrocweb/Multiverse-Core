package com.onarandombox.MultiverseCore.utils;

import com.dumptruckman.minecraft.pluginbase.permission.BukkitPerm;
import com.dumptruckman.minecraft.pluginbase.permission.BukkitPermFactory;
import com.dumptruckman.minecraft.pluginbase.permission.PermDefault;
import com.onarandombox.MultiverseCore.api.Core;

public class Permissions {

    // ============ Multiverse Bypass Permissions ============

    private static final BukkitPerm MV = BukkitPermFactory.newBukkitPerm(Core.class, "mv.*")
            .def(PermDefault.FALSE).build();

    private static final BukkitPerm BYPASS_ALL = BukkitPermFactory.newBukkitPerm(Core.class, "mv.bypass.*")
            .def(PermDefault.FALSE).parent(MV).build();

    private static final BukkitPerm BYPASS_GAMEMODE_ALL = BukkitPermFactory.newBukkitPerm(Core.class,
            "mv.bypass.gamemode.*").desc("Allows a player to ignore gamemode changes for all worlds.")
            .def(PermDefault.FALSE).parent(BYPASS_ALL).build();

    private static final BukkitPerm BYPASS_PLAYERLIMIT_ALL = BukkitPermFactory.newBukkitPerm(Core.class,
            "mv.bypass.playerlimit.*").desc("Allows a player to ignore the player limit for all worlds.")
            .def(PermDefault.FALSE).parent(BYPASS_ALL).build();

    private static final BukkitPerm BYPASS_ALLOWFLY_ALL = BukkitPermFactory.newBukkitPerm(Core.class,
            "mv.bypass.allowfly.*").desc("Allows a player to ignore the flight restrictions for all worlds.")
            .def(PermDefault.FALSE).parent(BYPASS_ALL).build();

    /** Used for bypassing the gamemode of specific worlds. */
    public static final BukkitPerm BYPASS_GAMEMODE = BukkitPermFactory.newBukkitPerm(Core.class,
            "mv.bypass.gamemode").desc("Allows a player to ignore gamemode changes for a specific world.")
            .specificOnly().def(PermDefault.FALSE).parent(BYPASS_GAMEMODE_ALL).build();

    /** Used for bypassing the player limit of specific worlds. */
    public static final BukkitPerm BYPASS_PLAYERLIMIT = BukkitPermFactory.newBukkitPerm(Core.class,
            "mv.bypass.playerlimit").desc("Allows a player to ignore the player limit for a specific world.")
            .specificOnly().def(PermDefault.FALSE).parent(BYPASS_PLAYERLIMIT_ALL).build();

    /** Used for bypassing the allow fly setting of specific worlds. */
    public static final BukkitPerm BYPASS_ALLOWFLY = BukkitPermFactory.newBukkitPerm(Core.class,
            "mv.bypass.allowfly").desc("Allows a player to ignore the flight restrictions for a specific world.")
            .specificOnly().def(PermDefault.FALSE).parent(BYPASS_ALLOWFLY_ALL).build();


    // ============ Multiverse World Permissions ============

    private static final BukkitPerm ACCESS_ALL = BukkitPermFactory.newBukkitPerm(Core.class, "access.*")
            .desc("Allows a player to access all worlds.")
            .usePluginName().addToAll().build();

    private static final BukkitPerm COST_EXEMPT_ALL = BukkitPermFactory.newBukkitPerm(Core.class, "exempt.*")
            .desc("Allows a player to bypass the costs for worlds and MV portals.")
            .usePluginName().addToAll().build();

    public static final BukkitPerm ACCESS = BukkitPermFactory.newBukkitPerm(Core.class, "access")
            .desc("Allows a player to access a specific world.")
            .usePluginName().specificOnly().parent(ACCESS_ALL).build();

    public static final BukkitPerm COST_EXEMPT = BukkitPermFactory.newBukkitPerm(Core.class, "exempt")
            .desc("Allows a player to bypass the costs for a specific world and MV portals in that world.")
            .usePluginName().specificOnly().parent(COST_EXEMPT_ALL).build();


    // ============ Multiverse Teleport Permissions ============

    private static final BukkitPerm TELEPORT_ALL = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.*")
            .desc("Allows the player to use all forms of teleportation.")
            .usePluginName().addToAll().build();

    private static final BukkitPerm TELEPORT_SELF_ALL = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.*")
            .desc("Allows the player to use all forms of self teleportation.")
            .usePluginName().parent(TELEPORT_ALL).build();

    private static final BukkitPerm TELEPORT_OTHER_ALL = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.*")
            .desc("Allows the player to use all forms of teleportation on other players.")
            .usePluginName().parent(TELEPORT_ALL).build();

    private static final BukkitPerm TELEPORT_SELF_WORLD = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.w")
            .desc("Allows the player to teleport self to any world.")
            .usePluginName().parent(TELEPORT_SELF_ALL).build();

    public static final BukkitPerm TP_SELF_WORLD = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.w")
            .desc("Allows the player to teleport self to a specific world.")
            .usePluginName().specificOnly().parent(TELEPORT_SELF_WORLD).build();

    private static final BukkitPerm TELEPORT_SELF_ANCHOR = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.a")
            .desc("Allows the player to teleport self to any anchor.")
            .usePluginName().parent(TELEPORT_SELF_ALL).build();

    public static final BukkitPerm TP_SELF_ANCHOR = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.a")
            .desc("Allows the player to teleport self to a specific anchor.")
            .usePluginName().specificOnly().parent(TELEPORT_SELF_ANCHOR).build();

    public static final BukkitPerm TP_SELF_EXACT = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.e")
            .desc("Allows the player to teleport self to an exact location.")
            .usePluginName().parent(TELEPORT_SELF_ALL).build();

    private static final BukkitPerm TELEPORT_SELF_PLAYER = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.pl")
            .desc("Allows the player to teleport self to any player.")
            .usePluginName().parent(TELEPORT_SELF_ALL).build();

    public static final BukkitPerm TP_SELF_PLAYER = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.pl")
            .desc("Allows the player to teleport self to a specific player.")
            .usePluginName().specificOnly().parent(TELEPORT_SELF_PLAYER).build();

    public static final BukkitPerm TP_SELF_CANNON = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.ca")
            .desc("Allows the player to teleport self to cannon.")
            .usePluginName().parent(TELEPORT_SELF_ALL).build();

    public static final BukkitPerm TP_SELF_BED = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.b")
            .desc("Allows the player to teleport self to their bed.")
            .usePluginName().parent(TELEPORT_SELF_ALL).build();

    private static final BukkitPerm TELEPORT_SELF_PORTAL = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.p")
            .desc("Allows the player to teleport self to any MV portal.")
            .usePluginName().parent(TELEPORT_SELF_ALL).build();

    public static final BukkitPerm TP_SELF_PORTAL = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.p")
            .desc("Allows the player to teleport self to a specific MV portal.")
            .usePluginName().specificOnly().parent(TELEPORT_SELF_PORTAL).build();

    private static final BukkitPerm TELEPORT_SELF_OPENWARP = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.ow")
            .desc("Allows the player to teleport self to any OpenWarp destination.")
            .usePluginName().parent(TELEPORT_SELF_ALL).build();

    public static final BukkitPerm TP_SELF_OPENWARP = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.self.ow")
            .desc("Allows the player to teleport self to a specific OpenWarp destination.")
            .usePluginName().specificOnly().parent(TELEPORT_SELF_OPENWARP).build();

    private static final BukkitPerm TELEPORT_OTHER_WORLD = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.w")
            .desc("Allows the player to teleport other to any world.")
            .usePluginName().parent(TELEPORT_OTHER_ALL).build();

    public static final BukkitPerm TP_OTHER_WORLD = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.w")
            .desc("Allows the player to teleport other to a specific world.")
            .usePluginName().specificOnly().parent(TELEPORT_OTHER_WORLD).build();

    private static final BukkitPerm TELEPORT_OTHER_ANCHOR = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.a")
            .desc("Allows the player to teleport other to any anchor.")
            .usePluginName().parent(TELEPORT_OTHER_ALL).build();

    public static final BukkitPerm TP_OTHER_ANCHOR = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.a")
            .desc("Allows the player to teleport other to a specific anchor.")
            .usePluginName().specificOnly().parent(TELEPORT_OTHER_ANCHOR).build();

    public static final BukkitPerm TP_OTHER_EXACT = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.e")
            .desc("Allows the player to teleport other to an exact location.")
            .usePluginName().parent(TELEPORT_OTHER_ALL).build();

    private static final BukkitPerm TELEPORT_OTHER_PLAYER = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.pl")
            .desc("Allows the player to teleport other to any player.")
            .usePluginName().parent(TELEPORT_OTHER_ALL).build();

    public static final BukkitPerm TP_OTHER_PLAYER = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.pl")
            .desc("Allows the player to teleport other to a specific player.")
            .usePluginName().specificOnly().parent(TELEPORT_OTHER_PLAYER).build();

    public static final BukkitPerm TP_OTHER_CANNON = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.ca")
            .desc("Allows the player to teleport other to cannon.")
            .usePluginName().parent(TELEPORT_OTHER_ALL).build();

    public static final BukkitPerm TP_OTHER_BED = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.b")
            .desc("Allows the player to teleport other to their bed.")
            .usePluginName().parent(TELEPORT_OTHER_ALL).build();

    private static final BukkitPerm TELEPORT_OTHER_PORTAL = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.p")
            .desc("Allows the player to teleport other to any MV portal.")
            .usePluginName().parent(TELEPORT_OTHER_ALL).build();

    public static final BukkitPerm TP_OTHER_PORTAL = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.p")
            .desc("Allows the player to teleport other to a specific MV portal.")
            .usePluginName().specificOnly().parent(TELEPORT_OTHER_PORTAL).build();

    private static final BukkitPerm TELEPORT_OTHER_OPENWARP = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.ow")
            .desc("Allows the player to teleport other to any OpenWarp destination.")
            .usePluginName().parent(TELEPORT_OTHER_ALL).build();

    public static final BukkitPerm TP_OTHER_OPENWARP = BukkitPermFactory.newBukkitPerm(Core.class, "teleport.other.ow")
            .desc("Allows the player to teleport other to a specific OpenWarp destination.")
            .usePluginName().specificOnly().parent(TELEPORT_OTHER_OPENWARP).build();
}
