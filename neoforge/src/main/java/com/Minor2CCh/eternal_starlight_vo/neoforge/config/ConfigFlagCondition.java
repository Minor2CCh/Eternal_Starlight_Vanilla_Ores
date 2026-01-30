package com.Minor2CCh.eternal_starlight_vo.neoforge.config;

import com.Minor2CCh.eternal_starlight_vo.config.StarlightConfigLoader;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.neoforged.neoforge.common.conditions.ICondition;
import org.jetbrains.annotations.NotNull;

public class ConfigFlagCondition implements ICondition {
    private final String flag;
    public static final MapCodec<ConfigFlagCondition> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            Codec.STRING.fieldOf("flag").forGetter(c -> c.flag)
    ).apply(instance, ConfigFlagCondition::new));
    public ConfigFlagCondition(String flagName) {
        this.flag = flagName;
    }

    @Override
    public boolean test(@NotNull IContext context) {
        return switch (flag) {
            case "ReduceOres" -> StarlightConfigLoader.getConfig().getReduceOres();
            case "ExtraOrePerBiome" -> StarlightConfigLoader.getConfig().getExtraOrePerBiome();
            case "GenerateQuartz" -> StarlightConfigLoader.getConfig().getGenerateQuartz();
            default -> false;
        };
    }
    @Override
    public @NotNull MapCodec<? extends ICondition> codec(){
        return CODEC;
    }

}
