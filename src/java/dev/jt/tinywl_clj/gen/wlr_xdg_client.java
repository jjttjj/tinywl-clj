// Generated by jextract

package dev.jt.tinywl_clj.gen;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct wlr_xdg_client {
 *     struct wlr_xdg_shell *shell;
 *     struct wl_resource *resource;
 *     struct wl_client *client;
 *     struct wl_list surfaces;
 *     struct wl_list link;
 *     uint32_t ping_serial;
 *     struct wl_event_source *ping_timer;
 * }
 * }
 */
public class wlr_xdg_client {

    wlr_xdg_client() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("shell"),
        C.C_POINTER.withName("resource"),
        C.C_POINTER.withName("client"),
        wl_list.layout().withName("surfaces"),
        wl_list.layout().withName("link"),
        C.C_INT.withName("ping_serial"),
        MemoryLayout.paddingLayout(4),
        C.C_POINTER.withName("ping_timer")
    ).withName("wlr_xdg_client");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout shell$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("shell"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_xdg_shell *shell
     * }
     */
    public static final AddressLayout shell$layout() {
        return shell$LAYOUT;
    }

    private static final long shell$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_xdg_shell *shell
     * }
     */
    public static final long shell$offset() {
        return shell$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_shell *shell
     * }
     */
    public static MemorySegment shell(MemorySegment struct) {
        return struct.get(shell$LAYOUT, shell$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_xdg_shell *shell
     * }
     */
    public static void shell(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(shell$LAYOUT, shell$OFFSET, fieldValue);
    }

    private static final AddressLayout resource$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("resource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_resource *resource
     * }
     */
    public static final AddressLayout resource$layout() {
        return resource$LAYOUT;
    }

    private static final long resource$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_resource *resource
     * }
     */
    public static final long resource$offset() {
        return resource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_resource *resource
     * }
     */
    public static MemorySegment resource(MemorySegment struct) {
        return struct.get(resource$LAYOUT, resource$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_resource *resource
     * }
     */
    public static void resource(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(resource$LAYOUT, resource$OFFSET, fieldValue);
    }

    private static final AddressLayout client$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("client"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_client *client
     * }
     */
    public static final AddressLayout client$layout() {
        return client$LAYOUT;
    }

    private static final long client$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_client *client
     * }
     */
    public static final long client$offset() {
        return client$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_client *client
     * }
     */
    public static MemorySegment client(MemorySegment struct) {
        return struct.get(client$LAYOUT, client$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_client *client
     * }
     */
    public static void client(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(client$LAYOUT, client$OFFSET, fieldValue);
    }

    private static final GroupLayout surfaces$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("surfaces"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_list surfaces
     * }
     */
    public static final GroupLayout surfaces$layout() {
        return surfaces$LAYOUT;
    }

    private static final long surfaces$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_list surfaces
     * }
     */
    public static final long surfaces$offset() {
        return surfaces$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_list surfaces
     * }
     */
    public static MemorySegment surfaces(MemorySegment struct) {
        return struct.asSlice(surfaces$OFFSET, surfaces$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_list surfaces
     * }
     */
    public static void surfaces(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, surfaces$OFFSET, surfaces$LAYOUT.byteSize());
    }

    private static final GroupLayout link$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("link"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_list link
     * }
     */
    public static final GroupLayout link$layout() {
        return link$LAYOUT;
    }

    private static final long link$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_list link
     * }
     */
    public static final long link$offset() {
        return link$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_list link
     * }
     */
    public static MemorySegment link(MemorySegment struct) {
        return struct.asSlice(link$OFFSET, link$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_list link
     * }
     */
    public static void link(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, link$OFFSET, link$LAYOUT.byteSize());
    }

    private static final OfInt ping_serial$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ping_serial"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t ping_serial
     * }
     */
    public static final OfInt ping_serial$layout() {
        return ping_serial$LAYOUT;
    }

    private static final long ping_serial$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t ping_serial
     * }
     */
    public static final long ping_serial$offset() {
        return ping_serial$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t ping_serial
     * }
     */
    public static int ping_serial(MemorySegment struct) {
        return struct.get(ping_serial$LAYOUT, ping_serial$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t ping_serial
     * }
     */
    public static void ping_serial(MemorySegment struct, int fieldValue) {
        struct.set(ping_serial$LAYOUT, ping_serial$OFFSET, fieldValue);
    }

    private static final AddressLayout ping_timer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ping_timer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_event_source *ping_timer
     * }
     */
    public static final AddressLayout ping_timer$layout() {
        return ping_timer$LAYOUT;
    }

    private static final long ping_timer$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_event_source *ping_timer
     * }
     */
    public static final long ping_timer$offset() {
        return ping_timer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_event_source *ping_timer
     * }
     */
    public static MemorySegment ping_timer(MemorySegment struct) {
        return struct.get(ping_timer$LAYOUT, ping_timer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_event_source *ping_timer
     * }
     */
    public static void ping_timer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ping_timer$LAYOUT, ping_timer$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}
