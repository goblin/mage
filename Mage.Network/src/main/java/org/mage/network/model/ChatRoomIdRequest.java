package org.mage.network.model;

import java.util.UUID;

/**
 *
 * @author BetaSteward
 */
public class ChatRoomIdRequest extends RoomRequest {
    
    public ChatRoomIdRequest(UUID roomId) {
        super(roomId);
    }

}