# Changelog

## [2.8.12] - 2018-12-27
### Fixed
- Add missing armor textures (Silent Gear)
- Add missing recipes for torch bandolier [#350]

## [2.8.11] - 2018-12-14
### Added
- Textures for the Supercharger (KelleyEngineering)
### Changed
- Updated hammer textures (SGear) to match new style

## [2.8.10] - 2018-11-19
The Supercharger should now be completely usable in survival. The in-game guide book does not contain any information, please read the [wiki page](https://github.com/SilentChaos512/SilentGems/wiki/Supercharger-(SGear)) instead. Note it's a **multi-block structure** with three possible configurations. The wiki page contains screenshots.
### Added
- Recipe for the **Supercharger** (only appears if Silent Gear is installed)
### Changed
- Recipe for tier 1 charging agent. You will still need to travel to the Nether, but only for glowstone.
### Fixed
- GUIs not opening when playing on a server [#349]

## [2.8.9] - 2018-11-12
### Added
- Chaos iron main material (Silent Gear only) - And yes, I know the textures are broken right now.
### Fixed
- Several missing smelting recipes [#346]

## [2.8.8] - 2018-11-05
### Added
- Extra ore dictionary keys for some gems (mostly common synonyms)
### Changed
- Removed most recipes registered in-code. About 83% of the mod's 1400+ recipes are already converted to JSON and these were redundant.
- Updated textures for ammolite, aquamarine, blue topaz, golden beryl, heliodor, kyanite, morganite, pyrope, topaz (base gem items only, legacy supercharged gems are the same as always)
- Morganite's color has been changed to match the real gem's typical color, salmon pink (applies only to the gem item, your tools are safe... at least for now)
- Rename beryl to green sapphire. Internal names unchanged for now.
### Fixed
- Crash or warning when loading enchantment token recipes if the enchantment has been removed [#340]

## [2.8.7] - 2018-10-17
### Added
- Built-in recipes for enchantment tokens of Cyclic's enchantments [#340]
### Fixed
- Possible crash from mod interaction, exact cause unknown. Adds additional info to log when caught. [#344]

## [2.8.6] - 2018-10-14
### Added
- Supercharger (incomplete, only relevant to Silent Gear)
### Changed
- Optimize ore dictionary lookup for materials (should improve load times slightly) [#341]
- Stop tooltips from being created in certain states to improve world startup/shutdown time [#341]
### Fixed
- Concentration enchantment appearing on incorrect items
- Meecreeps picking up phantom lights [#330]

# Note

Changelog format changed on 2018-10-13. The old log has not changed and follows below. It does not
support markdown and viewing as raw text is recommended.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

2.8.5
Added: Soul urn storage upgrades, basic is 4 rows, advanced is 6. They do not stack.
Added: Soul urn vacuum upgrade. Pulls in nearby items when the lid is off.
Added: Lidless version of the soul urn. Place in a crafting grid by itself to switch between lidded and lidless versions.
Changed: Soul urn can now be dyed any color, like leather armor. Right-click a cauldron with water to remove dye. Existing urns may turn black.
Changed: Soul urn open model rotated so lid is on the right side

2.8.4
Fixed: A crash when Silent Gear is not installed... again (#332)

2.8.3
Added: Soul urns. These are far from finished, so don't put anything too important in them, just in case a later update changes the default inventory size.
Added: Guide book chapter about legacy items
Added: Chaos iron and ender essence blocks
Added: Walking on ender essence blocks gives a levitation effect
Added: EvilCraft's blood chest can now repair Gems tools and armor (#331)
Changed: Updated textures for gem blocks, essence ores, and misc blocks (essence, chaos coal)

2.8.2
Fixed: Crash when Silent Gear is not installed (#327)

2.8.1
Updated for Silent Lib 3.0.0 (hopefully the last compatibility-breaking update for a while)
Added: Enchantment tokens support JSON recipes now

2.8.0
Added: Regular gems can now be used to craft Silent Gear tools and armor. Supercharged gems will not work, expect a new system for that in the future.
Added: New gem textures (regular only, supers are still the same for now, need to change some code for that)
Fixed: Teleporter crash (#325)

2.7.9
Fixed: Crash with Silent Lib 2.3.16

2.7.8
Fixed: JEI plugin
Should fix any broken translations

2.7.7
Removed: TiC integration, moved to new mod (Silent's Gems - TiC Support)
Fixed: Guide book translation

2.7.6
Updated for Silent Lib 2.3.11 (required)

2.7.5
Added: Multi-gem ore. Optionally replaces standard ore generation with a single block that can drop any gem from its respective set. (#294)
Added: Loot table for ender slimes (#269)

2.7.4
Fixed: Return home charm crash (#314)
Fixed (partially): Redstone teleporters being funky. Server still complains, but they work (#293)

2.7.3
Updated JEI plugin
Added: Ore generation configs allow you to set custom blocks to replace (instead of just vanilla stone, netherrack, etc) (#309)
Added: Ore generation configs now allow the dimension blacklist to be a whitelist
Added: Dimension blacklist for chaos nodes and glow roses (#309)

2.7.2
The 'b' build fixes a client-side crash with Forge 2703 (#307)
Added: Advancements. And lots of them!
Added: An additional config for chaos bar position, which will fix the oxygen bar being too high up when disabled (#305)
Added: Sub-items for arrows. No example recipes yet, but they are still craftable (head material + matching rod + feather)
Added: More information on grades to the material grader entry in the guide book... since apparently the terminology section never existed?
Fixed: Numerous errors in the guide book.

2.7.1
Added: Configs to set position of chaos gem charge bars (#296)
Added: Configs to offset chaos bar (#296)
Removed: Stat icon tooltips, will be a separate mod
Fixed: Gem geodes spawning in midair (#297)

2.7.0
Added: Arrows. Should work with any bow that extends the vanilla class. They are crafted like vanilla arrows, but replace the flint with a main part (gem, ingot, etc.) and the stick with a rod of matching tier. The calculated melee damage affects arrow damage. Durability affects the number of arrows per crafting (anywhere from 4 to 64). To avoid a recipe conflict, "flint arrows" cannot be crafted, you will get vanilla arrows instead.
Added: Quivers. They can store four stacks of arrows. Should work with all bows and arrows that extend vanilla classes (i.e. not TiC). Right-click to open, then insert any kind of arrows (even different kinds!)
Added: When holding a bow, the arrow stack you would fire is displayed to the right of the hotbar.
Added: Configs to tweak ender slime spawning. Default weight and max group size have been halved (#292)
Added: Config to disable TiC parts (#295)
Fixed: Air bar color being changed by the chaos bar.
Fixed: A minor error in some chaos rune recipe IDs.

2.6.9b
Fixed: Server crash caused by previous version (#291)

2.6.9
Updated zh_CN.lang (Aemande123)
Added: Stone torches (#290)
Added: Stone rods, used for crafting stone torches or as tool rods (mundane tier)
Changed: Bow, shield, and armor example recipes switched to the new style (#237)
Fixed (maybe): A rare crash caused by concurrent modification exception (#289)
Fixed: Torch bandolier and holding gem pickup sound being way too loud (#282)

2.6.8
Some experimental changes with tool and armor stats. Values should still be the same, but if you spot anything that looks strange, please report it.
Added: Force enable configs for holiday events (existing configs have moved to their own categories) (#277)
Fixed: Potential crashes caused by equipment tools on certain items (#278)
Fixed: Redstone teleporter recipes (#279)
Fixed: Move mob drops to LivingDropsEvent for Soulus compatibility (#280)

2.6.7
Added: Gem geodes. These large but rare deposits spawn in the overworld and similar dimensions, and contain Nether/End gems. Geodes have a tough outer shell which is as strong as obsidian. Geodes have several config options and can be disabled entirely.
Added: Gem regions, disabled by default. If enabled, it selects one or two gems to spawn in each region (12x12 chunks, by default).
Added: Holding gems and torch bandoliers can now pick up blocks from the ground, even if your inventory is full.
Added: Dimension blacklists for all ores (#274)
Changed: Stat tooltips should now work with shears, fishing rods, and Tinkers tools.
Changed: Blacklisted parts no longer appear in recipes (#259)
Changed: Gem blocks now register as beacon bases (#271)
Fixed (probably): Holding gems and torch bandoliers being "repaired" by some less-than-smart machines (#266)

2.6.6
Fixed: Part blacklist not working for rods (#259)
Fixed: Tools with tool souls not being able to mine redstone ore (#262)

2.6.5
Changed: Tweaked Tool Soul XP curve again. It's much steeper now (cubic instead of ^2.5).
Changed: Toul soul XP from combat and harvesting logs reduced. Level bonus applied to ore harvesting also reduced.
Changed: The freezing and shocking effects of the mod's Aspect enchantments are now potion effects.
Changed: Freezing effect now reduces movement speed by 50% per level (halved on players), instead of applying Slowness.
Changed: Shocking effect now reduces attack damage by 30% per level (halved on players), instead of applying Weakness.
Changed: Tool Soul recipe requires a new item in place of the diamond (which itself requires a diamond to craft, but you get 2 per crafting). The new item will have an additional function later.
Fixed: NBT tag getting on the wrong items, interfering with Chisels & Bits pattern placement (#261)

2.6.4
Added: New "tooltips" for tools, weapons, and armor. These render above the vanilla tooltip window and use icons to quickly identify relevant stats. These will also compare the stats to whatever similar item you have equipped (main hand or same armor type) by displaying an green/red up/down arrow. A yellow dash is displayed if the stats are the same. Works on vanilla and most modded tools/weapons/armor. Probably won't work with TiC, I'll see what I can do if I get some time.
Added: Config to allow fake players to level up tools with souls (disabled by default) (#256)
Changed: Sped up chaos altar transmutation (chaos cost is the same)
Fixed: Aerial skill not working properly (#257)
Fixed: Gems with invalid metadata occasionally spawning in chests (#258)

2.6.3
Added: Proper model for tool souls. Shiny!
Changed: Tweaked some tooltips for tools and souls.
Changed: Fire resistance chaos rune will drain only when you are burning, but the cost has been increased by a factor of 10 (400/tick) (#229)
Fixed: TiC parts not being craftable on servers (#245)
Fixed: Poison and Wither runes not damaging the player (#246)
Fixed (probably): Crash when extracting blocks from holding gems (#252)
Fixed: Lumberjack crashing the game if the axe has no soul attached (#253)

2.6.2
Added: Souls get more XP from mining ores or chopping logs. The bonus scales with the soul's level.
Changed: Reduce steepness of soul XP curve
Changed: Stat debuffs on most soul elements reduced.
Fixed: Tool souls can now be applied to armor. Taking damage gives soul XP.
Fixed: Area Miner and Lumberjack not giving correct soul XP.
Fixed: Tilling with hoes not giving soul XP.
Fixed: Soul writing data when tools are in use, resetting harvest progress.

2.6.1 and 2.5.11
Dual release, I guess? We have 2.5.11 for those who prefer release builds, and 2.6.1 for the alpha users. The only difference is that all recipes related to tool souls are removed in 2.5.11.
Added (2.6.1): The Aquatic and Aerial soul skills have additional effects. Check manual for details.
Changed (2.6.1): Made soul XP curve a little steeper.
Fixed: Chaos flower pot not rendering glow rose after world reload (#187)
Fixed: Recipes that use flint (upgrade base, mundane lattice) not working. Apparently I dreamed up that ore dictionary key? (#230)
Fixed: Holding Gems and Torch Bandoliers "working" with Unbreaking and Mending (#233)
Fixed (maybe): A crash when placing different tool rods in the crafting grid (#238)
Fixed (2.5.11 & 2.6.0+): Not being able to apply tip upgrades (#235)
Fixed (2.5.11 & 2.6.0+): Machete magic not working on servers.
Fixed (2.6.1): Tool souls not syncing data properly when playing on a server.

2.6.0
Added: Tool Souls. These are upgrade items for tools and armor that let them level up and gain skills. Crafted with a diamond and four soul gems of your choice (mix and match). If the "tools break permanently" feature is enabled, the tool soul will be returned to you when the item breaks. Currently, there is no other way to remove them, but there will be. These were ported from the failed experimental branch, but have been tweaked and refined a bit. This feature is usable, but is missing some pieces and needs balancing. Feedback appreciated!
Added: Skill Orbs. Can be used to apply skills to tools with souls. Creative-only right now. Hold the skill orb in your main hand, tool in your off, then right-click to apply.
Fixed: Machete magic not working on servers.
Fixed: Not being able to apply tip upgrades.

2.5.10
More under-the-hood changes. Possibly some minor performance improvements.
Added: Patron name colors/formatting.
Added: Gem shards can now be used for decorating, but only restore one tenth of the durability.
Added: Enchantment Tokens now display the mod that adds the enchantment by the enchantment name.
Changed: Armor frames are now parts. Add-ons could add armor frames and make them affect stats. No built-in frames will change stats.
Changed: Armor recipes now use the same system that tool recipes do. They can be modified with CraftTweaker.
Fixed: Decorating not working properly. You can now update tool heads and rods again. Previous changes should not need to be reapplied.
Fixed: When decorating, the output now updates rendering info (colors/models) before crafting.
Fixed: Mod trying to load various unused models that no longer exist (#223)
Fixed: TiC materials having no color (#224)
Fixed (Probably): A crash when nodes attack some entities (seems to be related to some CoFH mod) (#228)

2.5.9
Some behind the scenes work for some new features. Please excuse the dust!
Added: Unique magic for machetes, the scatter shot. Basically, it's a shotgun. Each of the 8 shots is weak, but multiple shots can hit a single target at the same time.
Added: Proper tooltips for rods, finally. It will show the stat multipliers that rods have.
Changed: Tweaked melee/magic damage display values. Both are now consistent with the actual damage (players add 1 damage to all items) that should be dealt, not considering enchantments. Magic displays the number of projectiles and the damage dealt by each.
Fixed: Chaos bar being way too high up when Better With Mods is installed.
Fixed: Gems not having different charge speeds (copy-paste fail of sorts)
Fixed: Ender Slime spawn rates should be more reasonable.
Various minor tweaks and bugfixes.

2.5.8
Bit of refactoring with tools and armor. I'm trying to get armor running on the same code as tools wherever possible, to reduce the number of oddities between updates.
Fixed: Rod decoration not working.
Fixed: Bow animation not working and arrow speed not being correct in some cases.
Fixed: Some recipes accepting (and effectively destroying) extra items (#219)
Fixed: Armor not displaying attribute modifiers. Should still provide the same amount of protection, although you may see slight differences on the armor bar.
Fixed: Armor breaking when breakable tools are not enabled. When armor reaches 0 durability, it will be considered "broken" in the same way as tools. Broken armor provides no protection, but stays equipped.
Fixed: Armor max durability now makes more sense, with mundane tiers being reduced and super tiers being increased.
Fixed: Armor taking twice as much durability damage as it should.
Fixed: Armor can no longer being "repaired" by crafting two pieces together, resulting in a data-less armor piece.
Fixed: Data-less armor is now randomized in the same way as tools.
Fixed: Removed mentions of decorating from the manual.

2.5.7
Rewrote tool construction recipes for flexibility. Hopefully nothing was broken in the process, but keep an eye out.
Added: CraftTweaker support for tool recipes. Allows both the shape to be changed and extra ingredients to be added to the recipe.
Changed: Soul gems will drop again, but they still don't have a use yet. They've been brought more or less up-to-date with the experimental branch, so crop soul gems are in.
Fixed: Tools not updating their colors when breaking/repairing.
Fixed: Node/pylon particles not syncing with clients properly.
Fixed: Area Miner duplicating blocks in some cases (Thermal Expansion machines, for example) (#218)

2.5.6
Added: Halloween Hijinks. Even the baddies wanna dress up! Can be disabled in the config (misc category)
Added: Config to change the way decorating repairs tools and armor. This is under the hardcore/tools category. The new default is MATERIAL_BASED, which restores half the materials durability (considering the grade) to tools, and a quarter for armor. The tool's "repair multiplier" still counts (shovels get twice the repair value, etc.) Change to CLASSIC if you want the old behavior.
Added: Chaos Iron Ingots, a new crafting material
Added: Missing pages in the Crafting Materials chapter of the manual.
Added: (Hardcore) Option to make supercharged gems require ender essence instead of glowstone (disabled by default).
Added: Ender Slimes, a new mob that spawn in the end. They drop Ender Slimeballs.
Added: Transmutation recipes for light gems. Catalyst is Ender Slimeballs, of course.
Changed: Nodes and pylons no longer create entities to transfer effects. They transfer all effects directly to the target block/entity. Note: There are discrepancies between what the client sees and what the server does when playing on servers. I'll work on it.
Changed: Nodes and pylons require a direct line-of-sight to transfer effects. This should ignore blocks with no collision boxes (other nodes, grass, etc.)
Changed: Material grader is now cheaper to craft.
Changed: Material grader now works much faster and uses much less chaos. It can also work without chaos, but at 1/6 of the speed.
Fixed: Gem Shard colors and localizations.

2.5.5
Updated zh_CN.lang (thanks Aemande123!)
Added: Item models for pylons. I may have discovered why they had no models in the first place during this, but... we'll go with the textures I just made for now (#AboutTime)
Changed: Update manual chapters on tools, added chapter on machetes.
Changed: Machetes will not have their sickle effect when sneaking.
Changed: Tomahawks and machetes will only receive their usual speed decrease when mining wood/ladders/pumpkins/melons/etc. Machetes should cut cobwebs about as quickly as swords now.
Changed: Increased harvest speed of machetes and tomahawks a bit.
Fixed: Harvest tools being able to harvest blocks they shouldn't be able to, such as mining stone with shovels/axes (#213)
Fixed: Chaos projectiles not rendering on servers (hi darkphan!)
Fixed: Tool subitems are now cached, should prevent duplicates with different UUIDs in JEI.

2.5.4
Changed: Rendering data (models/colors) for tools and armor is no longer stored in NBT. In my tests, this currently results in a ~10% FPS loss with a hotbar full of tools. In standard play, probably 5%. I'll look into possible optimizations later, but this is necessary to fix issue #212 (keep reading).
Fixed: An issue with the PlayerStorage mod, where tools and armor get stuck in storage due to client-side NBT being different (#212).

2.5.3
Added: Machetes, a new type of sword. Slower than standard swords, higher melee damage, and lower magic damage. They can clear vegetation in the same way sickles can, but with a smaller range. They can also be used as an axe, but are not as fast (similar to tomahawks). They don't have their own magic yet and will default to what swords do.
Added: Swords given to zombies/skeletons have a chance of being machetes (40% of swords given, by default).
Added: (Hardcore) Config to make tools break permanently (disabled by default).
Changed: Daggers now fire single homing shots, instead of classic sword shots. They aren't quite as effective at homing as scepter shots, but are much cheaper to fire. They also don't fly into the air before homing, so aim accordingly.
Changed: Katanas fire 5 shots instead of 3, but with a narrower angle.
Changed: Swords fire 2 shots instead of 1, with the second shot being angled upward slightly.
Changed: Clearing areas with the sickle will now only break blocks of the same type you targeted. For example, break tall grass and it will leave flowers in place.
Changed: Sickles now take 2 damage per use (down from 4).
Changed: Tool construction tooltip (hold Alt) now lists the tool's rod.
Fixed: Client sync issues with magic (homing shots should look much less funky, and you won't see double shots now).

2.5.2
Fixed: A possible server crash caused by shields.
Fixed: Return Home Charm and Shield models/colors
Fixed: All remaining block models/textures/localizations, aside from pylons. At this point, almost all block textures are now 16x16. There are a few 32x32 stragglers that I'm not sure can be downsized well. But don't tell anyone, maybe they won't notice. ;)

2.5.1
Added: Hoes now have a super skill, Row Tiller. Tills a line of 9 blocks at once. Use the "toggle special" keybind to enable.
Added: Shields now have a Magic Protection stat. Reduces magic damage when blocking. This stat is determined mostly by the Magic stat of the materials, with Protection influencing it a bit.
Removed: The "Blocking Power" stat of shields. This has been obsolete and useless since 1.11.
Added: Alpha greeting and a link to a strawpoll (set to expire at the end of October 2017).
Fixed: Crash when Tinkers Construct is not installed (#BlameEclipse)
Fixed: TiC part localizations.
Fixed: Missing chaos gem models.
Fixed: Missing models, textures, and localizations for bricks.

2.5.0
Added: 16 new gems. These "light" gems will spawn only in the End. Many new block will be missing localizations/models/textures for a bit. Please be patient as I work on these.
Added: Broken tool head textures. These are colored at runtime, so the exact color may differ from the non-broken head.
Changed: Tool heads now have only one layer, instead of two or three. This kind of removes decorating, but you can change the appearance of the entire head by putting a material above the tool. Mixed material tools are still possible, but only one material will effect the appearance.
Changed: The hues of dark gems have been tweaked, so they are no longer just darker versions of the classic (overworld) gems. Light gems also have unique hues. The differences are subtle in many cases, but I think it's a big improvement.
Changed: Every tool head has a separate texture for each gem now. Dark gem tools are much more vibrant.
Changed: Many block textures have been updated (much more work to do). Gem blocks/ores have changed, fluffy blocks are now 16x16.
Changed: Bow speeds are a bit more balanced, with non-super bows being notably faster.
Changed: Bows now display draw speed and arrow damage as a factor of vanilla bows. Draw speed replaces draw delay, so higher numbers are better now.

2.4.8
Added: Config to override particle settings for chaos nodes (#200)
Changed: Remove soul gem drops for now, since they have no use.
Changed: Guide book widgets texture updated with Patreon button (Silent Lib 2.2.8)
Fixed: Removed a debug line I mistakenly left in.

2.4.7
Added: A blacklist and whitelist for chaos node repair packets (#194)
Fixed: Repair packets not repairing gem tools
Fixed: Sickles no longer turn double tall grass into sunflowers when right-clicking (#202)
Fixed: Added sanity checks to "Min Y" and "Max Y" in ore configs (#203)
Fixed: Some mistakes in selecting the number of veins per chunk (the decimal part was either being ignored or the probability was inverted) (#203)

Fixed: [1.10.2, 1.11.2] Tools can no longer be "repaired" by crafting them together, resulting in randomized tools (#188)
Fixed: [1.10.2, 1.11.2] Tools gaining one durability when placed in an empty crafting grid, or with materials that do not restore durability (#189)
Fixed: [1.10.2, 1.11.2] A recipe for ornate silver rods is no longer added if there are no silver ingots (#190)

2.4.6
Added: Scaling Health blights can now receive gem swords
Added: Configs to ban mod enchantments from the enchantment table. Tokens will still work.
Fixed: Tinkers Construct support is back. Colors are currently broken, but parts are craftable.

2.4.5
Marked compatible with 1.12.1.
Fixed: Armor rendering (courtesy of TechnicianLP). It's still broken in my personal pack, but works properly in my development environment.

2.4.4
Changed: Custom armor rendering is disabled for now... it's super broke.
Fixed: Daggers not checking for their recipe's "filler" item... again.
Fixed: Tool crafting resulting in randomized tools when attempting to mix rods, which is not allowed (#186).
Fixed: Tools can no longer be "repaired" by crafting them together, resulting in randomized tools (#188)
Fixed: Tools gaining one durability when placed in an empty crafting grid, or with materials that do not restore durability (#189)
Fixed: A recipe for ornate silver rods is no longer added if there are no silver ingots (#190)
Fixed (maybe): Armor randomly applying twice the protection value it should (#172)

2.4.3b
Fixed: Fatal error when using non-super-tier sword on servers (#179)

2.4.3
Fixed: Cascading worldgen issues (#181)
Fixed: [1.12] Container GUIs not rendering tooltips.
Fixed (maybe): A crash when using the swapping wand on Nether gem ore (#183)

2.4.2
Fixed: [1.10.2, 1.11.2] More rendering crashes (chaos gems, armor bar, crosshairs, armor) Armor rendering is broken, but at least it won't crash.

2.4.1
Fixed: [1.10.2, 1.11.2] Client crash caused by chaos pylons.

2.4.0
Updated to work with 1.11.2. Support for 1.10.2 on the way.
Added: Config to show chaos bar at all times, instead of just when you gain/lose chaos (disabled by default)
Changed: Chaos bar has been replaced with something nicer looking (icons above your food bar)

2.3.19
Silent Lib 2.2.4, Forge 2387
Replace classic example tool recipes with new Ingredient-based ones.

2.3.18
Updated for Silent Lib 2.2.3 and Forge 2373
Minor bugfixes

2.3.17
Fixed: Some minor guide book issues.

2.3.16
Added: Ice Aspect enchantment. Slows/freezes the victim and causes continuous damage for a short time. Effect reduced on players. Deals extra damage to mobs immune to fire.
Added: Lightning Aspect enchantment. Weakens the victim and causes continuous damage for a short time. Effect spreads to nearby mobs.
Added: Enchantments category to guide book.
Fixed: Some crashes related to enchantment tokens (#165, #167)
Fixed (maybe): Right-click function of tools being able to place bonus ores from "Level Up!" This only effects older versions like 1.10.2, I think?

2.3.15
Added: Config option to remove all node packets on server/world load. Enabled by default. Should prevent some rare crashes (#163)
Changed: Will complain about broken tool parts instead of crashing (#160)
Fixed: Chaos nodes not detecting players in some cases.

2.3.14
Added: Configs to enable/disable specific tiers of each tool class. For example, you could allow katanas to be made from anything now. You're welcome!
Changed: Tool tooltips tweaked: Statistics moved to the 'Alt' group, added a tier lable under Properties.
Changed: Tool names are now colored by tier (enchanted mundanes and regulars will still become aqua).
Fixed: Holding gem and torch bandolier status text not being formatted on servers (#159)
Fixed: [1.10.2] Client-side crash when shift-right-clicking chaos orbs (#162)
Added some additional information to diagnose a crash caused by broken/invalid tool parts (see #160).

2.3.13
Added: More missing guide book chapters. I think we are around 80% complete? Just a guess.
Fixed: Left-click item functions not working on servers (#156)
Fixed: Chaos node packet renderers (#156)
Fixed: Sword projectiles no longer collide with tall grass, plants, and some other blocks they shouldn't.
Fixed: Katana projectiles no longer climb tall grass, plants, or high walls.

2.3.12
Added: Tool randomizer. Will randomize "NBT-less" tools in the player's inventory (acquired by the 'give' command and certain other... methods) (#149)
Changed: NBT-less tools that cannot be randomized have more informative tooltips (#148)
Fixed: [1.10.2] Tomahawks not being throwable (#152)
Fixed: Error textures of NBT-less tools (#148)
Fixed: Dagger recipe detection ignoring the filler item (#154)
Fixed: Entity renderers not working properly... finally.

2.3.11
Added: Variety cap config (max number of parts to effect variety bonus).
Added: Rods can now affect tool stats. They apply multipliers by default. (See API change below)
Fixed: Yet another enchantment token crash, caused by missing registry names. Bugged enchantments (such as the ones Good ol' PvP overwrites) will not be craftable. Also update Silent Lib to be completely(?) crash-free.
Fixed: Crash or server console spam when using paxels on certain blocks.
(API) Added: ToolStats class and applyStats method to all ToolParts. Mains don't allow the use of applyStats, but others can override it to apply custom logic to how the part affects tool stats.
API: Version 3

2.3.10
Fixed: Server crash with new guide book features.

2.3.9
Updated for latest Silent Lib (new guide book features)
Updated the guide book even more. Still a lot left to write.

2.3.8
Added: Daggers! What they lack in power, they make up for in speed and low cost. They also reduce the invulnerability time of mobs they hit, allowing them to be damaged again sooner. Dagger recipes are a bit different: a single material, a rod below, then a "filler" item below that. The filler is string, an iron ingot, or a gold ingot, depending on the tool tier. The filler should help reduce recipe conflicts. It also means I have to rewrite much less of the tool recipe code...
Added: Config to disable spawning with new guide book.
Added: Super-tier hoes will now till a 3x3 while sneaking.
Added: Missing tool chapters to the manual.
Changed: Updated bow and scepter textures to 16x16.
Changed: Updated katana textures. Blade is now wider, looks better.
Fixed: The "infinite flight" bug, which returned with a vengeance (the lingering flight effect will go away after 5-10 seconds).

2.3.7
Added: A Silent Lib guide book. Requires Silent Lib 2.1.0 or higher. Incomplete, feedback appreciated.
Removed: The Guide-API guide book, due to compatibility issues.
Fixed: A crash when using block placers (like the Torch Bandolier) (#140)

2.3.6
Added: Paxels! A pickaxe, shovel, and axe all-in-one. Takes a whopping six material items to craft. Repairs are 30% less effective. Extra durability, but has a small mining speed penalty. Super-tier only and has the Area Miner skill. Feedback welcome (#138)
Changed: Katana and scepters now have 25% less durability.
Changed: Shovels get 2x durability restored when decorating.
Fixed: A sorting error with Enchantment Tokens.
Fixed (kinda): Catch and log an Enchantment Token crash. Please share logs if you experienced this (#139)

2.3.5
Fixed: Chaos Altar not syncing rendered item on world load.
Fixed: [1.10.2] Crash when trying to view creative tabs (#134)
Fixed: [1.10.2] Crash when right-clicking with a shovel (#133)

2.3.4
Fixed: [1.10.2] Crash when trying to plant fluffy puffs (#132)
Fixed: [1.10.2] Right-click harvest not working on fluffy puff plants.

2.3.3
Added: Chaos Runes for ToughAsNails heat/cold resistance and thirst.
Fixed: [1.10.2] Crash when using hoes (#130)
Fixed: [1.10.2] Crash when using right-click-to-place (#130)
Fixed: [1.10.2] Crash after crafting armor (and all remaining item-from-NBT errors) (#131)

2.3.2
Added: Area Miner and Lumberjack will now warn the player if they don't have enough Chaos.
Fixed: [1.10.2] Various right-click crashes with tools and weapons.
Fixed: [1.10.2] Failure to create the Guide-API guide book should no longer crash the game.

2.3.1
Added: Chaos Gem charge bars are back.
Fixed: [1.10.2] Tools not getting their sub items (error tool showing in JEI, etc.)
Fixed: [1.10.2] Crash on tool creation.
Fixed: [1.10.2] Crash on block pickup.
Fixed: [1.10.2] Most missing block and item models.
Fixed: [1.10.2] Teleporters not functioning.
Fixed: [1.10.2] Localized names of overworld gem ores.
Note: Material Graders were not dropping their inventory when broken. Update Silent Lib to 2.0.3 or higher to fix this.

2.3.0
Cross compatibility build

2.2.9
Fixed: A Guide-API crash (requires Guide-API 2.1.0-49)
Fixed: Chaos Altar and Pylons not dropping their inventories when broken.
Fixed: Chaos Flower Pot not syncing with the client, causing the glow rose to be invisible.
Fixed: A crash when enchantment tokens have an enchantment that no longer exists.

2.2.8
Changed: Enchantment Tokens now have 16x textures like most other items. Mostly. I cheated a little bit with the kanji... It was either that or get rid of them. I'll also need to tweak the 32x texture pack a little bit.
Fixed: A crash with enchantment tokens when an enchantment has a null type (#109, #112)
Fixed: Error message in server console (NoSuchMethodException ItemBlock#canPlaceBlockOnSide) (#110)
Fixed: Enchantment tokens for "wearable" enchantments (such as Curse of Binding) now have the armor icon.

2.2.7
Added: The Holding Gem. It works like the torch bandolier, but you can set it to store any block! Craft an empty holding gem with a block to "set" the block in the gem. When placed back in your inventory, it will absorb the set block from your inventory. Right-click to place blocks from the holding gem (works with the right-click-to-place feature of tools). Sneak and left-click to eject a stack of blocks. Sneak right-click to toggle auto-fill mode. Again, it's the same as a torch bandolier, just more flexible.
Fixed: Burner Pylons eating fuel (#106)
Fixed: Another 1.11.2-exclusive enchantment token crash (#105)

2.2.6
Update to Silent Lib 1.2.0 required!
Fixed: Vein Miner compatibility module. Hopefully. Couldn't find a fix for 1.10.2.
Fixed: Chaos Flower Pot rendering a ruby glow rose when empty.
Fixed (maybe): A crash when applying enchantment tokens in 1.11.2.
Switched to Forge blockstates for most blocks. Should have no visible effect on the mod (aside from fixing missing textures on gem blocks). Report missing models. It does reduce the file count by over 800, so... yay?

2.2.5
Updated most item textures to 16x16.
Added: Out-of-the-box VeinMiner support. No more adding tools to the config yourself!
Added: Properly implement canHarvestBlock for tools (Forge and vanilla versions). Should help with some compatibility issues.
Added: Torches can now be removed from the torch bandolier by left-clicking while sneaking (preferably in the air with auto-fill off)
Added: Missing torch bandolier tooltips.
Added: Torch bandolier mode toggle messages to the action bar.
Fixed: Damage bar colors for Chaos-storing items.
Fixed: JEI subtype interpreters (easier recipe lookup)

2.2.4
Fixed: Super-tier tools harvesting at Area Miner/Lumberjack speeds when their skill is not activated.

2.2.3
Fixed: Crash when using the Material Grader.
Fixed: Tools not incrementing their "blocks mined" statistic.
Fixed: Some missing localizations.
Fixed: Removed a debug message that displays everytime a block is mined.

2.2.2
Updated the 1.11 version finally... Decided to redo the port so I wouldn't miss anything. 1.11 will likely become the main version for development at this point.
Changed: Replaced existed textures with all the 16x16 textures I've made at this point. Majority vote was for 16x16 textures, so... here you go!
Fixed: Torch Bandoliers. They work now.
Fixed: The "right-click to place" ability of harvest tools.

2.2.1 (Minecraft 1.10.2)
Changed: Damage type of super sword projectiles to magic.
Fixed: A server crash caused by the addition of Chaos Gems
Fixed: A crash caused by hitting a block with gem tools other than harvest tools.

2.2.0 (Minecraft 1.10.2)
Added: Chaos Gems are back! Instead of being limited to 3 buffs, they have a slot system now. You can have however many buffs you want, so long as the slot limit is not exceeded. Different buffs cost a different number of slots. Each level past the first costs just 1 extra slot (Speed I = 4 slots, Speed II = 5 slots, etc). There are also debuffs (slowness, mining fatigue, etc) that give slots back. For example, you could sacrifice your speed to squeeze an extra buff on a single Chaos Gem.
Added: Chaos Gem Capacity rune. Increases Chaos storage by 1 million per rune. Consumes 1 slot each, max 4.
Added: Chaos Gem Recharge rune. Adds self-recharge, replaces mini pylons. Consumes 1 slot each, max 4.
Added: Gravity enchantment. Reduces/eliminates (depending on level) the speed penalty for mining while flying or underwater.
Added: Config to change axe super skill to Area Miner.
Added: Chaos Orbs can now recharge other items (Chaos Gems, Return Home Charms, etc.) Their break chance is greatly reduced when charging items.
Changed: Refined Chaos Orbs can now crack 4 times (up from 2) before breaking.
Changed: Altars now charge items ten times faster.
Fixed: Chaos direct transfer not recharging players' items.
Fixed (maybe): A crash with enchantment tokens. Waiting for more info, so not sure.

2.1.11 (Minecraft 1.10.2)
Added: Tinkers Construct support. Work in progress, there are no traits yet, but gems can now be used to craft TiC tools... you dirty traitors. Just kidding. Maybe.
Added: Chaos direct transfer config. Chaos energy will be sent directly to the target if enabled, instead of relying on the packet entities. Might help performance on worlds with large numbers of nodes/pylons.
Added: Harvest level in tooltips for tools now has a hint at what it can mine.
Changed: Chaos Nodes have potentially been optimized a bit. Target lists are obtained only when needed and the number of attack and levitation packets that can be spawned each time is capped to 10.
Fixed: Mobs spawning only with katanas on hard difficulty.

2.1.10 (Minecraft 1.10.2)
Added: A config GUI. Finally. Now you can configure the mod in the Mods menu in-game (note that some categories will still require you to restart Minecraft).
Changed: Material Grader now has 4 output slots (and its own GUI texture, instead of using the one for the Altar)
Changed: Material Grader now renders its input item on the block.
Changed: Material Grader now requires more time and energy to process materials.
Changed: Chaos orbs now retain charge when upgrading... at least if you don't shift-click...
Changed: Bumped up some gem stats a bit. You should now be able to produce 20+ damage swords/katanas (still need tips and enchantments as well to make that happen).
Changed: SS and SSS grade bonuses increased to 24% and 32% (up from 20 and 30)
Changed: Broken tools are now less effective at harvesting blocks...
Changed: Sickles now used 4 durabilty per usage (cutting/harvesting plants, attacking is the same)
Changed: Tools now register with a fake tool material with harvest level 1 (previously used diamond). Should allow most Progressive Automation machines (stone and above) to use gem tools. Let me know if there are any other side-effects (mods no longer accepting tools, etc.)
Changed: Invalid tools now render a little something, instead of being invisible.
Fixed: Material Grader desync when playing on servers (Chaos/progress bars going haywire, items appearing in the output slot when they aren't really there, etc.)
Fixed: JEI can now tell the difference between gem tools... to some extent, at least. Enough to separate the example recipes. #AboutTimeSilent
Fixed: JEI can now tell the difference between enchantment tokens.

2.1.9 (Minecraft 1.10.2)
Added: Holiday cheer is back! (can be disabled in the config file)
Added: A link to a poll when you first log in. I want opinions on textures... Link will stop showing by the end of the year. I've tried to make this as unobtrusive as possible, but I REALLY want everyone's feedback on this!
Changed: The armor lattice recipe now makes twice as much (one set is enough for a full suit of armor)

2.1.8 (Minecraft 1.11)
Disabled "right-click to place" ability of digging tools for now. It was causing tools to disappear or become corrupted because of changes in item usage in 1.11.
Fixed the mod ID being incorrect in some places.

2.1.7 (Minecraft 1.11)
Requires Silent Lib 1.1.3!
Fixed: Weirdness with tile entities, causing them to not retain their states/inventory and possibly crashing.
Fixed: Node packet renderers (white cubes)

2.1.6b
Fixed: Crash when crafting armor.
Fixed: Minor issues with certain recipes when parts are disabled.

2.1.6
Added: Proper version checking for Silent Lib...
Added: Chaos Altar transmutation recipes to convert light gems to dark gems and vice versa. The catch is you only get 6 shards, so a third of the gem is lost.
Added: JEI recipe handler for Chaos Altar transmutation.
Added: Chaos Altar entry to guide book (requires Guide-API)
Changed: Chaos Essence creation through the Altar now requires 4 shards, more Chaos, and a diamond as a catalyst (not consumed).
Fixed: Chaos Altar displaying a stack size of 1 in many cases (typically the input slot)
Fixed (maybe): Chaos Node ConcurrentModificationException.

2.1.5
Added: Config options for disabling tool parts and tool classes. You can disable entire tiers (eg you only want super-tier tools to be craftable), or blacklist individual parts.
Added: Sub-items for tools now include add-on parts (tools made with stuff from Extra Parts will be listed). Recipes not listed. If you can't figure that much out... I pity you (read CurseForge page, specifically the "Crafting" section under "Tools and Armor")
Removed: The empty fishing rod item.
Fixed (probably): Chaos Node spam on servers... seems chunkloaders cause some of their packets to have invalid targets?

2.1.4
Updated for Silent Lib 1.1.0

2.1.3
Added: Additional checks to item rename packets. Should help prevent odd name swapping bug that pops up occasionally. If you encounter tools/armor with incorrect names, please send me a server log.
Added: Chaos Altar catalyst slot (the new one in the middle) now functions... but is still not used.
Fixed: Chaos packets not loading their target position correctly. Fixes vanishing packets and log spam.
Fixed: The One Probe and Wawla displaying dark gem ores incorrectly.

2.1.2
The WIP Sky Block Update! Let me know how this works out. New features and tweaks may still need balancing, but I want to get this build out ASAP because it fixes a crash.
Added: Chaos Altar Transmutation. Put certain items in the Chaos Altar to turn them into other items. Requires Chaos to work. Currently just one recipe: Chaos Essence Shards to Chaos Essence.
Added: Glow Rose Fertilizer. Use it like bonemeal to grow glow roses.
Changed: Capacity of Chaos Altar and Pylons greatly increased.
Changed: Chaos Altar recipe is now much cheaper.
Changed: Tweaked weights for loot.
Fixed: A crash with recent Forge versions related to Chaos Nodes ("Don't know how to add class...")
Fixed: The gilded string recipe. For real this time... I think. (It's supposed to make 3, not 1)

2.1.1
Changed: Bows now affect the damage of the arrow (based on the melee damage stat)
Changed: Bow minimum draw delay is now 10 ticks (previously 5)
Fixed: Server disconnect with saturation (orange) Chaos Node packets.
Fixed: Phantom Lights being placed inside multi-block tanks and breaking them in some cases. This should also prevent problems with most multi-block structures.
Fixed: Silver bow "rod" texture.
Fixed: Material Grader not being rotated correctly.

2.1.0
Added: Bows display draw delay (basically the fire rate).
Added: Times thrown statistic for tomahawks.
Added: Tomahawks spawn particles after hitting something. Should make finding them a bit easier since they still seem to render in the wrong place sometimes.
Removed: Beta greetings.
Changed: Thrown tomahawks will despawn after 10 minutes now.
Changed: Improved tomahawk block collision detection a bit.

2.0.33
Fixed: Enchantment token recipes getting mixed up when new enchantments are added to an existing world. All existing tokens with enchantments will no longer work, but can be crafted back into the blank tokens.

2.0.32
Added: Concentration enchantment, which boosts magic damage. Cannot be applied with other damage-boosting enchantments (Sharpness, etc.)
Added: Life Steal enchantment is back. Restores your health a bit when you deal damage. Token recipe is different.
Added: A colored outline for enchantment tokens. Should make finding the one you want a bit easier.
Removed: Old, unused bow textures.
Changed: Small buff to magic damage.
Changed: Shield colors are now properly cached, which should improve FPS some.
Fixed: Enchantment tokens allowing conflicting enchantments to be applied.

2.0.31
Road to Release! I will be focused on fixing/polishing things instead of new features.
Added: Configs for tomahawk ammo (maximum and the amount restored when decorating).
Added: A Chaos bar to the Material Grader and Chaos Altar GUIs.
Added: You can now get headshots with tomahawks, which deal double damage.
Added: Particles (damage dealt and crit) for tomahawks.
Added: A magic cooldown. Mostly to prevent accidental spam when looking at a block.
Added: Config to change the variety bonus for mixed-material tools.
Changed: Default tomahawk max ammo to 4.
Changed: Default tomahawk ammo per material when decorating to 1.
Fixed: Some desync with the Material Grader causing it to display incorrect values. Hopefully. Let me know if issues persist.
Fixed: Materials that restore no durability when decorating will no longer restore ammo.

2.0.30
Added: Tomahawks! They can be used as a melee weapon or thrown. Throwing them deals much more damage. Thrown tomahawks can be retrieved by walking over them. Lost tomahawks ("ammo") can be replaced by decorating. They can also chop wood, but not very well.
Added: Recipes for enchantment tokens with some mod enchantments (Ender Core/IO/Zoo)
Changed: Enchantment Tokens are now sorted (first by type, then by enchantment name)
Changed: Default Ender Essence ore frequency significantly reduced.
Fixed: Bows are animated now. Shouldn't have any major performance impact.
Fixed: Broken bows being destroyed and some other bow bugs.
Fixed: Gem lamps not responding to redstone (guess that broke in 1.10?)

2.0.29
Added: Bows! Still a work in progress, but should be craftable and usable. Animation does not work and some parts do not render properly.
Removed: Some debug text being output to console.

2.0.28
Actually fixed my Guide-API issues >_<
Tweaked shield damage reflection, add minimum blocking power.

2.0.27
Fixed: Shield decorating not working.
Fixed: Third-person rendering of shields being a bit funny.
Fixed: Fluffy puffs being rejected by Random Things' fertilized dirt.
'b' build:
Fixed: A Guide-API crash.
Fixed: Shields in JEI showing incorrect recipes.
'c' build:
Added: Guide-API error handling. No more crashing, but you won't get a guide book if an error occurs. I'm currently looking for fixes to these issues.

2.0.26
Added: Shield models! They render like normal items, so might not be what you would expect... I think they look alright, but textures need a little touching-up.
Fixed: Shields trying to load a bunch of non-existent models and scrambling tool textures.
Fixed: A crash when planting fluffy puff seeds.

2.0.25
Added: An early version of shields! Modular, functional, and craftable... but no models yet. Enjoy the big red X.
Fixed: Non-blank enchantment tokens being usable in all token recipes.

2.0.24
Changed: Raised the attack speed and damage of broken tools.
Fixed: Tool attribute modifiers displaying strangely (ie -3 attack speed instead of 1)
Fixed: Transparent player hand in first person (1.10.x specific?)
Fixed: Non-swords (such as axes) breaking completely in some cases when used as a weapon.
Fixed: Node repair packets repairing some things that shouldn't be repaired.
Fixed: Some log spam.

2.0.23
Added: Gem Glass! It's like stained glass, but gem colors.
Added: Enchantment Tokens display materials in tooltip.
Changed: Improved the drawing compass behavior a bit more, add some localizations.
Fixed: Armor not losing durability sometimes.

2.0.22
Changed: Drawing Compass particles. I think they look a lot better.
Fixed: Drawing Compass model errors.
Fixed: Some tool crafting bugs (non-matching rod crash, extra items being consumed)
Fixed: Burner pylons rendering as passive pylons on world load.
Fixed: Burner pylons not displaying their inventory.

2.0.21
Tweaked some gem stats a bit. Tools in your inventory will update when you log in.
Fixed: Crash when rendering armor with no NBT (/give command, Lucky Cases, etc.)

2.0.20
Added: Chaos Node levitation packets (green). Targets hostile mobs, making baddies fly away!
Added: Chaos Node saturation packets (orange). Restores a bit of hunger, but they are uncommon.
Added: Configs for mobs spawning with gem swords and coffee drops (wait, this mod adds coffee?)
Added: Some debug info for the Return Home Charm, might help solve the 'Destination Obstructed' bug.
Fixed: A potential (and very bad) issue with profiling (massive FPS drops, I'm so sorry!)
Fixed (maybe): Some issues with teleporting, such as creation of Nether portals.

2.0.19
Ported to 1.10 (a single import change... seriously?)

2.0.18
Added: Chaos Node regen packets.
Added: Headcrumbs mobs can now spawn with gem swords, and do so more often than zombies.
Added: Kill count statistic for all tools (displayed for swords and axes)
Changed: Material tooltips improved (reorganized and colored). Also added the missing 'Attack Speed' stat.
Changed: Tool tooltips improved.
Changed: Pylons emit Chaos packets in a more controlled manner.
Fixed: Armor not having correct enchantability.

2.0.17
Added: Basic models for armor, tier-specific models in the works. With this, armor decorating works. Item models unchanged at the moment. (M4thG33k)
Added: Zombies and Skeletons have a chance to spawn with custom gem swords/katanas.
Fixed: Flint tools having the wrong color.
Fixed: Potential crash/error with MessageItemRename packets.

2.0.16
Fixed armor protection! Up to 20 armor points (10 pieces, a full bar), armor should be identical to vanilla. Past that, each point adds 1% additional damage absorption.
Added: Bonus armor bar. Armor values past 20 points will render gold armor pieces on top of the normal armor bar.
Added: Standard armor types to subitems and recipes for JEI.
Added: Temporary armor item textures, complete with color! Temporary armor models are still just white...
Fixed: Tools and armor correctly save the original owner's name now. They also display it when Ctrl is held.

2.0.15
Lots more work on armor, lots more to be done.
Added: Armor detailed tooltips.
Added: Secrets.
Changed: Default keybinding for 'Toggle Special' is now Shift + C.
Changed: Armor protection values now round to nearest int, instead of truncating.
Fixed: Armor durability and protection values.
Fixed: Possible rounding errors when calculating tool stats.

2.0.14
Added: Armor crafting (still needs some work, but usable)

2.0.13
Updated for Silent Lib 1.0.9
Added: Config to disable recipes for Frost Walker and Mending enchantment tokens (treasure enchantments).
Added: Sag Mill recipes (Ender IO) for ores
Fixed: Material grades not being applied to all tools (notably single-material pickaxes).
Added more foundation for modular armor (no, nothing works yet). Tool main parts will now display a "Protection" stat. As for what the numbers mean... I'm not entirely sure. They may change, so assume nothing!

2.0.12
Ported to 1.9.4.

2.0.11
Note: The tool system has had some tweaking done! Tools in your inventory when you log in will be updated automatically. Others can be fixed by placing them in a crafting grid.
Added: Tier tooltips for tool materials and rod. Rods display a list of compatible tiers, not the rod's actual tier.
Added: Loot table stuff.
Changed: Tool material stats are now displayed for all tool materials, not just gems. This includes materials from add-ons.
Changed: The "NONE" text for ungraded materials can be localized now, and is "None" for en_US.
Fixed: Melee (attack) damage of tools should be more consistent with vanilla 1.9 now.
(API) Added: A way to set the color of individual parts.
(API) Added: A way to set part display names and prefixes. These are used in tool name generation.

2.0.10
Mark as Beta.
Updated for Guide-API 2.0.0-31.
Changed: Some greetings.
Fixed: Return Home Charm not working well across dimensions (false positive on obstruction check)

2.0.9
Added: Chaos Flower Pot. You can plant glow roses in it, which will emit more light than normal and place "phantom lights" up to 15 blocks away.
Added: Gem Lamps are back.
Added: Drawing Compass. It draws circles and lines with particles. Click two blocks, sneak + click to clear.
Added: A function for the magnifying glass. Usefulness is questionable.
Changed: Teleporters can now draw Chaos from the player and the player's inventory, if necessary.
Fixed: Many items being usable as furnace fuel that shouldn't be.
Fixed: Chaos Altar not rendering in world. (M4thG33k)
Fixed: Katanas in JEI/creative tab missing default grip.
Fixed (maybe, probably not): A rare random crash in PlayerDataHandler.

2.0.8
Added: A guide book. Finally. Requires Guide-API to be installed (optional, but you won't get the guide without it).
Changed: Glow Rose textures. I think they're OK, but let me know if I'm wrong.

2.0.7
Added: Chaos Altar is back. Leave items that store chaos in an altar to recharge them! (Yes, I know it's invisible)
Changed: Pylons now send Chaos to blocks using packets, like nodes.
Changed: Pylons and nodes will evenly split Chaos among all available targets.
Fixed: Chaos Pylon renderers (M4thG33k)

2.0.6
Added: Return Home Charm is back. It run on Chaos now, like teleporters.
Added: Chaos Essence/Coal blocks.
Added: Pet summoners are back.
Changed: Toned down Chaos Node particles a bit (fewer, slower, and bigger). They still respect particle settings.
Fixed: Chaos Coal not being usable as fuel.
Fixed: Teleporter Linker missing model when active.
Fixed: Teleporter Linker HUD graphical glitches.
Fixed: Spent Node Mover being usable without repairing.
Fixed: Material Grader missing texture.
Fixed: Server crash with Material Grader.

2.0.5
Added: Teleporters are back! They run on Chaos now, rather than XP. The math is about the same: it charges for horizontal travel only and short trips are free.
Added: Chaos Node Mover. Reusable, but must be repaired with nether shards after use.
Changed: Broken tools can no longer place blocks.
Fixed: Shovels not being able to make grass paths.

2.0.4
Added: Enchantment Tokens! Everyone's(?) favorite feature is back. Recipes have changed slightly, please check JEI. Mechanics have also changed:
  1. Enchantment Tokens for ALL enchantments should be generated, although only vanilla ones (not other mods) have recipes.
  2. Tokens can be applied to anything the enchantment would normally work on. Tokens on Elytra, anyone?
  3. Enchantment tokens can carry multiple enchantments (currently not possible without cheating)
  4. Enchantment tokens can have enchantments with levels greater than 1 now (currently not possible without cheating)
Added: Supercharged gem blocks. Supposed to be wither-proof, but I haven't solved that problem yet. Highly blast-resistant, but cannot be uncrafted! Made with 1 obsidian and 4 supercharged gems.
Added: Gem bricks. As before, they have 'coated' and 'speckled' versions, as well as light/dark versions like all gem blocks. That's a total of 64 bricks to choose from.
Added: Chaos node 'packets'. Little balls of goodness that nodes spew out:
  1. Attack packets will seek and damage hostile mobs.
  2. Repair packets will seek players and repair a damaged item slightly.
  3. Chaos packets are roughly the same as before. They recharge Chaos.
Fixed: Chaos packets being sent to players who are full.
Fixed: Chaos node packets not rendering on servers.
Fixed: Chaos nodes not sending chaos to blocks.
Fixed: Tools missing the "-Tipped" line in their tooltips.
Fixed: Tipped upgrades missing their tooltips

2.0.3
Updated for Forge 1833. Update Silent Lib to 1.0.3!
Added: The Material Grader. Insert main tool parts (ie gems, flint, etc) to assign a random grade. Requires Chaos to function, so place it near nodes/pylons. Grades boost tool stats. Grades are normally distributed, with a mean of 'B' and a standard deviation of 1.5 grades (assuming I got the math right). And yes, I know one of its textures is missing.
Added: Tooltips for tool rods.
Added: Tooltips for the grade on grade-able materials (gems, etc).
Changed: Improved Gem tooltips.
Fixed: Gems not being registered in the ore dictionary.

2.0.2
Added: Name Plates. Basically just like the one from Pets. Name it on an anvil, then craft with an item to rename. Or you can use it like a name tag.
Added: Broken tools! Unlike before, they don't transform into a new item. Decorate broken tools to repair them. And yes, I know applying a tip upgrade can repair broken tools as well. That's OK. I think.
Added: Recipes for chaos pylons.
Added: Ore dictionary support for gem parts. For example, rubies from other mods can be used in multi-gem tools.
Changed: Chaos orbs are a bit more forgiving. They will crack twice before shattering.
Changed: Chaos node generation rate and send amount doubled.
Fixed: Tool decorating/repairing not working.
Fixed: Tool recipes picking up extra materials...
Fixed: Tools on the ground being gigantic.
Fixed: Burner pylons not working.

2.0.1
Added: Context-sensitive bar that displays the player's chaos (replaces the text)
Added: Area Miner skill for pickaxes and shovels. Works like the enchantment in previous versions. Press 'Toggle Special' (C key by default) to turn it on or off. Super-tier tools only, requires a small amount of chaos to function. Works in creative mode.
Added: Lumberjack skill for axes. Same mechanics as Area Miner. Does NOT work in creative mode (it could, but I think that's a bad idea...)
Added: Crosshairs are replaced with slightly different ones when Area Miner or Lumberjack is activated.
Added: Partially functional (but not craftable) chaos pylons.
Removed: The enchanted effect from all tools until a fix is found (if that's even possible).
Changed: Gem ore textures (gem bits are smaller, dark ores are darker)
Fixed: Dark gem ores dropping the wrong gems.
Fixed: Non-supercharged swords draining chaos.
Fixed: Axes losing durability on leaves.
Fixed: Alpha greetings not showing on servers.
Fixed: Crash with improper materials in decorating recipe.
Fixed (maybe): Chaos transfer not colliding with target player sometimes.

2.0.0
1.9 Rewrite



1.3.11
(1.7.10)
Fixed: AppleCore bonemeal server-side crash (hopefully)
(1.8.9)
Added: Very basic In-game Wiki support. It offers some information to get new players started, at least.
Fixed: The proper altar and pylon models are back! (M4thG33k)
Fixed: Pylon particle effects. (M4thG33k)
Fixed: Chaos sword particles.
Fixed: Sickles not consuming a seed to replant.

1.3.10
Added: Armor can be repaired in the same way tools can be decorated (but sadly, their appearance will not change)
Added: Right-click crops with sickles to harvest and replant. Has a smaller radius than breaking blocks with the sickle.
Added: Fluffy puff plant right-click to harvest.
Added (1.8.9): Update JSON
Fixed (1.8.9): Newly crafted chaos gems eating runes without gaining effects.
Fixed (1.8.9): Teleporter linkers don't work in some cases.

1.3.9b
Fixed: Ore dictionary silliness with gems (fixes all gems becoming rubies in some cases)
Fixed: No Glint upgrade having the wrong tooltip

1.3.9
Added: Chaos gem charge bars.
Added: Metallurgy metal tip upgrades (they only show up with Metallurgy installed)
Added: Mining levels to tooltips for gems and tools.
Added: Gold-tipped upgrade. No bonus durability or mining level, but a big speed boost.
Added: Enchantment tokens for Luck of the Sea and Lure.
Changed: "Downgrading" tip upgrades is now allowed, so long as the tool would not break.
Removed: Chaos gem toggle all key (use shift + toggle instead)
Fixed: Armor not having an anvil repair material (fixes timeless ivy not being useable on armor)
--- 1.8 Specific Changes ---
Added: Enchantment token for Depth Strider
Changed: Hid certain items in JEI.
Fixed: Pickaxe mining speed issue (and maybe others)
Fixed: Crash when mining multiparts with gem tools.
Known issues (1.8.9): All particles are badly broken.

1.3.8b
Fixed: Axes not working on many blocks.

1.3.8
Added: Glass can be used in tool decorating to restore the part to its original state.
Added: Life essence drops from bosses (configurable)
Changed: Chaos sword projectile damage increased. Also affected by strength potions now.
Changed: Flint tools nerfed a bit (keep reading)
Changed: Tip upgrades increase mining speed.
Changed: Tool rod wool increase mining speed slightly.
Changed: Default life essence drop rate reduced significantly (update your config file)
Changed: Teleporters don't drain XP in creative mode.
Changed: Life Steal considers mob health now, not just damage that would have been dealt.
Changed: Life Steal can be applied to axes now.
Fixed: A freeze caused by using teleporters in some cases.
Fixed: Chaos tool's no speed penalty not working in some cases.
Fixed: Area Miner not working on obsidian.
Fixed: Area Miner digging ineffective materials slowly.
Fixed: Chaos sword spawning full charge particles when already charged.
--- 1.8 Specific Changes ----
Fixed: Area Miner not working in some cases.

1.3.7b
Changed: Life Steal enchantment tweaked
Fixed: A bug with the holidays special feature

1.3.7
Added: Chaos Swords can fire projectiles! Block to charge up, then swing to fire!
Added: Broken tools. People make mistakes. It's OK. Now your mistakes won't hurt as much. (Hoes are invisible at first, but you do get them!)
Added: Life Steal enchantment. Heals you a little bit when you damage mobs.
Added: Life Essence. Drops occasionally when mobs die. Looting increases drop rate.
Added: Config to disallow "dumb" teleports. If set to false, Teleporters will only work if there is still a teleporter/anchor at the destination.
Added: A bit of holiday cheer.
Changed: Lots of particle effects! Don't worry, they respect your settings!
Changed: Teleporters drain XP (configurable) when teleporting players. By default short distances are free, teleporting to a different dimension has a flat cost, and long distances require linearly increasing amounts of XP.
Changed: Teleporter Linker displays the distance to the linked teleporter (note that Y-coordinates are ignored)
Fixed: Regeneration chaos gems not working.
Fixed: Sickles not breaking.

1.3.6c (MC 1.8 only)
Fixed: Tools becoming invisible when playing on servers in some cases (ie changing certain video settings)
Fixed: Chaos gem toggle first + shift keybinding not working.

1.3.6b (MC 1.8 only)
Fixed: Server crashes

1.3.6
--- 1.7.10 and 1.8 ---
Added: Dyed Fluffy Blocks
Added: Config for Fluffy Block fall distance reduction. Default reduced to 8.
Added: Enchantment Tokens work on shears.
Added: Fluffy Boots now reduce fall damage when worn (configurable)
Changed: Fluffy Blocks break faster with shears. Hardness raised.
Changed: Fluffy armor is now slightly better than leather.
Fixed: An incorrect log message when decorating Chaos tools.

--- 1.8 Specific Changes ---
Added: Placeholder altar and pylon models.
Fixed: Area Miner mining the wrong blocks.
Fixed: Tool decorating should be fully working.
Fixed: Bow animations.
Fixed: Glow Rose item rendering.
Fixed: Return Home Charm rendering.

1.3.5
Added: Emerald-Tipped upgrade. More bonus durability, but only mining level 2 (configurable).
Added: Blocks tilled statistic for hoes.
Added: Config for fluffy puff drop weight.
Added: Configs for right-click-to-place. It can be disabled entirely, or only allowed when sneaking.
Added: Fluffy Fabric (crafting item).
Added: Fluffy Block: reduces fall damage when landed on.
Added: Bonus chest loot (flint and sugar cookies).
Added: A book recipe.
Changed: Cotton armor names to Fluffy (internal names unchanged).
Changed: Fluffy armor recipes.

1.3.04
Added: Lumberjack enchantment. Chops entire trees. Sneak to disable. Conflicts with Area Miner.
Added: Different textures for supercharged armor.
Changed: Area Miner can now be disabled by sneaking.
Changed: Mending rebalanced (again)
Changed: Mending is more effective at higher elevations. It will barely work near bedrock, and about half speed at sea level.
Fixed: Right-click to place deleting the stack after the tool if slot 9 is emptied.
Fixed: Torch bandolier extraction bug.

1.3.03
Added: Bows (Yes, they can be decorated!)
Added: Achievements!
Added: Chaos tools: late game tools with special abilities (WIP, need suggestions)
Added: No Glint tool upgrade: removes enchanted glow from tools
Added: SAG Mill recipes for ores (Ender IO)
Added: Statistics for blocks placed (mining tools) and shots fired (bows)
Improved: Right-click to place collision detection.
Improved: Right-click to place will check slot 9 if next slot isn't placeable.
Changed: Chaos Ore mining level to 3 (obsidian). Hint: use the diamond-tipped upgrade!
Changed: Tool upgrade recipes
Changed: Crystallized Chaos Essence textures (item and block)
Changed: Teleporter textures. Regular and redstone versions have slightly different textures now.
Fixed: Area Miner appearing on non-mining tools.
Fixed: Hoes not being enchantable with tokens.

1.3.02
Added: Flint tools (more durable and faster than stone, same mining level)
Added: Iron-Tipped and Diamond-Tipped upgrades. Makes tools more durable and raises mining level.
Added: Supercharged gems can now repair tools (by decorating). Restores four times as much durability.
Added: Flint can be used for decorating, but it will only repair flint tools (1/2 each).
Added: Tool statistics (work in progress, currently tracks blocks mined, hits landed, and times redecorated)
Changed: Regular gem tools get a 2x repair bonus from decorating, flint tools 4x.
Changed: Pickaxe textures (removed a few pixels from the L and R parts, making the middle slightly larger)
Changed: Most onyx textures (they should be much better!)
Changed: Rod wool textures

1.3.01
Changed: Altar/pylon textures (downsized, altar colors tweaked)
Changed: Most armor textures (increased brightness & constrast for a shinier look)

1.3.00-RC1
Added: Missing textures and localizations
Added: Particles for pylons that can't find an altar.

1.3.00-beta07
Added: Altar and Pylon models (M4thG33k)
Added: Return Home now glows when ready to teleport.
Added: Better armor textures.
Removed: Cross-dimension teleporting of non-player entities. May add it back in if I find a fix for the Nether portal spawns.
Fixed: Redstone teleporter range calculations being off. Changed default range to 2.0 (actually larger after fix).

1.3.00-beta06
Changed: Recipes for Altars and Pylons.
Changed: Altars no longer disable Chaos Gems.
Fixed: Certain things being enchantable with Enchantment Tokens that shouldn't be.
Fixed: Burner Pylon eating containers like buckets and lava crystals.
Fixed: Return Home Charm not breaking.

1.3.00-beta05
Added: Extra tool tip info for gems (enchantability and spawn weights).
Added: Config for Return Home durability, set to 0 for infinite uses.
Added: Configs for disabling teleporter recipes.
Added: Container localizations.
Removed: Absorption chaos runes, they were extremely broken.
Changed: Gems have different enchantabilities now.
Changed: Chaos gem tool tips. Mini pylon count is displayed. That and cost are hidden until shift is pressed.
Changed: Max mini pylons to five per chaos gem.
Changed: Cost of flight to 80 chaos/t (from 100).
Fixed: Infinite flight (again).
Fixed: No pylon particles when playing on servers.

1.3.00-beta04
Added: Mini Pylon. Craft it with a Chaos gem to give it passive chaos production. Max 1 (configurable).
Added: Crystallized Chaos Essence (tier 3). Currently unused.
Changed: Hid unused chaos runes and their crafting components.
Fixed: Return Home Charm and Teleporters spawning Nether portals (hopefully).
Fixed: World not loading when using Return Home or Teleporter from The End.
Fixed: Area Miner speeds being stupid. All Area Miner tools should now be exactly five times slower than regular tools.
Fixed: Chaos coal block recipe.
Fixed: Crash with non-existent crafting materials.

1.3.00-beta03
Added: Chaos Altar and Pylons (passive and burner), part of a new work-in-progress energy-generation system. Just for chaos gems right now.
Added: Return Home gem variants (cosmetic).
Removed: Some unused config options.
Changed: Chaos gem energy consumption to per tick, instead of per second.
Changed: Chaos gem default max capacity to 1 million (config not respected at this time).
Changed: Flight chaos gem effect will only drain charge when the user is flying (100/t) or falling fast (10/t).
Changed: Chaos gem crafting allows multiple runes (and other things) to be applied at once.
Changed: Return Home takes damage on teleporting. 64 uses.
Changed: Making chaos coal with charcoal is more expensive.
Changed: Texture of Chaos Essence Block
Changed: Base Enchantment Token recipe makes 12. Efficiency uses glowstone dust instead of gold ingots.
Fixed: Chaos gems draining charge twice per tick.
Fixed: Chaos gem effects lingering when leaving player inventory (includes infinite flight).
Fixed: Flight chaos gems not working after being removed from an inventory while activated.
Fixed: Area Miner dig speed being too nerfed.

1.3.00-beta02
Added: Redstone Teleporters. They work just like normal gem teleporters, but can also be activated by a redstone pulse.
Added: Teleporter Anchors. Teleporters can be linked to them, but anchors are not capable of teleporting. Useful for building complex networks of teleports.
Added: Ore dictionary entries for gem blocks.
Added: Recipe to craft Chaos Coal Blocks from Chaos Essence Blocks and Coal Blocks.
Changed: Mending now works on armor.
Changed: Many recipes now use the ore dictionary.
Changed: Internal name of Beryl to Beryl (was Emerald). Config option for the weight of Beryl will change its name as well.
Fixed: Flight Chaos Gems not resetting fall distance
Fixed: Flight Chaos Gems not being activated by hotkeys.

1.3.00-beta01
Added: Gem/Chaos ores and Glow Roses can now be pulverized.
Added: Gem armor. Textures need work, I know.
Added: Armor Enchantment Tokens.
Added: Recipe to craft Enchantment Tokens back into the blank version.
Added: Chaos Coal and Chaos Coal Blocks. Four times the energy of coal (configurable). Crafted with coal and chaos essence.
Added: Configurable weights for gem spawns. This allows certain gems to be made more or less common, instead of being totally random like before.
Changed: Multiple enchantment tokens can be applied at once. Just put one tool/armor item in the crafting grid and put tokens in any free slots.
Changed: Blank Enchantment Tokens now have a meta of 256, instead of 0. This was necessary because Enchantment Token meta values match enchantment IDs. Protection's ID is 0. Enjoy your free protection tokens!
Changed: Enchantment Tokens are ordered by group, instead of meta.
Fixed: Version number not being set.

1.2.07b
Fixed: Sickles for real this time, I think.

1.2.07

Added: New enchantment token textures (should make finding the right one a little easier).
Added: Enchantment Tokens for bows.
Added: Config option to set tool mining levels
Added: Torch Bandolier extraction recipe. Just place it in a crafting grid to get a stack of torches out.
Added: Enriched Chaos Essence blocks, because why not?
Added: Config option to always hide flavor text.
Changed: Flavor text is now hidden (by default) until shift is pressed.
Changed: Return Home resets fall distance (no more fall damage when teleporting).
Changed: Return Home checks for obstructions.
Changed: Unbreaking and Mending no longer conflict.
Changed: Sickles rewritten. They now clear a 9x9x1 area, instead of a 3x3x3 cube. Also less laggy.
Changed: Various tooltip tweaks.
Fixed: Unbreaking and Mending Enchantment Tokens now work on bows.
Fixed: Gem block recipe being overridden by ore dictionary recipes.
Fixed: Torch Bandolier and Chaos Gems can no longer be "repaired".