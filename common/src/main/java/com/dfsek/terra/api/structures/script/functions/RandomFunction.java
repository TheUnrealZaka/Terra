package com.dfsek.terra.api.structures.script.functions;

import com.dfsek.terra.api.math.vector.Location;
import com.dfsek.terra.api.platform.world.Chunk;
import com.dfsek.terra.api.structures.parser.lang.Returnable;
import com.dfsek.terra.api.structures.parser.lang.functions.Function;
import com.dfsek.terra.api.structures.structure.Rotation;
import com.dfsek.terra.api.structures.tokenizer.Position;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFunction implements Function<Integer> {
    private final Returnable<Number> numberReturnable;
    private final Position position;

    public RandomFunction(Returnable<Number> numberReturnable, Position position) {
        this.numberReturnable = numberReturnable;
        this.position = position;
    }


    @Override
    public String name() {
        return "randomInt";
    }

    @Override
    public ReturnType returnType() {
        return ReturnType.NUMBER;
    }

    @Override
    public Integer apply(Location location, Rotation rotation) {
        return ThreadLocalRandom.current().nextInt(numberReturnable.apply(location, rotation).intValue()); // TODO: deterministic random
    }

    @Override
    public Integer apply(Location location, Chunk chunk, Rotation rotation) {
        return ThreadLocalRandom.current().nextInt(numberReturnable.apply(location, chunk, rotation).intValue());
    }

    @Override
    public Position getPosition() {
        return position;
    }
}