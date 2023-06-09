//
//  CounterView.swift
//  iosApp
//
//  Created by Etienne Vautherin on 25/04/2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI
import KMMViewModelSwiftUI
import oucaKit

struct CuriosityView: View {
    @StateViewModel var viewModel = CuriosityViewModel()

    var body: some View {
        VStack(spacing: 16) {
            Text("Curiosity: \(viewModel.curiosity.name)")
                .font(.title)
                .fontWeight(.bold)
            
            Button(action: {
                viewModel.getCuriosity()
            }) {
                Text("Get Curiosity")
                    .font(.headline)
                    .foregroundColor(.white)
                    .padding()
                    .background(Color.blue)
                    .cornerRadius(10)
            }
        }
        .padding()
    }
}

struct CuriosityView_Previews: PreviewProvider {
    static var previews: some View {
        CuriosityView()
    }
}
