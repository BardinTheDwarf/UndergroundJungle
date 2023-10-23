package io.github.hexagonnico.undergroundjungle.renderers;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Zombie;
import org.jetbrains.annotations.NotNull;

/**
 * Jungle zombie renderer.
 * Adds the jungle zombie texture to the default zombie renderer.
 *
 * @author Nico
 */
public class JungleZombieRenderer extends ZombieRenderer {

    /** Location pointing to the jungle zombie texture */
    private static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation("underground_jungle", "textures/entity/jungle_zombie.png");

    /**
     * Constructs the renderer.
     *
     * @param context Rendering context
     */
    public JungleZombieRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull Zombie zombie) {
        return TEXTURE_LOCATION;
    }
}