/*
 * Silent's Gems
 * Copyright (C) 2018 SilentChaos512
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 3
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.silentchaos512.gems.block;

import net.minecraft.block.BlockOre;
import net.silentchaos512.gems.lib.Essences;

public class EssenceOre extends BlockOre {
    private final Essences type;

    public EssenceOre(Essences type) {
        this.type = type;

        setHardness(5.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", type.getOreHarvestLevel(), getDefaultState());
    }
}