/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html">UIPrintPageRenderer Class Reference</a>
 *   @since Available in iOS 4.2 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UIPrintPageRenderer /*</name>*/ 
    extends /*<extends>*/ NSObject /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UIPrintPageRenderer /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UIPrintPageRenderer /*</name>*/.class);

    /*<constructors>*/
    protected UIPrintPageRenderer(SkipInit skipInit) { super(skipInit); }
    public UIPrintPageRenderer() {}
    
    /*</constructors>*/
    /*<properties>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPrintPageRenderer/footerHeight">@property CGFloat footerHeight</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("footerHeight") public native float getFooterHeight();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPrintPageRenderer/footerHeight">@property CGFloat footerHeight</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("setFooterHeight:") public native void setFooterHeight(float v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPrintPageRenderer/headerHeight">@property CGFloat headerHeight</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("headerHeight") public native float getHeaderHeight();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPrintPageRenderer/headerHeight">@property CGFloat headerHeight</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("setHeaderHeight:") public native void setHeaderHeight(float v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPrintPageRenderer/paperRect">@property(readonly) CGRect paperRect</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("paperRect") public native CGRect getPaperRect();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPrintPageRenderer/printFormatters">@property(copy) NSArray *printFormatters</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("printFormatters") public native NSArray getPrintFormatters();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPrintPageRenderer/printFormatters">@property(copy) NSArray *printFormatters</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("setPrintFormatters:") public native void setPrintFormatters(NSArray v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instp/UIPrintPageRenderer/printableRect">@property(readonly) CGRect printableRect</a>
     * @since Available in iOS 4.2 and later.
     */
    @Bind("printableRect") public native CGRect getPrintableRect();
    /*</properties>*/
    /*<methods>*/
    
    private static final Selector addPrintFormatter$startingAtPageAtIndex$ = Selector.register("addPrintFormatter:startingAtPageAtIndex:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_addPrintFormatter(UIPrintPageRenderer __self__, Selector __cmd__, UIPrintFormatter formatter, int pageIndex);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_addPrintFormatterSuper(ObjCSuper __super__, UIPrintPageRenderer __self__, Selector __cmd__, UIPrintFormatter formatter, int pageIndex);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instm/UIPrintPageRenderer/addPrintFormatter:startingAtPageAtIndex:">- (void)addPrintFormatter:(UIPrintFormatter *)formatter startingAtPageAtIndex:(NSInteger)pageIndex</a>
     * @since Available in iOS 4.2 and later.
     */
    public void addPrintFormatter(UIPrintFormatter formatter, int pageIndex) {
        if (customClass) { objc_addPrintFormatterSuper(getSuper(), this, addPrintFormatter$startingAtPageAtIndex$, formatter, pageIndex); } else { objc_addPrintFormatter(this, addPrintFormatter$startingAtPageAtIndex$, formatter, pageIndex); }
    }
    
    private static final Selector drawContentForPageAtIndex$inRect$ = Selector.register("drawContentForPageAtIndex:inRect:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_drawContent(UIPrintPageRenderer __self__, Selector __cmd__, int index, CGRect contentRect);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_drawContentSuper(ObjCSuper __super__, UIPrintPageRenderer __self__, Selector __cmd__, int index, CGRect contentRect);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instm/UIPrintPageRenderer/drawContentForPageAtIndex:inRect:">- (void)drawContentForPageAtIndex:(NSInteger)index inRect:(CGRect)contentRect</a>
     * @since Available in iOS 4.2 and later.
     */
    public void drawContent(int index, CGRect contentRect) {
        if (customClass) { objc_drawContentSuper(getSuper(), this, drawContentForPageAtIndex$inRect$, index, contentRect); } else { objc_drawContent(this, drawContentForPageAtIndex$inRect$, index, contentRect); }
    }
    
    private static final Selector drawFooterForPageAtIndex$inRect$ = Selector.register("drawFooterForPageAtIndex:inRect:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_drawFooter(UIPrintPageRenderer __self__, Selector __cmd__, int index, CGRect footerRect);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_drawFooterSuper(ObjCSuper __super__, UIPrintPageRenderer __self__, Selector __cmd__, int index, CGRect footerRect);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instm/UIPrintPageRenderer/drawFooterForPageAtIndex:inRect:">- (void)drawFooterForPageAtIndex:(NSInteger)index inRect:(CGRect)footerRect</a>
     * @since Available in iOS 4.2 and later.
     */
    public void drawFooter(int index, CGRect footerRect) {
        if (customClass) { objc_drawFooterSuper(getSuper(), this, drawFooterForPageAtIndex$inRect$, index, footerRect); } else { objc_drawFooter(this, drawFooterForPageAtIndex$inRect$, index, footerRect); }
    }
    
    private static final Selector drawHeaderForPageAtIndex$inRect$ = Selector.register("drawHeaderForPageAtIndex:inRect:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_drawHeader(UIPrintPageRenderer __self__, Selector __cmd__, int index, CGRect headerRect);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_drawHeaderSuper(ObjCSuper __super__, UIPrintPageRenderer __self__, Selector __cmd__, int index, CGRect headerRect);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instm/UIPrintPageRenderer/drawHeaderForPageAtIndex:inRect:">- (void)drawHeaderForPageAtIndex:(NSInteger)index inRect:(CGRect)headerRect</a>
     * @since Available in iOS 4.2 and later.
     */
    public void drawHeader(int index, CGRect headerRect) {
        if (customClass) { objc_drawHeaderSuper(getSuper(), this, drawHeaderForPageAtIndex$inRect$, index, headerRect); } else { objc_drawHeader(this, drawHeaderForPageAtIndex$inRect$, index, headerRect); }
    }
    
    private static final Selector drawPageAtIndex$inRect$ = Selector.register("drawPageAtIndex:inRect:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_drawPage(UIPrintPageRenderer __self__, Selector __cmd__, int index, CGRect pageRect);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_drawPageSuper(ObjCSuper __super__, UIPrintPageRenderer __self__, Selector __cmd__, int index, CGRect pageRect);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instm/UIPrintPageRenderer/drawPageAtIndex:inRect:">- (void)drawPageAtIndex:(NSInteger)index inRect:(CGRect)pageRect</a>
     * @since Available in iOS 4.2 and later.
     */
    public void drawPage(int index, CGRect pageRect) {
        if (customClass) { objc_drawPageSuper(getSuper(), this, drawPageAtIndex$inRect$, index, pageRect); } else { objc_drawPage(this, drawPageAtIndex$inRect$, index, pageRect); }
    }
    
    private static final Selector drawPrintFormatter$forPageAtIndex$ = Selector.register("drawPrintFormatter:forPageAtIndex:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_drawPrintFormatter(UIPrintPageRenderer __self__, Selector __cmd__, UIPrintFormatter printFormatter, int index);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_drawPrintFormatterSuper(ObjCSuper __super__, UIPrintPageRenderer __self__, Selector __cmd__, UIPrintFormatter printFormatter, int index);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instm/UIPrintPageRenderer/drawPrintFormatter:forPageAtIndex:">- (void)drawPrintFormatter:(UIPrintFormatter *)printFormatter forPageAtIndex:(NSInteger)index</a>
     * @since Available in iOS 4.2 and later.
     */
    public void drawPrintFormatter(UIPrintFormatter printFormatter, int index) {
        if (customClass) { objc_drawPrintFormatterSuper(getSuper(), this, drawPrintFormatter$forPageAtIndex$, printFormatter, index); } else { objc_drawPrintFormatter(this, drawPrintFormatter$forPageAtIndex$, printFormatter, index); }
    }
    
    private static final Selector numberOfPages = Selector.register("numberOfPages");
    @Bridge(symbol = "objc_msgSend") private native static int objc_getNumberOfPages(UIPrintPageRenderer __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static int objc_getNumberOfPagesSuper(ObjCSuper __super__, UIPrintPageRenderer __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instm/UIPrintPageRenderer/numberOfPages">- (NSInteger)numberOfPages</a>
     * @since Available in iOS 4.2 and later.
     */
    public int getNumberOfPages() {
        if (customClass) { return objc_getNumberOfPagesSuper(getSuper(), this, numberOfPages); } else { return objc_getNumberOfPages(this, numberOfPages); }
    }
    
    private static final Selector printFormattersForPageAtIndex$ = Selector.register("printFormattersForPageAtIndex:");
    @Bridge(symbol = "objc_msgSend") private native static NSArray objc_getPrintFormatters(UIPrintPageRenderer __self__, Selector __cmd__, int pageIndex);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSArray objc_getPrintFormattersSuper(ObjCSuper __super__, UIPrintPageRenderer __self__, Selector __cmd__, int pageIndex);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instm/UIPrintPageRenderer/printFormattersForPageAtIndex:">- (NSArray *)printFormattersForPageAtIndex:(NSInteger)pageIndex</a>
     * @since Available in iOS 4.2 and later.
     */
    public NSArray getPrintFormatters(int pageIndex) {
        if (customClass) { return objc_getPrintFormattersSuper(getSuper(), this, printFormattersForPageAtIndex$, pageIndex); } else { return objc_getPrintFormatters(this, printFormattersForPageAtIndex$, pageIndex); }
    }
    
    private static final Selector prepareForDrawingPages$ = Selector.register("prepareForDrawingPages:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_prepareForDrawingPages(UIPrintPageRenderer __self__, Selector __cmd__, NSRange range);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_prepareForDrawingPagesSuper(ObjCSuper __super__, UIPrintPageRenderer __self__, Selector __cmd__, NSRange range);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../../../iPhone/Reference/UIPrintPageRenderer_Class/Reference/Reference.html#//apple_ref/occ/instm/UIPrintPageRenderer/prepareForDrawingPages:">- (void)prepareForDrawingPages:(NSRange)range</a>
     * @since Available in iOS 4.2 and later.
     */
    public void prepareForDrawingPages(NSRange range) {
        if (customClass) { objc_prepareForDrawingPagesSuper(getSuper(), this, prepareForDrawingPages$, range); } else { objc_prepareForDrawingPages(this, prepareForDrawingPages$, range); }
    }
    /*</methods>*/

}