//
//  ViewController.swift
//  KotlinNativeiOS
//
//  Created by Teruaki Kinoshita on 2020/12/18.
//

import UIKit
import kmmsharedmodule

class ViewController: UIViewController {

    @IBOutlet weak var textLabel: UILabel!

    override func viewDidLoad() {
        super.viewDidLoad()

        textLabel.text = Greeting().greeting()
    }
}

