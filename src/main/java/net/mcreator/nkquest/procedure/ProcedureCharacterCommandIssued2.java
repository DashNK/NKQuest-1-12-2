package net.mcreator.nkquest.procedure;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;

import net.mcreator.nkquest.NkquestVariables;
import net.mcreator.nkquest.ElementsNkquest;

import java.util.HashMap;

@ElementsNkquest.ModElement.Tag
public class ProcedureCharacterCommandIssued2 extends ElementsNkquest.ModElement {
	public ProcedureCharacterCommandIssued2(ElementsNkquest instance) {
		super(instance, 564);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CharacterCommandIssued2!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			System.err.println("Failed to load dependency cmdparams for procedure CharacterCommandIssued2!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CharacterCommandIssued2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		World world = (World) dependencies.get("world");
		if ((entity instanceof EntityPlayer)) {
			if ((((new Object() {
				public String getText() {
					String param = (String) cmdparams.get("0");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText())).equals("admin"))) {
				if ((((new Object() {
					public String getText() {
						String param = (String) cmdparams.get("1");
						if (param != null) {
							return param;
						}
						return "";
					}
				}.getText())).equals("Dash"))) {
					if (((((new Object() {
						public String getText() {
							String param = (String) cmdparams.get("2");
							if (param != null) {
								return param;
							}
							return "";
						}
					}.getText())).equals("old_boots")) || (((new Object() {
						public String getText() {
							String param = (String) cmdparams.get("2");
							if (param != null) {
								return param;
							}
							return "";
						}
					}.getText())).equals("")))) {
						entity.getEntityData().setBoolean("hasStarBoots", (false));
						entity.getEntityData().setBoolean("isDash", (true));
						entity.getEntityData().setDouble("characterID", 1);
						NkquestVariables.CharacterID = (double) 1;
						if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
							entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return entity.world;
								}

								@Override
								public MinecraftServer getServer() {
									return entity.world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return entity.getPosition();
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(entity.posX, entity.posY, entity.posZ);
								}

								@Override
								public Entity getCommandSenderEntity() {
									return entity;
								}
							}, "mpm url @p textures/player/dash_noshell_oldboots.png");
						}
					}
					if ((((new Object() {
						public String getText() {
							String param = (String) cmdparams.get("2");
							if (param != null) {
								return param;
							}
							return "";
						}
					}.getText())).equals("star_boots"))) {
						entity.getEntityData().setBoolean("isDash", (true));
						entity.getEntityData().setBoolean("hasStarBoots", (true));
						entity.getEntityData().setDouble("characterID", 1);
						NkquestVariables.CharacterID = (double) 1;
						if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
							entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return entity.world;
								}

								@Override
								public MinecraftServer getServer() {
									return entity.world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return entity.getPosition();
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(entity.posX, entity.posY, entity.posZ);
								}

								@Override
								public Entity getCommandSenderEntity() {
									return entity;
								}
							}, "mpm url @p textures/player/dash_noshell_starboots.png");
						}
					}
				}
				if ((((new Object() {
					public String getText() {
						String param = (String) cmdparams.get("1");
						if (param != null) {
							return param;
						}
						return "";
					}
				}.getText())).equals("shade"))) {
					entity.getEntityData().setBoolean("isShade", (true));
					entity.getEntityData().setDouble("characterID", 3);
					NkquestVariables.CharacterID = (double) 3;
				}
			}
			if (((((new Object() {
				public String getText() {
					String param = (String) cmdparams.get("0");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText())).equals("")) || (((new Object() {
				public String getText() {
					String param = (String) cmdparams.get("0");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText())).equals("help")))) {
				if (entity instanceof EntityPlayer && !world.isRemote) {
					((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Usage: /character [clear/select/admin]"), (false));
				}
			}
			if ((((new Object() {
				public String getText() {
					String param = (String) cmdparams.get("0");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText())).equals("admin"))) {
				if ((((new Object() {
					public String getText() {
						String param = (String) cmdparams.get("1");
						if (param != null) {
							return param;
						}
						return "";
					}
				}.getText())).equals("list"))) {
					if (entity instanceof EntityPlayer && !world.isRemote) {
						((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Character List:"), (false));
					}
					if (entity instanceof EntityPlayer && !world.isRemote) {
						((EntityPlayer) entity).sendStatusMessage(new TextComponentString("dash"), (false));
					}
					if (entity instanceof EntityPlayer && !world.isRemote) {
						((EntityPlayer) entity).sendStatusMessage(new TextComponentString("shade"), (false));
					}
				}
				if ((((new Object() {
					public String getText() {
						String param = (String) cmdparams.get("1");
						if (param != null) {
							return param;
						}
						return "";
					}
				}.getText())).equals("dash"))) {
					if ((((new Object() {
						public String getText() {
							String param = (String) cmdparams.get("2");
							if (param != null) {
								return param;
							}
							return "";
						}
					}.getText())).equals(""))) {
						if (entity instanceof EntityPlayer && !world.isRemote) {
							((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Character Options:"), (false));
						}
						if (entity instanceof EntityPlayer && !world.isRemote) {
							((EntityPlayer) entity).sendStatusMessage(new TextComponentString("old_boots"), (false));
						}
						if (entity instanceof EntityPlayer && !world.isRemote) {
							((EntityPlayer) entity).sendStatusMessage(new TextComponentString("star_boots"), (false));
						}
					}
					if ((((new Object() {
						public String getText() {
							String param = (String) cmdparams.get("2");
							if (param != null) {
								return param;
							}
							return "";
						}
					}.getText())).equals("old_boots"))) {
						if (entity instanceof EntityPlayer && !world.isRemote) {
							((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Character Selected! Dash, Old Boots"), (false));
						}
						entity.getEntityData().setBoolean("isDash", (true));
						entity.getEntityData().setBoolean("hasStarBoots", (false));
						entity.getEntityData().setDouble("characterID", 1);
						NkquestVariables.CharacterID = (double) 1;
						if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
							entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
								@Override
								public String getName() {
									return "";
								}

								@Override
								public boolean canUseCommand(int permission, String command) {
									return true;
								}

								@Override
								public World getEntityWorld() {
									return entity.world;
								}

								@Override
								public MinecraftServer getServer() {
									return entity.world.getMinecraftServer();
								}

								@Override
								public boolean sendCommandFeedback() {
									return false;
								}

								@Override
								public BlockPos getPosition() {
									return entity.getPosition();
								}

								@Override
								public Vec3d getPositionVector() {
									return new Vec3d(entity.posX, entity.posY, entity.posZ);
								}

								@Override
								public Entity getCommandSenderEntity() {
									return entity;
								}
							}, "mpm url @p textures/player/dash_noshell_oldboots.png");
						}
					}
					if ((((new Object() {
						public String getText() {
							String param = (String) cmdparams.get("2");
							if (param != null) {
								return param;
							}
							return "";
						}
					}.getText())).equals("star_boots"))) {
						if (entity instanceof EntityPlayer && !world.isRemote) {
							((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Character Selected! Dash, Star Boots"), (false));
						}
						entity.getEntityData().setBoolean("isDash", (true));
						entity.getEntityData().setBoolean("hasStarBoots", (true));
						entity.getEntityData().setDouble("characterID", 1);
						NkquestVariables.CharacterID = (double) 1;
					}
				}
			}
		}
	}
}
