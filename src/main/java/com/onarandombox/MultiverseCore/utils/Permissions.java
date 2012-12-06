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


    // ============ Multiverse Normal Permissions ============

    private static final BukkitPerm ACCESS_ALL = BukkitPermFactory.newBukkitPerm(Core.class, "access.*")
            .desc("Allows a player to access all worlds.").addToAll().build();

    private static final BukkitPerm COST_EXEMPT_ALL = BukkitPermFactory.newBukkitPerm(Core.class, "exempt.*")
            .desc("Allows a player to bypass the costs for worlds and MV portals.").addToAll().build();

    public static final BukkitPerm ACCESS = BukkitPermFactory.newBukkitPerm(Core.class, "access")
            .desc("Allows a player to access a specific world.").specificOnly().parent(ACCESS_ALL).build();

    public static final BukkitPerm COST_EXEMPT = BukkitPermFactory.newBukkitPerm(Core.class, "exempt")
            .desc("Allows a player to bypass the costs for a specific world and MV portals in that world.")
            .specificOnly().parent(COST_EXEMPT_ALL).build();
}
