package com.dfsek.terra.addons.noise.samplers;

import com.dfsek.terra.api.noise.NoiseSampler;

import java.util.List;


public class LinearHeightmapSampler implements NoiseSampler {
    private final NoiseSampler sampler;
    private final double scale;
    private final double base;
    
    public LinearHeightmapSampler(NoiseSampler sampler, double scale, double base) {
        this.sampler = sampler;
        this.scale = scale;
        this.base = base;
    }
    
    
    @Override
    public double noise(long seed, double x, double y, double[] context, int contextRadius) {
        return noise(seed, x, 0, y);
    }
    
    @Override
    public double noise(long seed, double x, double y, double z, double[] context, int contextRadius) {
        return -y + base + sampler.noise(seed, x, y, z) * scale;
    }
}
