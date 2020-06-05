package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.nkquest.entity.EntityVoidMonster;
import net.mcreator.nkquest.ElementsNkquest;

@ElementsNkquest.ModElement.Tag
public class ProcedureVoidMonsterSpawn extends ElementsNkquest.ModElement {
	public ProcedureVoidMonsterSpawn(ElementsNkquest instance) {
		super(instance, 142);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VoidMonsterSpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure VoidMonsterSpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		boolean VoidMonsterSpawned = false;
		boolean VoidMonsterKilled = false;
		double RespawnTimer = 0;
		if ((entity instanceof EntityPlayer)) {
			if (((VoidMonsterSpawned) == (false))) {
				if (!world.isRemote) {
					Entity entityToSpawn = new EntityVoidMonster.EntityCustom(world);
					if (entityToSpawn != null) {
						entityToSpawn.setLocationAndAngles((entity.posX), -1, (entity.posZ), world.rand.nextFloat() * 360F, 0.0F);
						world.spawnEntity(entityToSpawn);
					}
				}
				VoidMonsterSpawned = (boolean) (true);
			}
		}
		if (((entity instanceof EntityVoidMonster.EntityCustom)
				&& (((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHealth() : -1) == 0))) {
			VoidMonsterKilled = (boolean) (true);
		}
		if (((VoidMonsterKilled) == (true))) {
			for (int index0 = 0; index0 < (int) (1000000); index0++) {
				RespawnTimer = (double) ((RespawnTimer) + 1);
			}
		}
		if (((RespawnTimer) == 1000000)) {
			VoidMonsterKilled = (boolean) (false);
			VoidMonsterSpawned = (boolean) (false);
			RespawnTimer = (double) 0;
		}
	}
}
