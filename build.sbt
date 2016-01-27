import LaikaKeys._
import GhPagesKeys._

LaikaPlugin.defaults

ghpages.settings

git.remoteRepo := "git@github.com:myyk/thats-racist.git"

git.gitCurrentBranch := "master"

mappings in synchLocal := (mappings in LaikaKeys.site in Laika).value
