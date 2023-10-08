package com.dfsek.terra.addons.noise.samplers;

import com.dfsek.terra.api.noise.NoiseSampler;

import java.util.List;


public class TranslateSampler implements NoiseSampler {
    
    private final NoiseSampler sampler;
    private final double dx, dy, dz;
    
    public TranslateSampler(NoiseSampler sampler, double dx, double dy, double dz) {
        this.sampler = sampler;
        this.dx = dx;
        this.dy = dy;
        this.dz = dz;
    }
    
    @Override
    public double noise(long seed, double x, double y, List<double[]> context, int contextLayer, int contextRadius) {
        return sampler.noise(seed, x - dx, y - dz);
    }
    
    @Override
    public double noise(long seed, double x, double y, double z, List<double[]> context, int contextLayer, int contextRadius) {
        return sampler.noise(seed, x - dx, y - dy, z - dz);
    }
}
