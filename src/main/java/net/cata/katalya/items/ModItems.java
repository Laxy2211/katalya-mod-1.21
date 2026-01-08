package net.cata.katalya.items;

import net.cata.katalya.Katalya;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item HARD_LEATHER = registerItem("hard_leather", new Item(new Item.Settings()));
    public static final Item LUMIA = registerItem("lumia",new Item(new Item.Settings()));
    public static final Item LIFE_SOUL = registerItem("life_soul",new Item(new Item.Settings()));
    public static final Item TERMIA = registerItem("termia",new Item(new Item.Settings()));
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
        });
    }
}
