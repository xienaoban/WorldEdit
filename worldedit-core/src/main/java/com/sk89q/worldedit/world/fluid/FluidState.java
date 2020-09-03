package com.sk89q.worldedit.world.fluid;

import com.sk89q.jnbt.CompoundTag;
import com.sk89q.worldedit.registry.state.Property;
import com.sk89q.worldedit.world.block.BaseBlock;
import com.sk89q.worldedit.world.block.BlockState;
import com.sk89q.worldedit.world.block.BlockStateHolder;
import com.sk89q.worldedit.world.block.BlockType;

import java.util.Map;

public class FluidState implements BlockStateHolder<FluidState> {

    private BlockState blockState;
    private FluidType fluidType;

    public FluidType getFluidType() {
        return this.fluidType;
    }

    @Override
    public BlockType getBlockType() {
        return null;
    }

    @Override
    public <V> FluidState with(Property<V> property, V value) {
        return null;
    }

    @Override
    public <V> V getState(Property<V> property) {
        return null;
    }

    @Override
    public Map<Property<?>, Object> getStates() {
        return null;
    }

    @Override
    public boolean equalsFuzzy(BlockStateHolder<?> o) {
        return false;
    }

    @Override
    public BlockState toImmutableState() {
        return null;
    }

    @Override
    public BaseBlock toBaseBlock() {
        return null;
    }

    @Override
    public BaseBlock toBaseBlock(CompoundTag compoundTag) {
        return null;
    }
}
