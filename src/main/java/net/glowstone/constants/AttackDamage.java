package net.glowstone.constants;

import org.bukkit.Material;

/**
 * Map of attack damage values and durability costs for various weapon types, until better item type
 * support is available.
 */
public final class AttackDamage {

    private AttackDamage() {
    }

    /**
     * Gets the damage an item in-hand would cause without added benefits. This assumes a
     * non-critical attack.
     *
     * @param material the item type
     * @return the raw damage caused by that item
     */
    public static float getMeleeDamage(Material material) {
        if (material == null) {
            return 0.0f;
        }

        switch (material) {
            case WOODEN_SHOVEL:
            case GOLDEN_SHOVEL:
                return 2.0f;
            case STONE_SHOVEL:
            case WOODEN_PICKAXE:
            case GOLDEN_PICKAXE:
                return 3.0f;
            case IRON_SHOVEL:
            case STONE_PICKAXE:
            case WOODEN_AXE:
            case GOLDEN_AXE:
                return 4.0f;
            case DIAMOND_SHOVEL:
            case IRON_PICKAXE:
            case STONE_AXE:
            case WOODEN_SWORD:
            case GOLDEN_SWORD:
                return 5.0f;
            case DIAMOND_PICKAXE:
            case IRON_AXE:
            case STONE_SWORD:
                return 6.0f;
            case DIAMOND_AXE:
            case IRON_SWORD:
                return 7.0f;
            case DIAMOND_SWORD:
                return 8.0f;
            default:
                return 1.0f;
        }
    }

    /**
     * Gets the damage an item in-hand would cause without added benefits.
     *
     * @param material the item type
     * @param critical true if critical damage should be returned
     * @return the raw damage caused by that item
     */
    public static float getMeleeDamage(Material material, boolean critical) {
        float raw = getMeleeDamage(material);
        return critical ? raw * 1.5f : raw;
    }

    /**
     * Gets the durability loss of the supplied type for a successful hit.
     *
     * @param material the item type
     * @return the durability points lost, or 0
     */
    public static short getMeleeDurabilityLoss(Material material) {
        if (material == null) {
            return 0;
        }

        switch (material) {
            case WOODEN_AXE:
            case GOLDEN_AXE:
            case STONE_AXE:
            case DIAMOND_AXE:
            case WOODEN_PICKAXE:
            case GOLDEN_PICKAXE:
            case IRON_PICKAXE:
            case DIAMOND_PICKAXE:
            case WOODEN_SHOVEL:
            case GOLDEN_SHOVEL:
            case IRON_SHOVEL:
            case DIAMOND_SHOVEL:
                return 2;
            case WOODEN_SWORD:
            case GOLDEN_SWORD:
            case IRON_SWORD:
            case DIAMOND_SWORD:
                return 1;
            default:
                return 0;
        }
    }

}
