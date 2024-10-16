package com.github.quiltservertools.ledger.listeners

<<<<<<< HEAD
<<<<<<< HEAD
import com.github.quiltservertools.ledger.actionutils.ActionFactory
import com.github.quiltservertools.ledger.callbacks.EntityKillCallback
import com.github.quiltservertools.ledger.callbacks.EntityModifyCallback
import com.github.quiltservertools.ledger.database.ActionQueueService
import net.minecraft.entity.Entity
=======
import net.minecraft.entity.LivingEntity
>>>>>>> parent of 8b5522c (Expand logging capabilities (#197))
=======
import net.minecraft.entity.LivingEntity
>>>>>>> parent of 8b5522c (Expand logging capabilities (#197))
import net.minecraft.entity.damage.DamageSource
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import com.github.quiltservertools.ledger.actionutils.ActionFactory
import com.github.quiltservertools.ledger.callbacks.EntityKillCallback
import com.github.quiltservertools.ledger.database.DatabaseManager


fun registerEntityListeners() {
    EntityKillCallback.EVENT.register(::onKill)
}

<<<<<<< HEAD
<<<<<<< HEAD
private fun onKill(
    world: World,
    pos: BlockPos,
    entity: Entity,
    source: DamageSource
) {
    ActionQueueService.addToQueue(
=======
=======
>>>>>>> parent of 8b5522c (Expand logging capabilities (#197))
private fun onKill(world: World, pos: BlockPos, entity: LivingEntity, source: DamageSource) {
    DatabaseManager.logAction(
>>>>>>> parent of 8b5522c (Expand logging capabilities (#197))
        ActionFactory.entityKillAction(world, pos, entity, source)
    )
}

<<<<<<< HEAD
<<<<<<< HEAD
private fun onModify(
    world: World,
    pos: BlockPos,
    oldEntityTags: NbtCompound,
    entity: Entity,
    itemStack: ItemStack?,
    entityActor: Entity?,
    sourceType: String
) {
    ActionQueueService.addToQueue(
        ActionFactory.entityChangeAction(world, pos, oldEntityTags, entity, itemStack, entityActor, sourceType)
    )
}
=======
>>>>>>> parent of 8b5522c (Expand logging capabilities (#197))
=======
>>>>>>> parent of 8b5522c (Expand logging capabilities (#197))
