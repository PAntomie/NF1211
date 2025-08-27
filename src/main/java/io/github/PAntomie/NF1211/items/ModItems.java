package io.github.PAntomie.NF1211.items;

import io.github.PAntomie.NF1211.NF1211;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NF1211.MODID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
