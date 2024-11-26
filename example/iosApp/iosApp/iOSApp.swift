import SwiftUI
import shared


@main
struct iOSApp: App {

    @Environment(\.scenePhase)
    var scenePhase: ScenePhase

	var body: some Scene {
		WindowGroup {
            ContentView()
		}
	}
}