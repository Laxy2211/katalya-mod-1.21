package net.cata.katalya.items;

import net.cata.katalya.Katalya;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item HARD_LEATHER = registerItem("hard_leather", new Item(new Item.Settings()));
    public static final Item LUMIA = registerItem("lumia",new Item(new Item.Settings()));
    public static final Item LIFE_SOUL = registerItem("life_soul",new Item(new Item.Settings()));
    public static final Item TERMIA = registerItem("termia",new Item(new Item.Settings()));
    public static final Item LIGHT_FEATHER = registerItem("light_feather",new Item(new Item.Settings()));
    public static final Item REINFORCED_FEATHER = registerItem("reinforced_feather",new Item(new Item.Settings()));
    public static final Item SHADOW_SOUL = registerItem("shadow_soul",new Item(new Item.Settings()));
    public static final Item DARK_SOUL = registerItem("dark_soul",new Item(new Item.Settings()));
    public static final Item TORMENTED_BROKEN_BOW = registerItem("tormented_broken_bow",new Item(new Item.Settings()));
    public static final Item TORMENTED_SOUL = registerItem("tormented_soul",new Item(new Item.Settings()));
    public static final Item SKULL = registerItem("skull",new Item(new Item.Settings()));
    public static final Item THORN = registerItem("thorn",new Item(new Item.Settings()));
    public static final Item CLOROFILE = registerItem("clorofile",new Item(new Item.Settings()));
    public static final Item SCALE = registerItem("scale",new Item(new Item.Settings()));
    public static final Item CORRUPTED_SHEET = registerItem("corrupted_sheet",new Item(new Item.Settings()));
    public static final Item SILK = registerItem("silk",new Item(new Item.Settings()));
    public static final Item BETLEE_SHELL = registerItem("betlee_shell",new Item(new Item.Settings()));
    public static final Item WING_FRAGMENT = registerItem("wing_fragment",new Item(new Item.Settings()));
    public static final Item STING = registerItem("sting",new Item(new Item.Settings()));
    public static final Item WORKER_LEGS = registerItem("worker_legs",new Item(new Item.Settings()));
    public static final Item SHINY_SHELL = registerItem("shiny_shell",new Item(new Item.Settings()));
    public static final Item RETRACTABLE_BEAK = registerItem("retractable_beak",new Item(new Item.Settings()));
    public static final Item ARACHNID_SCALE = registerItem("arachnid_scale",new Item(new Item.Settings()));
    public static final Item GELID_EYE = registerItem("gelid_eye",new Item(new Item.Settings()));
    public static final Item GELID_BONE = registerItem("gelid_bone",new Item(new Item.Settings()));
    public static final Item ICE_SOUL = registerItem("ice_soul",new Item(new Item.Settings()));
    public static final Item ICE_SKULL = registerItem("ice_skull",new Item(new Item.Settings()));
    public static final Item RAGS = registerItem("rags",new Item(new Item.Settings()));
    public static final Item PURE_CRYSTAL = registerItem("pure_crystal",new Item(new Item.Settings()));
    public static final Item ARID_SCALE = registerItem("arid_scale",new Item(new Item.Settings()));
    public static final Item FIRE_SOUL = registerItem("fire_soul",new Item(new Item.Settings()));
    public static final Item SKELETAL_FEATHER = registerItem("skeletal_feather",new Item(new Item.Settings()));
    public static final Item STORM_FRAGMENT = registerItem("storm_fragment",new Item(new Item.Settings()));
    public static final Item FIRMICIDAE_HEAD = registerItem("firmicidae_head",new Item(new Item.Settings()));
    public static final Item LYHARA_KNIGHT_SOUL = registerItem("lyhara_knight_soul",new Item(new Item.Settings()));
    public static final Item LYHARA_HORSE_ARMOR = registerItem("lyhara_horse_armor",new Item(new Item.Settings()));
    public static final Item COCONUT_PLECTRUM = registerItem("coconut_plectrum",new Item(new Item.Settings()));
   private static Item registerItem(String name, Item item){
       return Registry.register(Registries.ITEM, Identifier.of(Katalya.MOD_ID, name), item);
   }
    public static void registerModItems(){
        Katalya.LOGGER.info("Registering Mod Items " + Katalya.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(HARD_LEATHER);
            entries.add(LUMIA);
            entries.add(LIFE_SOUL);
            entries.add(TERMIA);
            entries.add(LIGHT_FEATHER);
            entries.add(REINFORCED_FEATHER);
            entries.add(SHADOW_SOUL);
            entries.add(DARK_SOUL);
            entries.add(TORMENTED_BROKEN_BOW);
            entries.add(TORMENTED_SOUL);
            entries.add(SKULL);
            entries.add(THORN);
            entries.add(CLOROFILE);
            entries.add(SCALE);
            entries.add(CORRUPTED_SHEET);
            entries.add(SILK);
            entries.add(BETLEE_SHELL);
            entries.add(WING_FRAGMENT);
            entries.add(STING);
            entries.add(WORKER_LEGS);
            entries.add(SHINY_SHELL);
            entries.add(RETRACTABLE_BEAK);
            entries.add(ARACHNID_SCALE);
            entries.add(GELID_EYE);
            entries.add(GELID_BONE);
            entries.add(ICE_SOUL);
            entries.add(ICE_SKULL);
            entries.add(RAGS);
            entries.add(PURE_CRYSTAL);
            entries.add(ARID_SCALE);
            entries.add(FIRE_SOUL);
            entries.add(SKELETAL_FEATHER);
            entries.add(STORM_FRAGMENT);
            entries.add(FIRMICIDAE_HEAD);
            entries.add(LYHARA_KNIGHT_SOUL);
            entries.add(LYHARA_HORSE_ARMOR);
            entries.add(COCONUT_PLECTRUM);

        });
    }
}
